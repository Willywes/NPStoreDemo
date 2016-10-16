<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/style.css" type="text/css" rel="stylesheet"/>

        <title>NP Store - Agregar Productos</title>
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
                            <c:url var="uf" value="/admin/pages/agregarProducto"/>
                            <form action="${uf}" method="post">
                                <input type="number" name="id" value="" placeholder="Código" style="width : 100px;"/><br/>
                                <input type="text" name="nombre" value="" placeholder="Nombre" /><br/>
                                <select name="tipo">
                                    <option value="tipo">Tipo</option>
                                    <option value="mouse">Mouse</option>
                                    <option value="pantalla">Pantalla</option>
                                    <option value="teclado">Teclado</option>
                                    <option value="gabinete">Gabinete</option>

                                </select><br/>
                                <textarea type="text" name="descripcion" value="" placeholder="Descripción" ></textarea><br/>
                                <input type="number" name="precio" value="" placeholder="Precio" style="width : 100px;"/><br/>
                                <input type="number" name="stock" value="" placeholder="Cantidad" style="width : 100px;" /><br/>
                                <input type="file" name="examinar" value=""/><br/>
                                <input type="submit" value="Agregar" />


                            </form>                   
                        </div>

                        <c:if test="${not empty respuesta}">
                            <div class="panel-box-blanco">
                                <h2> <c:out value="${respuesta}" /></h2>
                            </div>

                        </c:if></br> 

                        <c:if test="${not empty error}">
                            <div class="panel-box-blanco">
                                <ul>
                                    <c:forEach var="err" items="${error}">
                                        <li><c:out value="${err}"/></li>  
                                        </c:forEach>
                                </ul>
                            </div>
                        </c:if> 


                    </div>



                </div

            </div>
        </div>
    </body>
</html>