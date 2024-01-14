<%--
  Created by IntelliJ IDEA.
  User: gudjl
  Date: 2024-01-08
  Time: 오후 5:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>todo-list</title>
</head>
<body>
<h1>TODO List</h1>

<ul>
    <c:forEach var="dto" items="${List}">
        <%--items : 배열/리스트를 의미, var : 반복문 내에서만 사용하는 변수의 이름--%>
        <li>${dto}</li>
    </c:forEach>
</ul>

</body>
</html>
