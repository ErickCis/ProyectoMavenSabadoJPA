<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado clientes</title>
</head>
<body>
<h1>Listado de clientes registrados en la BD</h1>

<table border="2" align="center">
<tr>
    <th>Nombre</th>
    <th>Apellido</th>
    <th>Dni</th>
    <th>Email</th>
    <th>Telf</th>
    <th>Sexo</th>
</tr>
<tr>
    <td>Nombre1</td>
    <td>Apellido1</td>
    <td>DNI1</td>
    <td>email1@example.com</td>
    <td>123456789</td>
    <td>Masculino</td>
</tr>
<tr>
    <td>Nombre2</td>
    <td>Apellido2</td>
    <td>DNI2</td>
    <td>email2@example.com</td>
    <td>987654321</td>
    <td>Femenino</td>
</tr>
<!-- Puedes añadir más filas dinámicamente aquí si estás obteniendo datos de una base de datos o de otra fuente -->
</table>

</body>
</html>
