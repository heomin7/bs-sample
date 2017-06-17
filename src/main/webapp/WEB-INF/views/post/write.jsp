<%--
  Created by IntelliJ IDEA.
  User: minheo
  Date: 2017. 6. 16.
  Time: PM 3:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/main.css">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
    <div class="container">
        <div class="header clearfix">
            <nav>
                <ul class="nav nav-pills pull-right">
                    <li role="presentation" class="active"><a href="#">Home</a></li>
                    <li role="presentation"><a href="#">About</a></li>
                    <li role="presentation"><a href="#">Contact</a></li>
                </ul>
            </nav>
            <h3 class="text-muted">글쓰기 화면입니다</h3>
        </div>

        <div class="jumbotron">
            <h1>Post Write</h1>
            <form action="/post/write" method="post">
                <div class="row">
                    <div class="input-group input-group-lg">
                            <span class="input-group-addon" id="sizing-addon1">
                                <i class="glyphicon glyphicon glyphicon-star"></i>제목</span>
                        <input type="text" name="title" class="form-control" placeholder="제목" aria-describedby="sizing-addon1">
                    </div><br>
                    <div class="input-group input-group-lg">
                            <span class="input-group-addon" id="sizing-addon2">
                                <i class="glyphicon glyphicon glyphicon-star"></i>작성자</span>
                        <input type="text" name="memberId" class="form-control" placeholder="작성자" aria-describedby="sizing-addon1">
                    </div><br>
                    <div class="input-group input-group-lg">
                            <span class="input-group-addon" id="sizing-addon4">
                                <i class="glyphicon glyphicon glyphicon-star"></i>내용</span>
                        <textarea name="content" rows="10" cols="160"></textarea>
                    </div>
                </div>
                <br>
                <input type="submit" value="글 작성하기" >
            </form>

        </div>

        <footer class="footer">
            <p>&copy; 2016 Company, Inc.</p>
        </footer>

    </div> <!-- /container -->
</body>
</html>
