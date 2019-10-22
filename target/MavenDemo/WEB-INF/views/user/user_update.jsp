<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/26 0026
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form name="loginForm" action="/user_insert" method="post">
    <table>
        <tr>
            <td>UsersID</td>
            <td><input type="text" name="UsersID" value=""></td>
        </tr>
        <tr>
            <td>UsersName</td>
            <td><input type="text" name="UsersName" value=""></td>
        </tr>
        <tr>
            <td>UsersPwd</td>
            <td><input type="password" name="UsersPwd" value=""></td>
        </tr>
        <tr>
            <td>UsersTel</td>
            <td><input type="text" name="UsersTel" value="1"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>
