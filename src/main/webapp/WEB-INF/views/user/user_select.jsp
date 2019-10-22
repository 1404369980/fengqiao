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
    <form name="loginForm" action="/user_select" method="post">
        <table>
            <tr>
                <td>查询  id</td>
                <td><input type="text" name="user_id" value="1"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="登录"></td>
            </tr>
        </table>
    </form>


    <table>
        <tr>
            <td>${user.usersname}</td>
            <%--        <td><fmt:formatDate value="${base.stadate}" pattern="yyyy-MM-dd"/></td>//转换时间格式--%>
            <td>${user.usersid}</td>
            <td>${user.userstel}</td>
            <td>${user.userspwd}</td>
        </tr>
    </table>

</body>
</html>
