<%-- 
    Document   : destino
    Created on : 01-oct-2014, 15:56:20
    Author     : dev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= request.getAttribute("user") %></h1>
        <h1><%= request.getAttribute("mensaje") %></h1>
    </body>
      
    <input type="text" placeholder="Nombre" name="nombre" /><br>
      <input type="text" placeholder="Rut" name="rut" /><br>
      <input type="text" placeholder="Contraseña"name="contrasena" /><br>
      <input type="text" placeholder="Fecha de Nacimiento" name="fecha_nacimiento" /><br>
      <input type="text" placeholder="Genero" name="genero" /><br>
      <input type="text" placeholder="Dirección" name="direccion" /><br>
      <input type="text" placeholder="Ciudad" name="ciudad" /><br>
      <input type="text" placeholder="Comuna" name="comuna" /><br>
      <input type="text" placeholder="Región" name="region" /><br>
      <input type="text" placeholder="Telefono" name="telefono" /><br>
      <input type="text" placeholder="Email" name="email" /><br>
      <input type="text" placeholder="Previsión" name="prevision" /><br>
      
      <button type="submit">Crear Paciente</button>
</html>
