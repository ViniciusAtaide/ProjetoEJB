<%-- 
    Document   : index
    Created on : 25/03/2014, 02:02:51
    Author     : Vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="teste">teste</a>
        <ul>
            
        <c:forEach var="cliente" items="${clientes}">
            <li>
                <a href="teste?acao=remove&id=${cliente.id}">${cliente.id}</a>
                ${cliente.nome} <br>
                <c:choose>
                    <c:when test="${empty cliente.vendas}">
                        Nenhuma venda
                    </c:when>
                </c:choose>
                <c:forEach items="${cliente.vendas}" var="venda">
                    ${venda}
                </c:forEach>
            </li>
        </c:forEach>
        </ul>

    </body>
</html>
