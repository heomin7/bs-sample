<%--
  Created by IntelliJ IDEA.
  User: minheo
  Date: 2017. 6. 17.
  Time: AM 9:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>${post.postSeq}번 글이 조회되었습니다.</h1>
    <br><br>
    <ul>
        <li>순번: ${post.postSeq}</li>
        <li>제목: ${post.title}</li>
        <li>내용: ${post.content}</li>
        <li>작성일: ${post.writeDate}</li>
        <li>작성자: ${post.memberId}</li>
    </ul>

    <a href="/post">글 전체 보기</a>
    <a href="/post/write">글쓰기</a>
</body>
</html>
