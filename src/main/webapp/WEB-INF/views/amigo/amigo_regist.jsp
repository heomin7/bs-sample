<%--
  Created by IntelliJ IDEA.
  User: minheo
  Date: 2017. 6. 12.
  Time: PM 2:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body style="margin: 10px">

    <h1>친구 등록하기</h1>


    <form action="/amigo/regist" method="post">
        <div class="input-group input-group-lg">
                        <span class="input-group-addon" id="sizing-addon1">
                            <i class="glyphicon glyphicon glyphicon-star" style="color: darkred"></i>친구 이름</span>
            <input type="text" name="name" class="form-control" placeholder="친구 이름" aria-describedby="sizing-addon1">
        </div><br>
        <div class="input-group input-group-lg">
                        <span class="input-group-addon" id="sizing-addon2">
                            <i class="glyphicon glyphicon glyphicon-star"></i>핸드폰</span>
            <input type="text" name="phone" class="form-control" placeholder="핸드폰" aria-describedby="sizing-addon2">
        </div><br>
        <div class="input-group input-group-lg">
                        <span class="input-group-addon" id="sizing-addon3">
                            <i class="glyphicon glyphicon glyphicon-star"></i>이메일</span>
            <input type="text" name="email" class="form-control" placeholder="이메일" aria-describedby="sizing-addon3">
        </div><br>
        <br>
        <input type="submit" value="등록" class="btn btn-lg btn-success" href="#" role="button">
    </form>

</body>
</html>
