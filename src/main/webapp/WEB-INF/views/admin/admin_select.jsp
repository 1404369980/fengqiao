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
<form name="formaminselect" action="/admin_select" method="post">
    <table>
        <tr>
            <td>AdminID</td>
            <td><input type="text" name="AdminID" value=""></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="注册"></td>
        </tr>
    </table>
</form>

<tbody>
<tr>
    <td>${admin.adminid}</td>
    <%--        <td><fmt:formatDate value="${base.stadate}" pattern="yyyy-MM-dd"/></td>//转换时间格式--%>
    <td>${admin.adminname}</td>
</tr>
</tbody>

</body>
</html>
