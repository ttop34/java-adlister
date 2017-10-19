<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ include file="../partials/head.jsp"%>
</head>
<body>
    <%@ include file="../partials/navbar.jsp"%>
<c:forEach var="ad" items="${ads}">
    <h1>
          Ad:${ad.title}
    </h1>
    <p>
            ${ad.description}
    </p>
</c:forEach>

</body>
</html>
