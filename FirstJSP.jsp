<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Program</title>
</head>
<body>
	<%--
	<%
	class Employee{
		public int add(int a, int b){
			return a+b;
		}
	}
	%> <!-- Scriplet Tag -->
	<%! String name = "prakriti"; %> <!-- Declaration Tag -->
	<%=new Employee().add(23, 34) %> <!-- Expression Tag -->
	<%@ page language="java" %> <!-- page directive tag --> 
	 --%>
	
	
	
	<h2>Displaying 20 times</h2>
	<hr color=red size=3>
	<table>
		<%
		for(int i=1; i<=20; i++){
		%>
		<tr>
			<td> Hello Friends </td>
		</tr>
		<% } %>
	</table> 
</body>
</html>