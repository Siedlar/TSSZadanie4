<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Siedlar
  Date: 2020-04-26
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/aktualizuj" modelAttribute="auto">
    <p><b>ID  </b><form:input  path="idCars" ></form:input></p><br>
    <input type="submit" value="Przeslij"/>
</form:form>
<a href="${pageContext.request.contextPath}/">Wroc</a>
</body>
</html>

</html>
