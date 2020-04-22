<%--
  Created by IntelliJ IDEA.
  User: Siedlar
  Date: 2020-04-22
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
</head>
<body>
<fmt:bundle basename="aplikacja" prefix="app.">
 <h1>  <fmt:message key="zadanie" ></fmt:message></h1>
  <h2>  <fmt:message key = "autor"></fmt:message> <fmt:message key="grupa" ></fmt:message></h2>
    ${czas.toString()}
    <hr>
</fmt:bundle>
<a href="dodajAuto">Dodaj auto</a>
<a href="usunAuto">Usun auto</a>
    <a href="wyswietlAuta">Wyswietl auta</a>
</body>
</html>
