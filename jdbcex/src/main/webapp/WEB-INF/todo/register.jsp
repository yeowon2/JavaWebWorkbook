<%--
  Created by IntelliJ IDEA.
  User: gudjl
  Date: 2024-01-13
  Time: 오후 5:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo-Register</title>
</head>
<body>
  <form method="post" action="/todo/register">
    <div>
      <input type="text" name="title" placeholder="INSERT TITLE">
    </div>
    <div>
      <input type="date" name="dueDate">
    </div>
    <div>
      <button type="reset">RESET</button>
      <button type="submit">REGISTER</button>
    </div>
  </form>
</body>
</html>
