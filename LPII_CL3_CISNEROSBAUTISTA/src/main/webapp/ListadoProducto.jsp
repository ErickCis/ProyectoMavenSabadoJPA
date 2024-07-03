<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="model.TblProductocl3" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registro y Listado de Productos</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light text-dark">
    <div class="container">
        <h1 class="text-center my-4">Registrar Producto</h1>
        <form action="ControladorProducto" method="post" class="mb-4">
            <div class="form-group row">
                <label for="nombre" class="col-sm-2 col-form-label">Nombre</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="nombre" name="nombre" required>
                </div>
            </div>
            <div class="form-group row">
                <label for="preciocompra" class="col-sm-2 col-form-label">Precio Compra</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="preciocompra" name="preciocompra" required>
                </div>
            </div>
            <div class="form-group row">
                <label for="precioventa" class="col-sm-2 col-form-label">Precio de Venta</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="precioventa" name="precioventa" required>
                </div>
            </div>
            <div class="form-group row">
                <label for="estado" class="col-sm-2 col-form-label">Estado</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="estado" name="estado" required>
                </div>
            </div>
            <div class="form-group row">
                <label for="descrip" class="col-sm-2 col-form-label">Descripción</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="descrip" name="descrip" required>
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-10 offset-sm-2">
                    <button type="submit" class="btn btn-primary">Registrar Producto</button>
                </div>
            </div>
        </form>

        <h1 class="text-center my-4">Listado de Productos</h1>
		<table class="table table-bordered table-striped text-center">
			<thead class="thead-dark">
				<tr>
					<td>Codigo</td>
                    <td>Nombre</td>
                    <td>Precio Venta</td>
                    <td>Precio Compra</td>
                    <td>Estado</td>
                    <td>Descripcion</td>
					<td colspan="2" align="center">Acciones</td>
					<!-- Columna para los botones de acción -->
				</tr>
			</thead>
			<tbody>
				<%
					List<TblProductocl3> listadoproducto = (List<TblProductocl3>) request.getAttribute("listadoproductos");
					if (listadoproducto != null) {
						for (TblProductocl3 pro : listadoproducto) {
				%>
				<tr>
					<td><%=pro.getIdproductoscl3()%></td>
					<td><%=pro.getNombrecl3()%></td>
					<td><%=pro.getPrecioventacl3()%></td>
					<td><%=pro.getPreciocompcl3()%></td>
					<td><%=pro.getEstadocl3()%></td>
					<td><%=pro.getDescripcl3()%></td>
					<td><a href="ControladorProducto?accion=Eliminar&cod=<%=pro.getIdproductoscl3() %>">Eliminar</a></td>
                    <td><a href="ControladorProducto?accion=Modificar&cod=<%=pro.getIdproductoscl3()%>">Actualizar</a></td>
				</tr>
				<%
					} // fin del for
					} // fin de la condición
				%>
			</tbody>
		</table>
	</div>
    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

