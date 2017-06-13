<%--
  Created by IntelliJ IDEA.
  User: minheo
  Date: 2017. 6. 13.
  Time: PM 2:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>전체 보기 페이지입니다</h1>

<c:forEach var="amigo" items="${list}">
    <ul>
        <li>이 름 : ${amigo.name}</li>
        <li>핸드폰 : <a href="/bbs/${amigo.name}">${amigo.phone}</a></li>
        <li>이메일 : ${amigo.email}</li>
    </ul>
</c:forEach>
</body>
</html>
