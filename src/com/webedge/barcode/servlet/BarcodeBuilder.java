/**
 * WebEdge 2018
 */
package com.webedge.barcode.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Mai Thành Duy An
 */
public class BarcodeBuilder extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;

	public static final int HEIGHT = 50;
	public static final int WIDTH = 200;

	public BarcodeBuilder() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		long start = System.nanoTime();
		response.setContentType("image/jpeg");
		OutputStream out = response.getOutputStream();

		BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = (Graphics2D) image.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);

		drawBar(image, 0);
		drawLine(image, 7);
		drawLine(image, 9);
		drawLine(image, 12);
		drawBar(image, 14);
		drawLine(image, 16);
		drawBar(image, 24);
		drawLine(image, 26);
		drawLine(image, 28);
		drawBar(image, 35);
		drawBar(image, 42);

		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial", Font.PLAIN, 10));
		g.drawString("0123456789", 0, 50);

		ImageIO.write(image, "jpeg", out);
		out.close();

		long end = System.nanoTime();
		System.out.println("Generate Barcode Image:  took " + (end - start) / 1000000 + " ms.");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	@SuppressWarnings("unused")
	private BufferedImage drawCode(BufferedImage image, int space, String bar) {
		Graphics2D g = (Graphics2D) image.getGraphics();
		g.setFont(new Font("0", Font.BOLD, 0));
		g.setColor(Color.BLACK);
		if (bar.equals("line")) {
			g.drawLine(space, 0, space, HEIGHT - 15);
		} else if (bar.equals("bar")) {
			for (int i = 0; i < 5; i++) {
				g.drawLine(space + i, 0, space + i, HEIGHT - 15);
			}
		}
		return image;
	}

	@SuppressWarnings("unused")
	private BufferedImage drawBar(BufferedImage image, int space) {
		return drawCode(image, space, "bar");
	}

	@SuppressWarnings("unused")
	private BufferedImage drawLine(BufferedImage image, int space) {
		return drawCode(image, space, "line");
	}
}
