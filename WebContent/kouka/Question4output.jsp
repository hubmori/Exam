<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

こんにちは。こちらはフォワードされたJSPです。<br>
入力いただいた内容は以下でよろしいでしょうか。<br>
<br>
お名前：<%=request.getParameter("name") %><br>
ご年齢：<%=request.getParameter("name") %><br>
性別：<%=request.getParameter("name") %><br>

<%@include file="../footer.html" %>