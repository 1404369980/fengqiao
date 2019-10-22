<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/2 0002
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="formbookdelete" action="/returnBook" method="post">
    <table>
        <tr>
            <td>UsersID</td>
            <td><input type="text" name="UsersID" value=""></td>
        </tr>
        <tr>
            <td>BooksISBN</td>
            <td><input type="text" name="BooksISBN" value=""></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="删除"></td>

        </tr>
    </table>
</form>
</body>
</html>
