<%--
  Created by IntelliJ IDEA.
  User: minheo
  Date: 2017. 6. 12.
  Time: AM 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body style="margin: 10px">

    <h1>${articleId}번 글이 조회되었습니다.</h1>
    <ul>
        <li>글 번호: ${article.articleId}</li>
        <li>제 목: ${article.title}</li>
        <li>작성자: ${article.writer}</li>
        <li>내 용: ${article.content}</li>
    </ul>
<a href="/bbs">전체보기</a>
<a href="/bbs/write">글 쓰기</a>
</body>
</html>
