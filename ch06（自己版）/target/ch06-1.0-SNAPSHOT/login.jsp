<%--
  Created by IntelliJ IDEA.
  User: wangl
  Date: 2017/1/4
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form method="post" action="loginuser">
        UserName:<input type="text" name="user.userName"/><br/>
        Password:<input type="password" name="user.passwd"/><br/>
        <input type="submit" value="login"/>
    </form>
</body>
</html>
