/**
 * WebEdge 2018
 */
package com.webedge.lotterystatistics;

import java.sql.Connection;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Mai Thành Duy An
 */
public class LotteryStatistics extends HttpServlet implements Servlet{

	private static final long serialVersionUID = 1L;

	
	protected void doPostRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Connection conn = Connector.getInstance().getConnect();
	}
}
