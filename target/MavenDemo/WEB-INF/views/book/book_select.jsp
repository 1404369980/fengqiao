<%--
  Created by IntelliJ IDEA.
  book: Administrator
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
<form name="loginForm" action="/book_select" method="post">
    <table>
        <tr>
            <td>查询  id</td>
            <td><input type="text" name="BooksISBN" value="1"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>

<tbody>
<tr>
    <td>${book.booksisbn}</td>
    <%--        <td><fmt:formatDate value="${base.stadate}" pattern="yyyy-MM-dd"/></td>//转换时间格式--%>
    <td>${book.booksname}</td>
</tr>
</tbody>


</body>
</html>
