<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/2/9
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>If Tag</title>
</head>
<body>
    <p style="color: red">使用if控制标签</p>
        <s:set var="age">11</s:set>
        <s:if test="#age >= 18">
            <p>已成年</p>
        </s:if>
        <s:elseif test="#age <18">
            <p>未成年</p>
        </s:elseif>
        <s:else>老了</s:else>
</body>
</html>
