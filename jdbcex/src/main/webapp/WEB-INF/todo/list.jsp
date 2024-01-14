<%--
  Created by IntelliJ IDEA.
  User: gudjl
  Date: 2024-01-13
  Time: 오후 4:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Todo-List</title>
</head>
<body>
    <h1>Todo-List</h1>

    <ul>
        <c:forEach items="${dtoList}" var="dto">
            <li>
                <span><a href="/todo/read?tno=${dto.tno}">${dto.tno}</a></span>
                <span>${dto.title}</span>
                <span>${dto.dueDate}</span>
                <span>${dto.finished? "DONE" : "NOT YET"}</span>
            </li>
        </c:forEach>
    </ul>

    <a href="/todo/register">Go to Register</a>
</body>
</html>
