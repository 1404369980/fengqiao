<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/27 0027
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="formbookinsert" action="/admin_insert" method="get">
    <table>
        <tr>
            <td>AdminID</td>
            <td><input type="text" name="AdminID" value=""></td>
        </tr>
        <tr>
            <td>AdminName</td>
            <td><input type="text" name="AdminName" value=""></td>
        </tr>
        <tr>
            <td>AdminPwd</td>
            <td><input type="password" name="AdminPwd" value=""></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>
