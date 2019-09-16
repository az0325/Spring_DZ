<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>메인 페이지</title>
</head>
<body>
	<%=new Date()%>
	<h2>Hello World</h2>
	<a href="t1">링크1</a>
	<a href="t2">링크2</a>
	<a href="t3/?name=apple">링크3</a>
	<a href="t4/?name=apple&age=27">링크4</a>
	<a href="t5/?name=apple&age=27">링크5</a>
	<a href="t6/?name=apple&age=27">링크6</a>
	<a href="t7">링크7</a>
</body>