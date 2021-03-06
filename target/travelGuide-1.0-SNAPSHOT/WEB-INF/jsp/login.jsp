<%--
  Created by IntelliJ IDEA.
  User: BeForever
  Date: 16/12/19
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
  %>
  <base href="<%=basePath%>">
  <meta charset="utf-8"/>
  <link href="css/style.css" rel="stylesheet" type="text/css"  media="all" />
  <title></title>
  <script src="js/jquery-2.2.4.min.js"></script>
  <script>
    $(document).ready(function () {

      $(".form").slideDown(500);

      $("#landing").addClass("border-btn");

      $("#registered").click(function () {
        $("#landing").removeClass("border-btn");
        $("#landing-content").hide(500);
        $(this).addClass("border-btn");
        $("#registered-content").show(500);

      })

      $("#landing").click(function () {
        $("#registered").removeClass("border-btn");
        $(this).addClass("border-btn");

        $("#landing-content").show(500);
        $("#registered-content").hide(500);
      })
    });
  </script>
  <style>
    * {
      margin: 0;
      padding: 0;
      font-family: "Arial";
    }

    body {
      background-color:#A9B0CC;
    }

    .form {
      position: absolute;
      top: 50%;
      left: 50%;
      margin-left: -185px;
      margin-top: -210px;
      height: 420px;
      width: 340px;
      font-size: 18px;
      -webkit-box-shadow: 0px 0px 10px #A6A6A6;
      background: #fff;
    }

    .border-btn {
      border-bottom: 1px solid #ccc;
    }

    #landing,
    #registered {
      float: left;
      text-align: center;
      width: 170px;
      padding: 15px 0;
      color: #545454;
    }

    #landing-content {
      clear: both;
    }

    .inp {
      height: 30px;
      margin: 0 auto;
      margin-bottom: 30px;
      width: 200px;
    }

    .inp > input {
      text-align: center;
      height: 30px;
      width: 200px;
      margin: 0 auto;
      transition: all 0.3s ease-in-out;
    }

    .login {
      border: 2px solid #A6A6A6;
      color: #A6A6A6;
      height: 30px;
      width: 202px;
      text-align: center;
      font-size: 13.333333px;
      margin-left: 70px;
      line-height: 30px;
      margin-top: 30px;
      transition: all 0.3s ease-in-out;
    }

    .login:hover {
      background: #A6A6A6;
      color: #1cb795;
    }

    #photo {
      border-radius: 80px;
      border: 1px solid #ccc;
      height: 80px;
      width: 80px;
      margin: 0 auto;
      overflow: hidden;
      clear: both;
      margin-top: 30px;
      margin-bottom: 30px;
    }

    #photo > img:hover {
      -webkit-transform: rotateZ(360deg);
      -moz-transform: rotateZ(360deg);
      -o-transform: rotateZ(360deg);
      -ms-transform: rotateZ(360deg);
      transform: rotateZ(360deg);
    }

    #photo > img {
      height: 80px;
      width: 80px;
      -webkit-background-size: 220px 220px;
      border-radius: 60px;
      -webkit-transition: -webkit-transform 1s linear;
      -moz-transition: -moz-transform 1s linear;
      -o-transition: -o-transform 1s linear;
      -ms-transition: -ms-transform 1s linear;
    }

    #registered-content {
      margin-top: 40px;
      display: none;
    }

    .fix {
      clear: both;
    }

    .form {
      display: none;
      background: inherit;
      background-color: #1cb795;
      background-size: cover;
    }
  </style>
</head>

<body>

<div class="form">
  <div id="landing">Login</div>
  <div id="registered">Register</div>
  <div class="fix"></div>
  <div id="landing-content">
    <div id="photo"><img src="images/photo.jpg"/></div>
    <div class="inp"><input type="text" placeholder="Username Please"/></div>
    <div class="inp"><input type="password" placeholder="Password Please"/></div>
    <div class="login">Login</div>

  </div>
  <div id="registered-content">
    <div class="inp"><input type="text" placeholder="Username Please"/></div>
    <div class="inp"><input type="password" placeholder="Password Please"/></div>
    <div class="inp"><input type="password" placeholder="Password Again"/></div>
    <div class="inp"><input type="text" placeholder="Email"/></div>
    <div class="login">Register Now!</div>
  </div>
</div>




</body>

</html>
