<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/2/9
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UI Tag</title>
</head>
<body>
    <s:form action="login" method="post">
        <s:textfield name="userName" label="UserName"/>
        <s:password name="password" label="Password"/>
        <s:submit/>
    </s:form>
</body>
</html>
