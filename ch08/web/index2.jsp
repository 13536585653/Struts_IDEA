<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/2/8
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--引入Struts标签-->
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--使用Struts标签和ognl表达式取值-->
    <p>从值栈中的action对象获取user</p>
    UserName:<s:property value="user.userName"/><br>
    Card:<s:property value="user.card.cardNum"/><br>

    <p>直接从值栈中找出另外一个user</p>
    UserName:<s:property value="userName"/><br>
    Card:<s:property value="card.cardNum"/>
</body>
</html>
