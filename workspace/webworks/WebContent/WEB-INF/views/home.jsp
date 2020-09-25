<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="nav"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="db"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Welcome to Home Page</h2>
	<h2><%=request.getParameter("uname")%></h2>
	<h2>
		Gender :
		<%=request.getParameter("gender")%></h2>

	<a href="writemail.jsp">Write</a>
</body>
</html>