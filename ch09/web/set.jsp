<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/2/9
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Set Tag</title>
</head>
<body>
    <p style="color: red">set标签结合property标签</p>
    <!--var表示变量名，value表示需要设置的值，scope表示要保存到哪个作用域-->
    <!--当不指定scope作用域的时候，默认将数据会放在请求作用域以及ActionContext中-->
    <s:set var="uname" scope="request">user1</s:set>
    <s:set var="uname">user2</s:set>

    <br>
    <p style="color: red">使用property标签获取值</p>
    uName:<s:property value="#request.uname"/><br>
    uName:<s:property value="uname"/>
</body>
</html>
