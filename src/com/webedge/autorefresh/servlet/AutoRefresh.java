package com.webedge.autorefresh.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AutoRefresh extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		performTask(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		performTask(request, response);
	}

	private void performTask(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.addHeader("Refresh", "5");
		PrintWriter out = response.getWriter();
		String date = new Date().toString();
		out.println("TestServlet says hi at " + date);
		System.out.println("Date :" + date);
	}
}
