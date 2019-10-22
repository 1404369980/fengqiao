<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/27 0027
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form name="formbookinsert" action="/book_insert" method="get">
    <table>
        <tr>
            <td>BooksISBN</td>
            <td><input type="text" name="BooksISBN" value=""></td>
        </tr>
        <tr>
            <td>BooksName</td>
            <td><input type="text" name="BooksName" value=""></td>
        </tr>
        <tr>
            <td>BooksAuthor</td>
            <td><input type="text" name="BooksAuthor" value=""></td>
        </tr>
        <tr>
            <td>BooksType</td>
            <td><input type="text" name="BooksType" value=""></td>
        </tr>
        <tr>
            <td>BooksPrice</td>
            <td><input type="text" name="BooksPrice" value=""></td>
        </tr>
        <tr>
            <td>BooksPublisher</td>
            <td><input type="text" name="BooksPublisher" value=""></td>
        </tr>
        <tr>
            <td>BooksStore</td>
            <td><input type="text" name="BooksStore" value=""></td>
        </tr>
        <tr>
            <td>BooksTotal</td>
            <td><input type="text" name="BooksTotal" value=""></td>
        </tr>

        <tr>
            <td colspan="2" align="center"><input type="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>
