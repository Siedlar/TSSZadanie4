<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Siedlar
  Date: 2020-04-22
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<c:forEach var="zmienna" items="${lista}">
   <p>${zmienna.nazwa} ${zmienna.marka} ${zmienna.konieMechaniczne} ${zmienna.pojemnosc} ${zmienna.rokProdukcji} ${zmienna.cena}</p>
</c:forEach>


<a href="${pageContext.request.contextPath}/">Wroc</a>
</body>
</html>
