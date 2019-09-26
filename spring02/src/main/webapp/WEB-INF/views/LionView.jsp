<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Lion 안녕</h1>
	<h1>${add}</h1>
	<h1>${age}</h1>

	<hr>

	<c:forEach var="ii" items="${ar}">
		<li>${ii}</li>
	</c:forEach>

	<table>
		<tr>
			<td>1</td>
			<td>2</td>
			<td>3</td>
		</tr>
		<tr>
			<td>4</td>
			<td>5</td>
			<td>6</td>
		</tr>
	</table>

	<table>
		<tr>
			<c:forEach var="ii" items="${ar}">
				<td>${ii}</td>
			</c:forEach>
		</tr>
	</table>

	<h2>${app.add}</h2>
	<h2>${app.age}</h2>

	<c:forEach var="i" items="${a}">
		<li>${i.add}${i.age}</li>
	</c:forEach>

	<c:forEach var="iii" items="${list}">
		<li>${iii}</li>
	</c:forEach>

	<c:forEach var="i" items="${li}">
		<li>${i.add}${i.age}</li>
	</c:forEach>
</body>
</html>