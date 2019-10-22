<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/2 0002
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="loginForm" action="/borrow_select" method="post">
    <table>
        <tr>
            <td>UsersID</td>
            <td><input type="text" name="UsersID" value=""></td>
        </tr>
        <tr>
            <td>BooksISBN</td>
            <td><input type="text" name="BooksISBN" value=""></td>
        </tr>

        <%--<tr>--%>
            <%--<td>BooksISBN</td>--%>
            <%--<td><input type="text" name="BooksISBN" value=""></td>--%>
        <%--</tr>--%>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="查找"></td>
        </tr>
    </table>
</form>

<table>
    <thead>
    <th>booksisbn</th>
    <th>usersid</th>

    </thead>
    <tbody>
    <c:forEach items="${list_borrow}" var="borrow">
        <tr>
            <td>${borrow.booksisbn}</td>
                <%--        <td><fmt:formatDate value="${base.stadate}" pattern="yyyy-MM-dd"/></td>//转换时间格式--%>
            <td>${borrow.usersid}</td>
        </tr>

    </c:forEach>
    </tbody>
</table>
</tbody>
</body>
</html>
