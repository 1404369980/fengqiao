<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/27 0027
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="formbookdelete" action="/book_delete" method="post">
    <table>
        <tr>
            <td>输入要删除的图书的id</td>
            <td><input type="text" name="BooksISBN" value=""></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="删除"></td>

        </tr>
    </table>
</form>
</body>
</html>
