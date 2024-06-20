<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<form action ="mondai14">
<label>お名前：<input type="text" name="name"></label><br>
<label>ご年齢：<input type="text" name="age"></label><br>
性別：<label><input type="radio" name="gender" value="男性" checked>男性</label>
<label><input type="radio" name="gender" value="女性">女性</label>
<label><input type="radio" name="gender" value="その他">その他</label><br>
<input type="submit" value="送信">
</form>
<%@include file="../footer.html" %>