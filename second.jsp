<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<%
		String name = (String)session.getAttribute("user");
		out.print("Hello "+name);
	%>

</body>
</html>