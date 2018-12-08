/**
 * WebEdge 2018
 */
package com.wedge.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Mai Thành Duy An
 *
 */
public class Home extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out("Hello",response);
		//outStream("Hello", response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
	
	private void out(String text, HttpServletResponse response) throws IOException {
		long start = System.nanoTime();
		PrintWriter out = response.getWriter();
		out.println(text);
		long end = System.nanoTime();
		System.out.println("Out: " + (end - start));
	}
	
	@SuppressWarnings("unused")
	private void outStream(String text, HttpServletResponse response) throws IOException {
		long start = System.nanoTime();
		ServletOutputStream out = response.getOutputStream();
		out.println(text);
		long end = System.nanoTime();
		System.out.println("Out: "+ (end - start));
	}
}
