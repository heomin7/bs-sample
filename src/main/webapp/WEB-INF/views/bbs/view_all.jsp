<%--
  Created by IntelliJ IDEA.
  User: minheo
  Date: 2017. 6. 12.
  Time: AM 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/asset/css/bootstrap.css"/>
    <link rel="stylesheet" href="/asset/css/main.css">
    <!-- Latest compiled and minified CSS -->

</head>
<body>
    <h1>전체 보기 페이지입니다</h1>

    <c:forEach var="article" items="${list}">
   <ul>
           <li>글번호 : ${article.articleId}</li>
           <li>제목 : <a href="/bbs/${article.articleId}">${article.title}</a></li>
           <li>작성자 : ${article.writer}</li>
           <li>내용 : ${article.content}</li>
   </ul>
    </c:forEach>

    <script src="/asset/js/jquery-3.2.1.js"></script>
    <script src="/asset/js/bootstrap.js"></script>
</body>
</html>
