<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/2/9
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="download.action?fileName=<s:property value='uploadFileFileName'/>">
    <!--显示文件名，并可以执行下载操作-->
    <s:property value="uploadFileFileName"/>
</a>
</body>
</html>
