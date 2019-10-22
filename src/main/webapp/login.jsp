<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/21 0021
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>login</title>
</head>
<body>
<h1>登录</h1>
<hr>
<form name="loginForm" action="/login/login_user" method="post">
    <table>
    <tr>
        <td>用户名</td>
        <td><input type="text" name="username" value=""></td>
    </tr>
    <tr>
        <td>密码</td>
        <td><input type="password" name="password" value=""></td>
    </tr>
    <tr>
        <td colspan="2" align="center"><input type="submit" value="登录"></td>
        <td><a href="./register.jsp">注册</a> </td>
    </tr>
</table>
</form>
 <%--<a href="jspbean2.jsp?mypass=fengqiao">url传参数</a>--%>
<%--<input type="button" name="" value="" onclick="javascript:window.location='url';" />--%>
<%--<a href="/user_insert">user_insert</a>--%>

</body>
</html>
