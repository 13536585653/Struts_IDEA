<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/2/8
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>注意：在使用ognl的时候，要获取除值栈以外的数据信息，ognl表达式前面必须加上#号</h2>
    <p style="color: red">从actionContext中获取数据</p>
        UserName:<s:property value="#u1.userName"/><br>
        或者UserName:<s:property value="user.userName"/><br>
        Card:<s:property value="#u1.card.cardNum"/>
    <p style="color: red">从值栈中获取u1</p>
        UserName:<s:property value="userName"/><br>
        Card:<s:property value="card.cardNum"/>
    <p style="color: red">从请求作用域中获取数据</p>
        UserName:<s:property value="#request.u1.userName"/><br>
        Card:<s:property value="#request.u1.card.cardNum"/>
    <p style="color: red">从会话作用域中获取数据</p>
        UserName:<s:property value="#session.u1.userName"/><br>
        Card:<s:property value="#session.u1.card.cardNum"/>
    <p style="color: red">从上下文作用域中获取数据</p>
        UserName:<s:property value="#application.u1.userName"/><br>
        Card:<s:property value="#application.u1.card.cardNum"/>
</body>
</html>
