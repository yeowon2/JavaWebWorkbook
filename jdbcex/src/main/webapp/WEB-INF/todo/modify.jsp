<%--
  Created by IntelliJ IDEA.
  User: gudjl
  Date: 2024-01-13
  Time: 오후 6:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo - Modify or Remove</title>
</head>
<body>
    <form id="form1" method="post" action="/todo/modify">
        <div>
            <input type="text" name="tno" value="${dto.tno}" readonly>
        </div>
        <div>
            <input type="text" name="title" value="${dto.title}">
        </div>
        <div>
            <input type="date" name="dueDate" value="${dto.dueDate}">
        </div>
        <div>
            <input type="checkbox" name="finished" value="${dto.finished ? "checked" : ""}">
        </div>
        <div>
            <button type="submit">MODIFY</button>
        </div>
    </form>

    <form id="form2" method="POST" action="/todo/remove">
        <input type="hidden" name="tno" value="${dto.tno}" readonly>
        <div>
            <button type="submit">REMOVE</button>
        </div>
    </form>

</body>
</html>
