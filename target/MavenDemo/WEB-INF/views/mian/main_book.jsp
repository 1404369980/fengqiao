<%--
  Created by IntelliJ IDEA.
  book: Administrator
  Date: 2019/4/27 0027
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <th>booksisbn</th>
    <th>booksname</th>
    <th>booksauthor</th>
    <th>booksprice</th>
    <th>bookspublisher</th>
    <th>bookstype</th>
    <th>booksstore</th>
    <th>bookstotal</th>
    </thead>
    <tbody>
    <c:forEach items="${list_book}" var="book">
        <tr>
            <td>${book.booksisbn}</td>
                <%--        <td><fmt:formatDate value="${base.stadate}" pattern="yyyy-MM-dd"/></td>//转换时间格式--%>
            <td>${book.booksname}</td>
            <td>${book.booksauthor}</td>
            <td>${book.booksprice}</td>
            <td>${book.bookspublisher}</td>
            <td>${book.bookstype}</td>
            <td>${book.booksstore}</td>
            <td>${book.bookstotal}</td>
            <td><a href="/borrow_book?BooksISBN=${book.booksisbn}&login_userid=${login_userid}">借书</a> </td>
        </tr>

    </c:forEach>
    </tbody>
</table>

</body>
</html>
