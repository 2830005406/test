<%@page pageEncoding="utf-8" isELIgnored="false" contentType="text/html; charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <table align="center" cellpadding="0" cellspacing="0" border="1" width="70%" style="text-align: center">
        <c:forEach items="${requestScope.all}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.sex}</td>
            <td><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
            <td></td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>