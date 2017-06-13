<%--
  Created by IntelliJ IDEA.
  User: minheo
  Date: 2017. 6. 12.
  Time: AM 10:51
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
            <h1>Jumbotron heading</h1>
            <form action="/bbs/write" method="post">
                <div class="row">
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon" id="sizing-addon1">
                            <i class="glyphicon glyphicon glyphicon-star"></i>글 번호</span>
                        <input type="text" name="articleId" class="form-control" placeholder="글번호" aria-describedby="sizing-addon1">
                    </div><br>
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon" id="sizing-addon2">
                            <i class="glyphicon glyphicon glyphicon-star"></i>제목</span>
                        <input type="text" name="title" class="form-control" placeholder="제목" aria-describedby="sizing-addon1">
                    </div><br>
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon" id="sizing-addon3">
                            <i class="glyphicon glyphicon glyphicon-star"></i>작성자</span>
                        <input type="text" name="writer" class="form-control" placeholder="작성자" aria-describedby="sizing-addon1">
                    </div>
                    <br>
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

        <div class="row marketing">
            <div class="col-lg-6">
                <h4>Subheading</h4>
                <p>Donec id elit non mi porta gravida at eget metus. Maecenas faucibus mollis interdum.</p>

                <h4>Subheading</h4>
                <p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Cras mattis consectetur purus sit amet fermentum.</p>

                <h4>Subheading</h4>
                <p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
            </div>

            <div class="col-lg-6">
                <h4>Subheading</h4>
                <p>Donec id elit non mi porta gravida at eget metus. Maecenas faucibus mollis interdum.</p>

                <h4>Subheading</h4>
                <p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Cras mattis consectetur purus sit amet fermentum.</p>

                <h4>Subheading</h4>
                <p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
            </div>
        </div>

        <footer class="footer">
            <p>&copy; 2016 Company, Inc.</p>
        </footer>

    </div> <!-- /container -->
</body>
</html>
