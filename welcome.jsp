<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
</head>
<body>
	<%
		String name = request.getParameter("uname");
		out.print("Welcome "+ name);
		session.setAttribute("user", name);
	%>
	<a href="second.jsp">Second jsp page</a>
</body>
</html>