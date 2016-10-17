<%-- 
    Document   : Contacto
    Created on : 16-10-2016, 15:25:15
    Author     : Casa
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="Style.css">
    </head>
    <body>
        <c:import url="Opciones.jsp"/>
        <div>
          
                <form action="${urlForm}" method="post">
            <div class="item-form">Nombre:</div><input type="text" name="nombre"/><br/>
            <div class="item-form">Apellido:</div><input type="text" name="apellido"/><br/>
            <div class="item-form">Rut:</div><input type="text" name="rut"/><br/>
                <div class="item-form">Motivo:</div><select name="motivo">
                <option value="seleccione">Seleccione</option>
                <option value="felicitaciones">Felicitaciones</option>
                <option value="reclamo">Reclamo</option>
                <option value="venta">Venta</option>
                <option value="otro">Otro</option>
            </select><br/>
            <div class="item-form">Comentarios:</div><textarea type="text" name="comentario"/></textarea><br/>
            <input type="submit" value="Enviar"/>&nbsp;
            <input type="reset" value="Limpiar"/>
        </form>
    </body>
        </div>
        
    </body>
</html>
