<%--
  Created by IntelliJ IDEA.
  User: Jarst
  Date: 16/12/09
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注销用户账号</title>
</head>
<body>
<main class="main" id="main">
    <div class="user" id="userCancel">
        <form  name="form_userCancel" action="userCancelResult" class="userCancelFrom" method="post">
            <p>
            <h6>&nbsp;账号:&nbsp;</h6><input type="text" id="input_userId" name="input_userId" autofocus/>
            <input type="submit" value="注销"/>
            </p>
        </form>
    </div>
</main>
</body>
</html>
