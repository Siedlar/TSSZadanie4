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
<table border="1" cellpadding="5">
    <caption><h2>Lista samochodów</h2></caption>
    <tr>
    <th>
        <p>ID</p>
    </th>
        <th>
            <p>Marka</p>
        </th>
        <th>
            <p>Model</p>
        </th>
        <th>
            <p>Konie Mechaniczne</p>
        </th>
        <th>
            <p>Pojemnosc</p>
        </th>
        <th>
            <p>Cena</p>
        </th>
        <th>
            <p>Rok Produkcji</p>
        </th>
    </tr>
<c:forEach items="${lista}" var="item">
    <tr>
  <td> ${item.idCars}</td>
        <td> ${item.nazwa}</td>
        <td>  ${item.marka}</td>
        <td> ${item.konieMechaniczne}</td>
        <td>  ${item.pojemnosc}</td>
        <td> ${item.cena}</td>
        <td>  ${item.rokProdukcji}</td>

    </tr>
</c:forEach>
</table>
<br>
<h3><a href="dodajAuto">Dodaj auto</a><br></h3>
<h3><a href="usunAuto">Usun auto</a><br></h3>
<h3> <a href="wyswietlAuta">Wyswietl auta</a></h3>
</body>
</html>
