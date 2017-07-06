<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/1/4
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
    request作用域:<br>
    ${requestScope.user.userName}<br>
    ${requestScope.user.password}<br>
    session作用域:<br>
    ${sessionScope.user.userName}<br>
    ${sessionScope.user.password}<br>
    application作用域:<br>
    ${applicationScope.user.userName}<br>
    ${applicationScope.user.password}<br>
</body>
</html>
