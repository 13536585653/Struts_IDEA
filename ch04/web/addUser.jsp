<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/1/3
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <form action="user_add.action" method="post">
        <%--当后台要获取一个对象的时候，name前面要加上这个对象名--%>
            用户名：<input type="text" name="user.userName" value="愿望"><br>
            密码：<input type="password" name="user.password" value="123"><br>
            年龄：<input type="text" name="user.age" value="21"><br>
            爱好1：<input type="text" name="user.likes" value="看书"><br>
            爱好2：<input type="text" name="user.likes" value="运动"><br>
            身份证：<input type="text" name="user.card.cardNum" value="12425436362"><br>
            地址1：<input type="text" name="user.addrs[0].addr" value="江西"><br>
            地址2：<input type="text" name="user.addrs[1].addr" value="广东"><br>
        <input type="submit" value="addUser">
    </form>
</body>
</html>
