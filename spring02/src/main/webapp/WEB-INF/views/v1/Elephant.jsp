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
	<a href="t1?name=tiger&age=100">��ũ1</a>
	<%
		String s = "�ڳ���";
		int n = 100;
	%>

	<a href="t1?name=<%=s%>&age=<%=n%>">��ũ2</a>
	<a href="t1?name=<%=URLEncoder.encode(s, "UTF-8")%>&age=<%=n%>">��ũ3</a>
	<a href="t1?name=<%=URLEncoder.encode("�ڳ���", "UTF-8")%>&age=<%=n%>">��ũ4</a>
	<br />
</body>
</html>