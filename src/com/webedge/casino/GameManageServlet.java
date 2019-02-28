/**
 * WebEdge 2018
 */
package com.webedge.casino;

import java.sql.Connection;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Mai Thành Duy An
 */
public class GameManageServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;
	Logger log = LoggerFactory.getLogger(this.getClass().getName());

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		System.out.println("Call Game Manager.");
		HttpSession session = (HttpSession) request.getAttribute("session");
		if (session == null) {
			session = SessionUtil.getSession(request);
		}
		System.out.println("Session ID: " + session.getId());

		Connection conn = GameUtil.getConnection();
		System.out.println("--> " + GameUtil.getCurrentDate() + "Connected Database.");
		Thread casinoMainThread = Thread.currentThread();
		System.out.println("Thread : " + casinoMainThread.getName()
				+ casinoMainThread.getContextClassLoader().getResource("").getPath());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {

	}
}
