<%--
  Created by IntelliJ IDEA.
  User: minheo
  Date: 2017. 6. 17.
  Time: AM 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>
    <!-- Bootstrap core CSS -->
    <link href="/asset/css/bootstrap.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="/asset/css/dashboard.css" rel="stylesheet">

</head>
<body style="margin: 10px">

    <div class="container">
        <div class="jumbotron">
            <h1>회원가입</h1>
            <form action="/post/signup" method="post">
                <div class="row">
                    <div class="input-group input-group-lg">
                            <span class="input-group-addon" id="sizing-addon1">
                                <i class="glyphicon glyphicon glyphicon-star"></i>ID</span>
                        <input type="text" name="userId" class="form-control" aria-describedby="sizing-addon1">
                    </div><br>
                    <div class="input-group input-group-lg">
                            <span class="input-group-addon" id="sizing-addon2">
                                <i class="glyphicon glyphicon glyphicon-star"></i>Password</span>
                        <input type="password" name="password" class="form-control" aria-describedby="sizing-addon1">
                    </div><br>
                    <div class="input-group input-group-lg">
                            <span class="input-group-addon" id="sizing-addon3">
                                <i class="glyphicon glyphicon glyphicon-star"></i>Email</span>
                        <input type="text" name="email" class="form-control" aria-describedby="sizing-addon1">
                    </div><br>
                </div>
                <br>
                <input type="submit" value="회원가입" >
                <button><a href="/post">돌아가기</a></button>
            </form>

        </div>

        <footer class="footer">
            <p>&copy; 2016 Company, Inc.</p>
        </footer>
    </div> <!-- /container -->
</body>
</html>
