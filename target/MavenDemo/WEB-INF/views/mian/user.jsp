<%@ page import="com.example.pojo.Tuser" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/2 0002
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>图书管理系统</title>
</head>
<body>
<h1>${user.usersname}</h1>
<% %>
<%
    Tuser user =( (Tuser)request.getAttribute("user"));
    session.setAttribute("login_username",user.getUsersname());
    session.setAttribute("login_userid",user.getUsersid());
%>
<h1>你已经借的书有</h1>
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
<a href="/login/main_book">借书</a>
<a href="/login/return_book">还书</a>
</body>
</html>
