<%-- 
    Document   : produtos
    Created on : 26/10/2017, 13:45:44
    Author     : rkiguti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Produtos</h1>
        <c:forEach var="produto" items="${produtos}">
            <p>${produto.descricao}</p>
            <img src="${produto.imagem}">
        </c:forEach>
    </body>
</html>