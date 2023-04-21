<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session in JSP and Servlet</title>
</head>
<body>
	 <h1>Welcome, <%= session.getAttribute("username") %>!</h1>
    <form action="logout" method="post">
        <input type="submit" value="Logout">
    </form>
</body>
</html>