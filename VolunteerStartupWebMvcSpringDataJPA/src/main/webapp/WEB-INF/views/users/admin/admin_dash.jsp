<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Rajiv
  Date: 8/21/2016
  Time: 10:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
  <meta charset="UTF-8"/>
  <title></title>
</head>
<body>
<%--<a href="<c:url value="@{/logout}" />" > Logout</a>--%>
<form th:action="@{/logout}" method="post">
  <input type="submit" value="Sign Out"/>
</form>
<br/>
<h1>This is admin dashboard</h1>
</body>
</html>
