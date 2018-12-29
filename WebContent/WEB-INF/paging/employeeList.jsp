<%@page import="java.util.List"%>
<%@page import="com.webedge.jdbc.connection.pool.Employee"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<%
	List<Employee> listEmp = (List<Employee>) request.getAttribute("employees");
	Employee employee = null;
%>
<html>
<head>
<title>JSP Paging ..</title>
</head>

<body>
	<p>
		Employee List (<%=listEmp.size()%>)
	</p>
	<table border="1px solid;">
		<thead>
			<tr>
				<td>Emp No</td>
				<td>Emp Name</td>
				<td>Emp Job</td>
				<td>MRG</td>
				<td>Hire Date</td>
				<td>SAL</td>
				<td>COMM</td>
				<td>DEPT No</td>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < listEmp.size(); i++) {
			%>
			<tr>
				<td><%=listEmp.get(i).getEmpNo()%></td>
				<td><%=listEmp.get(i).getEmpName()%></td>
				<td><%=listEmp.get(i).getJob()%></td>
				<td><%=listEmp.get(i).getMgr()%></td>
				<td><%=listEmp.get(i).getHireDate()%></td>
				<td><%=listEmp.get(i).getSal()%></td>
				<td><%=listEmp.get(i).getComm()%></td>
				<td><%=listEmp.get(i).getDeptNo()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="9" align="center"><a>1</a></td>
			</tr>
		</tfoot>
	</table>
</body>
</html>