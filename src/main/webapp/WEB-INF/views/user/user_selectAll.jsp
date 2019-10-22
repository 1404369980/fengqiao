<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/27 0027
  Time: 15:21
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
    <th>usersname</th>
    <th>usersid</th>
    <th>userstel</th>
    <th>userspwd</th>
    </thead>
    <tbody>
    <c:forEach items="${list_user}" var="user">
        <tr>
            <td>${user.usersname}</td>
                <%--        <td><fmt:formatDate value="${base.stadate}" pattern="yyyy-MM-dd"/></td>//转换时间格式--%>
            <td>${user.usersid}</td>
            <td>${user.userstel}</td>
            <td>${user.userspwd}</td>
        </tr>

    </c:forEach>
    </tbody>
</table>
</body>
</html>
