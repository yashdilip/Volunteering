<%--
  Created by IntelliJ IDEA.
  User: Rajiv
  Date: 8/21/2016
  Time: 10:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title></title>
</head>
<body>
<form th:action="@{/logout}" method="post">
  <input type="submit" value="Sign Out"/>
</form>
<br/>
<h1>This is volunteer dashboard</h1>
</body>
</html>
