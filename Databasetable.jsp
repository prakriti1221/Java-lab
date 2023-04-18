<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Displaying College name</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

tr, td, th {
	padding: 12px 30px;
}
</style>
</head>
<body>
	<h1>List of CSIT Subjects:</h1>
	<table>
		<tr>
			<th>Subject ID</th>
			<th>Subject Name</th>
			<th>Subject Code</th>
		</tr>
		<%
		try {
			// Set up database connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/prakritidb";
			String user = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, user, password);

			// Prepare SQL statement to retrieve table data
			String query = "SELECT * FROM subject";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt("subject")%></td>
			<td><%=rs.getString("subject_name")%></td>
			<td><%=rs.getString("subject_code")%></td>
		</tr>
		<%
		}
		%>
	</table>
	<%
	} catch (Exception e) {
	out.println(e);
	}
	%>

</body>
</html>