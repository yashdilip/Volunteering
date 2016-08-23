<%--
  Created by IntelliJ IDEA.
  User: Rajiv
  Date: 8/21/2016
  Time: 10:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Volunteers | Welcome</title>
  <style>
    .b{ color:red;}

    #loginFormTable
    {
      position:absolute;
      top:30%;
      left:40%;

      /*Alternatively you could use: */
      /*
         position: fixed;
          bottom: 50%;
          right: 50%;
      */


    }
  </style>
</head>
<body>
<!--<div data-th-include=""></div>-->
<!--<object type="text/html" data="common/header.html"></object>-->
<div th:if="${param.error}">
  Invalid username and password.
</div>
<div th:if="${param.logout}">
  <span class="b">You have been logged out.</span>
</div>
<form th:action="@{/login}" method="post">
  <table id="loginFormTable">
    <thead>
    <tr>
      <td>
        <h2>Login</h2>
      </td>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td><div><label> User Name :</label></div></td>
      <td><input type="text" name="username" required="required"/></td>
    </tr>
    <tr>
      <td><div><label> Password :</label></div></td>
      <td><input type="password" name="password" required="required"/> </td>
    </tr>
    <tr> <td><input type="submit" value="Sign In"/></td> </tr>
    </tbody>
  </table>
</form>
</body>
</html>
