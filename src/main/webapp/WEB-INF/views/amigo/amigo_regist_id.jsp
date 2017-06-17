<%--
  Created by IntelliJ IDEA.
  User: minheo
  Date: 2017. 6. 12.
  Time: PM 5:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>${amigoId}번 글이 조회되었습니다.</h1>

    <ul>
        <li>${amigo.amigoId}</li>
        <li>${amigo.name}</li>
        <li>${amigo.phone}</li>
        <li>${amigo.email}</li>
    </ul>
    <a href="/amigo">전체보기</a>
    <a href="/amigo/regist">글 쓰기</a>
</body>
</html>
