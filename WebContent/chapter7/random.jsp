<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../header.html" %>

<%
	int x = (int)(Math.random() * 6);
	String[] unsei = {"大吉", "吉", "中吉", "小吉", "末吉", "凶"};
%>
<h1>おみくじアプリ</h1>
<p>お前の今日の運勢は</p>
<h2><%=unsei[x]%></h2>

<%@include file="../footer.html" %>