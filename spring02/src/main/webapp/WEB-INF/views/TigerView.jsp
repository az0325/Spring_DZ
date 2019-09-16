<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Tiger</h1>
	<h1>${name}</h1>
	<h1>${age}</h1>
	<h1>${salary}</h1>
	<br>
	<h1>----------------------------------------</h1>
	<% String name = (String)request.getAttribute("name"); %>
	<h1><%=name %></h1>
</body>
</html>