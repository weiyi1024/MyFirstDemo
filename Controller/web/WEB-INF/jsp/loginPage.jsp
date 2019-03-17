<%--
  Created by IntelliJ IDEA.
  User: weiyi
  Date: 2019-03-17
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>loginPage</title>
</head>
<body>
    <form id="loginForm" method="post" action="./verify" class="login">
        <p>
            <label style="color: blue">账号：</label>
            <input type="text" name="user" id="login">
        </p>
        <p>
            <label style="color: crimson" >密码：</label>
            <input type="password" name="password" id="password">
        </p>
        <p>
            <input id="loginbtn" type="submit" class="login-button">
        </p>
    </form>
</body>
</html>
