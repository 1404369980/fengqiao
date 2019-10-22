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
<table>
    <thead>
    <th>booksisbn</th>
    <th>usersid</th>

    </thead>
    <tbody>
    <c:forEach items="${list_borrow}" var="borrow">
        <tr>
            <td>${borrow.usersid}</td>
                <%--        <td><fmt:formatDate value="${base.stadate}" pattern="yyyy-MM-dd"/></td>//转换时间格式--%>
            <td>${borrow.booksisbn}</td>
        </tr>

    </c:forEach>
    </tbody>
</table>
</body>
</html>
