<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/26 0026
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="loginForm" action="/user_delete" method="post">
    <table>
        <tr>
            <td>输入想要删除的用户ID</td>
            <td><input type="text" name="id" value=""></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="删除"></td>

        </tr>
    </table>
</form>
</body>
</html>
