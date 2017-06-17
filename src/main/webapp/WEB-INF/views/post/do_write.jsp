<%--
  Created by IntelliJ IDEA.
  User: minheo
  Date: 2017. 6. 16.
  Time: PM 4:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>다음과 같이 등록되었습니다</h1>
<ul>
    <li>${post.title}</li>
    <li>${post.content}</li>
    <li>${post.memberId}</li>
</ul>

<br><br>
<a href="/post">전체 글 보기</a>
</body>
</html>
