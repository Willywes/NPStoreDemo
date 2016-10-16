<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/style.css" type="text/css" rel="stylesheet"/>

        <title>Administración Tienda</title>
    </head>
    <body>
        <div class="space">
            <div class ="contendedor">
                <div class="panel-left">
                    <div class="panel-box">
                        <c:import url="menu.jsp"/>
                    </div>
                </div>
                <div class="panel-right">
                    <div class="panel-box">
                        <div class="panel-box-blanco">
                            <h1>Agregar Productos</h1>
                            <hr/>
                            <form action="" method="get" >
                                <input type="text" name="codigo" value="" placeholder="Código" /><br/>
                                <input type="text" name="nombre" value="" placeholder="Nombre" /><br/>
                                <input type="text" name="tipo" value="" placeholder="Tipo" /><br/>
                                <textarea type="text" name="descripcion" value="" placeholder="Descripción" ></textarea><br/>
                                <input type="number" name="precio" value="" placeholder="Precio" size="10" style="width : 100px;"/><br/>
                                <input type="number" name="cantidad" value="" placeholder="Cantidad" style="width : 100px;" /><br/>
                                <input type="file" name="examinar" value=""/><br/>
                                <input type="submit" value="Agregar" />
                            </form>                   
                        </div>
                       
                    </div>



                </div

            </div>
        </div>
    </body>
</html>