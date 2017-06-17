<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: minheo
  Date: 2017. 6. 16.
  Time: PM 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>All Post</title>
    <!-- Bootstrap core CSS -->
    <link href="/asset/css/bootstrap.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="/asset/css/dashboard.css" rel="stylesheet">

</head>
<body>

    <div id="navbar" class="navbar-collapse collapse">
        <ul class="nav navbar-nav navbar-right">
            <li><a href="/post/signup">회원가입</a></li>
        </ul>
    </div>

    <h1>전체 보기 페이지입니다</h1>
    <br><br><br>
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>순번</th>
                <th>제목</th>
                <th>작성일자</th>
                <th>작성자</th>
            </thead>

            <c:forEach var="post" items="${list}">
                <tbody>
                <tr>
                    <td>${post.postSeq}</td>
                    <td><a href="/post/${post.postSeq}">${post.title}</a></td>
                    <td>${post.writeDate}</td>
                    <td>${post.memberId}</td>
                </tr>
                </tbody>
            </c:forEach>
        </table>
    </div>
    <button><a href="/post/write">글쓰기</a></button>

</body>
</html>
