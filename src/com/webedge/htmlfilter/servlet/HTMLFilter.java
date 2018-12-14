/**
 * WebEdge 2018
 */
package com.webedge.htmlfilter.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webedge.htmlfilter.model.HTMLModel;

/**
 * @author Mai Thành Duy An
 */
public class HTMLFilter extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;
	
	String source = "< ScripT > alert() </ scrIpt >";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HTMLModel model = new HTMLModel();
		model.setTopic(source);
		request.setAttribute("model", model);
		request.getRequestDispatcher("/WEB-INF/htmlfilter/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
