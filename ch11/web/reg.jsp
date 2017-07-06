<%--
  Created by IntelliJ IDEA.
  User: guowei
  Date: 2017/2/13
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="color: green">用户注册</h1>
    <s:fielderror cssStyle="color:red;"/>
    <form method="post" action="reg.action">
        userName:<input type="text" name="user.userName" value="狼野"><br>
        password: <input type="password" name="user.password" value="wangYe123"><br>
        age:<input type="text" name="user.age" value="22"><br>
        birth:<input type="text" name="user.birth" value="2014-04-23"><br>
        email:<input type="text" name="user.email" value="786091203@qq.com"><br>
        cardNum:<input type="text" name="user.card.cardNum" value="36073419950121351X"><br>
        <input type="submit" value="submit">
    </form>
</body>
</html>
