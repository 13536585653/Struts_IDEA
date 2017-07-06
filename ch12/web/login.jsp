<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/2/14
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="color: green">用户登录</h1>
    <form method="post" action="login.action">
        UserName:<input type="text" name="user.userName"><br>
        Password:<input type="password" name="user.password"><br>
        <input type="submit" value="submit">
        <!--添加一个令牌标签，并且一定是放在form表单里面一块提交过去-->
        <s:token/>
    </form>
</body>
</html>
