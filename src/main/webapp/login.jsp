<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login Page</title>
    <%@ include file="partials/bsStylesheet.jsp" %>
</head>
<body>
<h1>Login Below</h1>
<form action="/login.jsp" method="POST" id="login">
    <label for="username">Username
        <input id="username" type="text" name="username" >
    </label>
    <label for="password">Password
        <input id="password" type="password" name="password">
    </label>
    <br>
    <button type="submit">Submit</button>
</form>
<c:choose>
    <c:when test="${param.username.equals('Admin') && param.password.equals('password')}">
        <% String redirectURL = "http://localhost:8080/profile.jsp";
            response.sendRedirect(redirectURL);
        %>
    </c:when>
</c:choose>
<%@ include file="partials/bsScripts.jsp" %>
</body>
</html>
