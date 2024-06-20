<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<p>Hello！</p>
<p>こんにちは！</p>
<%-- <%-- コード --%> ：スクリプトレット：HTML内にJavaのコードを埋め込む --%>
<p>
<%
out.println("こんにちは");
out.println(new java.util.Date()); %>
</p>
<%@include file="../footer.html" %>