package com.webedge.jdbc.connection.pool;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.webedge.log.LogUtil;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected ServletContext context;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
		super();
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init Servlet");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		long start = System.currentTimeMillis();
		String sql = "select * from emp";
		Connection conn = null;
		List<Employee> employees = null;
		try {
			// conn = HikariCP.getConnection(); //took 10-11ms
			// conn = DBCP.getInstance().getConnection(); //took 64-81 ms
			// conn = C3P0.getInstance().getConnection(); //took 7-9ms
			// conn = Bone_CP.getInstance().getConnection(); // took 7-10ms
			conn = SingleDBAccess.getConnection(); // took 3-5 ms
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			employees = new ArrayList<>();
			Employee employee = null;
			while (rs.next()) {
				employee = new Employee();
				employee.setEmpNo(rs.getInt("empno"));
				employee.setEmpName(rs.getString("ename"));
				employee.setJob(rs.getString("job"));
				employee.setMgr(rs.getInt("mgr"));
				employee.setHireDate(rs.getDate("hiredate"));
				employee.setSal(rs.getInt("sal"));
				employee.setComm(rs.getInt("comm"));
				employee.setDeptNo(rs.getInt("deptno"));
				employees.add(employee);
			}
			request.setAttribute("employees", employees);

		} catch (Exception e) {
			e.printStackTrace();
			LogUtil.Writer(e.getMessage());
		}
		long end = System.currentTimeMillis() - start;
		System.out.println("Took: " + end + " ms.");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paging/employeeList.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
