/**
 * WebEdge 2018
 */
package com.webedge.casino;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Mai Thành Duy An
 */
public class SessionUtil {
	
	public static final HttpSession getSession(HttpServletRequest request) {
		return getSession(request, true);
	}

	public static final HttpSession getSession(HttpServletRequest request, boolean create) {
		if (request == null)
			return null;
		HttpSession session = request.getSession(create);
		if (session == null)
			return null;

		return session;
	}
}
