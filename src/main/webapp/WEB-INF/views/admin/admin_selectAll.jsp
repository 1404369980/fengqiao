<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/27 0027
  Time: 17:21
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
    <th>adminid</th>
    <th>adminname</th>
    <th>adminpwd</th>
    <th>adminaddtime</th>
    </thead>
    <tbody>
    <c:forEach items="${list_admin}" var="admin">
        <tr>
            <td>${admin.adminid}</td>
                <%--        <td><fmt:formatDate value="${base.stadate}" pattern="yyyy-MM-dd"/></td>//转换时间格式--%>
            <td>${admin.adminname}</td>
            <td>${admin.adminpwd}</td>
            <td>${admin.adminaddtime}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
