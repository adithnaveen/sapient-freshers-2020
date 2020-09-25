<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="./MultiplicationForm.html" %>

	<%
		// all your java code goes here 
	// handle exception 
		Date d  = new Date(); 
	int val = Integer.parseInt(request.getParameter("val"));
	%>
	<table border="2">

		<%
			// 10 x 1 = 10 
		for (int i = 1; i <= 10; i++) {
			
			%> 
		
		<tr><td>
			<%= val %>  X  <%= i  %> = <%= val * i %>
		</td></tr>
		<%}
		%>

	</table>
</body>
</html>