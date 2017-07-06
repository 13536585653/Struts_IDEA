<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/2/9
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!--使用Struts错误信息提示的标签，会自动输出错误信息-->
    <%--<s:fielderror cssStyle="color: red"/>--%>
    <!--使用el表达式来获取错误信息,uploadFile对应input的name，他是一个数组，当多文件上传时，应该
    循环遍历这个数组来显示提示信息的内容-->
    <font color="red">${fieldErrors.uploadFile[0]}</font>
    <form method="post" action="upload.action" enctype="multipart/form-data">
        File&nbsp;:<input type="file" name="uploadFile"><br>
        File2 :<input type="file" name="uploadFile"><br>
        Readme:<input title="readme" type="text" name="readme"><br>
        <input type="submit" value="submit">
    </form>
</body>
</html>
