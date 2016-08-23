<%--
  Created by IntelliJ IDEA.
  User: Dilip
  Date: 8/22/2016
  Time: 10:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>

<form:form modelAttribute="user" class="form-horizontal" role="form">

    <div class="form-group">
        <input class="form-control" placeholder="Name" name="name" type="text" autofocus="">
    </div>
    <div class="form-group">
        <input class="form-control" placeholder="Email" name="email" type="text" autofocus="">
    </div>
    <div class="form-group">
        <input class="form-control" placeholder="Password" name="password" type="password" autofocus="">
    </div>
    <div class="form-group">
        <input class="form-control" placeholder="Street" name="address.street" type="text" autofocus="">
    </div>
    <div class="form-group">
        <input class="form-control" placeholder="City" name="address.city" type="text" autofocus="">
    </div>
    <div class="form-group">
        <input class="form-control" placeholder="State" name="address.state" type="text" autofocus="">
    </div>
    <div class="form-group">
        <input class="form-control" placeholder="Zip Code" name="address.zip" type="text" autofocus="">
    </div>
    <button type="submit" class="btn btn-primary">Add User</button>

</form:form>
<script src="webjars/jquery/1.11.1/jquery.min.js" />
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js" />
</body>
</html>
