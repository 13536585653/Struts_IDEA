
<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/2/9
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Bean Tag</title>
</head>
<body>
    <p style="color: red">使用bean标签操作JavaBean</p>
    <!--name指定JavaBean的完整类名，var指定一个变量名
    (注意:当指定了var，那么创建出来的对象会放在ActionContext中，如果没有指定var，那么默认放在值栈中
    如果在值栈中，那么就只能在s:bean标签中进行取值)-->
    <s:bean name="org.entity.Users" var="user">
        <!--使用param标签给bean的属性赋值(注意：如果是非数字字符串，赋值的时候需要加上单引号)-->
        <s:param name="userName" value="'langye'"/>
        <s:param name="password" value="123"/>

        <b>如果在值栈中，那么就只能在s:bean标签中进行取值</b><br>
        UserName:<s:property value="userName"/><br>
        Password:<s:property value="password"/><br><br>
    </s:bean>

    <b>使用property在actionContext中进行取值</b>
    UserName:<s:property value="#user.userName"/><br>
    Password:<s:property value="#user.password"/>
</body>
</html>
