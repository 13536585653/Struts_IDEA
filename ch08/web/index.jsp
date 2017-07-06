<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/2/8
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--struts作用域取值,只放在请求作用域--%>
${requestScope.user.userName}
<%--${sessionScope.user.userName}
${applicationScope.user.userName}--%><br><br>
<%--小脚本取值
<%= request.getAttribute("user")%>--%>
Hello,<font color="red" size="40px">${user.userName}</font><br>
hello,<font color="green" size="40px">${userName}</font>
</body>
</html>
