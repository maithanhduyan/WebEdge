/**
 * WebEdge 2018
 */
package com.webedge.captcha.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Mai Thành Duy An
 */
public class CaptchaBuilder extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;

	public static final String[] ALPHABET = { "A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g", "H",
			"h", "I", "j", "K", "k", "L", "l", "M", "m", "N", "n", "O", "o", "P", "p", "Q", "q", "R", "r", "S", "s",
			"T", "t", "U", "u", "V", "v", "X", "x", "Y", "y", "Z", "z" };
	public static final int[] NUMBER = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static final String ENCCODING = "UTF-8";

	private Random rand;

	public CaptchaBuilder() {
		rand = new Random();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		long start = System.nanoTime();
		String captcha = generateCaptcha();
		response.setCharacterEncoding(ENCCODING);
		response.setContentType("image/jpeg");
		OutputStream out = response.getOutputStream();
		int width = 200;
		int height = 30;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		// get drawing context
		Graphics2D g = (Graphics2D) image.getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, width, height);
		// draw a string
		g.setColor(Color.WHITE);
		g.setFont(new Font("Dialog", Font.PLAIN, 28));
		g.drawString(captcha, 50, 25);
		// draw a line
		g.setColor(Color.RED);
		g.setFont(new Font("Dialog", Font.BOLD, 18));
		g.drawLine(random(width), random(height / 2), random(width), random(height / 2));
		// draw a line
		g.setColor(Color.GREEN);
		g.setFont(new Font("Dialog", Font.BOLD, 18));
		g.drawLine(random(width), random(height / 2), random(width), random(height / 2));
		// draw a line
		g.setColor(Color.WHITE);
		g.setFont(new Font("Dialog", Font.BOLD, 18));
		g.drawLine(random(width), random(height / 2), random(width), random(height / 2));
		// draw a line
		g.setColor(Color.RED);
		g.setFont(new Font("Dialog", Font.BOLD, 28));
		g.drawLine(0, 15, 200, 15);

		// draw a border
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, width - 1, height - 1);

		// dispose context
		g.dispose();
		// send back image to the client
		ImageIO.write(image, "jpeg", out);
		out.close();
		long end = System.nanoTime();
		System.out.println("Generate Captcha Image: " + captcha + " took " + (end - start) / 1000000 + " ms.");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	@SuppressWarnings("unused")
	private String generateCaptcha() {
		int captchaLength = 3;
		Random serverSeed = new Random();
		Random randomSource = new Random(serverSeed.nextLong());
		StringBuilder captcha = new StringBuilder();
		for (int i = 0; i < captchaLength; i++) {
			captcha.append(ALPHABET[randomSource.nextInt(ALPHABET.length)]);
			captcha.append(NUMBER[randomSource.nextInt(NUMBER.length)]);
		}
		return captcha.toString();
	}

	private int random(int limit) {
		return rand.nextInt(limit);
	}
}
