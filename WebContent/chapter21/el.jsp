<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<p>${product.id}:${product.name}:${product.price}</p>
<p>${data}</p>
<p>${product}</p>
<p>${product.getTaxPrice()}</p>

<%@include file="../footer.html" %>