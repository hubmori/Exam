<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@include file="../header.html" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Question6のjspです</title>
</head>
<body>
	<% System.out.println("Question61.jspの処理➀"); %>
	<h1>Question61.jsp</h1>
	<p>Question63.jspのインクルード</p>
	<%@include file="./Question63.jsp" %>
	<p>Question62.jspのインクルード</p>
	<%@include file="./Question62.jsp" %>
	<% System.out.println("Question61.jspの処理➁"); %>
</body>
</html>
<%@include file="../footer.html" %>