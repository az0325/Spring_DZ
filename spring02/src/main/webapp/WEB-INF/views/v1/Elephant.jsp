<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href="t1?name=tiger&age=100">링크1</a>
	<%
		String s = "코끼리";
		int n = 100;
	%>

	<a href="t1?name=<%=s%>&age=<%=n%>">링크2</a>
	<a href="t1?name=<%=URLEncoder.encode(s, "UTF-8")%>&age=<%=n%>">링크3</a>
	<a href="t1?name=<%=URLEncoder.encode("코끼리", "UTF-8")%>&age=<%=n%>">링크4</a>
	<br />
</body>
</html>