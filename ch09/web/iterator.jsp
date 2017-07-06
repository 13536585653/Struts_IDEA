<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/2/9
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>使用iterator标签，value指定要遍历的集合，是一个ognl表达式<br>
    var声明一个从集合遍历出来的对象别名，遍历出来的对象放在ActionContext中</p>
    <table border="1px">
        <tr>
            <td>UserName</td>
            <td>Password</td>
        </tr>
        <!--这里的u存放在actionContext中-->
        <s:iterator value="#list" var="u">
            <tr>
                <td><s:property value="#u.userName"/></td>
                <td><s:property value="#u.password"/></td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>
