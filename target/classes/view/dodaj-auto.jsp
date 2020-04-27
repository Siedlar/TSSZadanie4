<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
<!DOCTYPE html>
  Created by IntelliJ IDEA.
  User: Siedlar
  Date: 2020-04-22
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        .error{
            color:red;
        }
    </style>
</head>
<body>
<h1>Dodaj samochod</h1>
<form:form action="${pageContext.request.contextPath}/dodano" modelAttribute="auto" method="post">
    <form:hidden path="idCars"/>
    <p><b>Marka samochodu  </b><form:input path="nazwa" /> <form:errors path="nazwa" cssClass="error"/> </p> <br>
    <p><b>Model samochodu  </b><form:input path="marka"></form:input> <form:errors path="marka" cssClass="error"/></p> <br>
    <p><b>Konie mechaniczne  </b> <form:input path="konieMechaniczne"></form:input>  <form:errors path="konieMechaniczne" cssClass="error"/></p><br>
    <p><b>Pojemnosc  </b>   <form:input path="pojemnosc"></form:input> <form:errors path="pojemnosc" cssClass="error"/></p><br>
    <p><b>Rok Produkcji  </b>    <form:input path="rokProdukcji"></form:input> <form:errors path="rokProdukcji" cssClass="error"/></p><br>
    <p><b>Cena  </b>  <form:input path="cena" ></form:input> <form:errors path="cena" cssClass="error"/></p> <br>
<input type="submit" value="Przeslij"/>
</form:form><br><br>
<a href="${pageContext.request.contextPath}/">Wroc</a>
</body>
</html>
