<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: daria
  Date: 21.03.17
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>doctor</title>
</head>
<body>
<c:forEach items="${doctors}" var="doctor">
    <c:out value="${doctor}"/>
</c:forEach>
</body>
</html>
