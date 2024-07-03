<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Actualizar Producto</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
    integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
    crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <h1 class="text-center">Actualizar Producto</h1>

    <form method="post" action="ControladorProducto" class="mt-4">
        <% 
            String cod = (request.getAttribute("codigo") != null) ? request.getAttribute("codigo").toString() : "";
            String nom = (request.getAttribute("nombre") != null) ? request.getAttribute("nombre").toString() : "";
            String precioventa = (request.getAttribute("precio venta") != null) ? request.getAttribute("precio venta").toString() : "";
            String preciocomp = (request.getAttribute("precio compra") != null) ? request.getAttribute("precio compra").toString() : "";
            String estado = (request.getAttribute("estado") != null) ? request.getAttribute("estado").toString() : "";
            String desc = (request.getAttribute("descripcion") != null) ? request.getAttribute("descripcion").toString() : "";
        %>
        <input type="hidden" name="codigo" value="<%= cod %>">

        <div class="form-group row">
            <label for="nombre" class="col-sm-3 col-form-label">Nombre</label>
            <div class="col-sm-9">
                <input type="text" class="form-control" id="nombre" name="nombre" value="<%= nom %>">
            </div>
        </div>

        <div class="form-group row">
            <label for="precioventa" class="col-sm-3 col-form-label">Precio de Venta</label>
            <div class="col-sm-9">
                <input type="text" class="form-control" id="precioventa" name="precioventa" value="<%= precioventa %>">
            </div>
        </div>

        <div class="form-group row">
            <label for="preciocompra" class="col-sm-3 col-form-label">Precio de Compra</label>
            <div class="col-sm-9">
                <input type="text" class="form-control" id="preciocompra" name="preciocompra" value="<%= preciocomp %>">
            </div>
        </div>

        <div class="form-group row">
            <label for="estado" class="col-sm-3 col-form-label">Estado</label>
            <div class="col-sm-9">
                <input type="text" class="form-control" id="estado" name="estado" value="<%= estado %>">
            </div>
        </div>

        <div class="form-group row">
            <label for="descripcion" class="col-sm-3 col-form-label">Descripción</label>
            <div class="col-sm-9">
                <input type="text" class="form-control" id="descripcion" name="descripcion" value="<%= desc %>">
            </div>
        </div>

        <div class="form-group row">
            <div class="col-sm-9 offset-sm-3">
                <button type="submit" class="btn btn-primary">Actualizar Producto</button>
            </div>
        </div>
    </form>
</div>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
    integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8sh+Wy6pBEddPBr95M6cG4+XVOFjBdNy/epsi"
    crossorigin="anonymous"></script>
</body>
</html>
