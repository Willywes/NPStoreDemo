<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/style.css" type="text/css" rel="stylesheet"/>

        <title>NP Store - Listar Productos</title>
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
                            <h1>Listar Productos</h1>
                            <c:if test="${not empty sessionScope.registro.lista}">
                                <table name="tablaDatos" align="left">
                                    <tr >
                                        <th>Código</th>
                                        <th>Nombre</th>
                                        <th>Tipo</th>
                                        <th>Descripción</th>
                                        <th>Precio</th>
                                        <th>Stock</th>
                                        <th>Foto</th>
                                        <th></th>
                                    </tr> 
                                    <c:forEach var="r" items="${sessionScope.registro.lista}">

                                        <tr class="fila">
                                            <td> <c:out value="${r.id}"/> </td>
                                            <td> <c:out value="${r.nombre}"/> </td>
                                            <td> <c:out value="${r.tipo}"/> </td>
                                            <td> <c:out value="${r.descripcion}"/> </td>
                                            <td> <c:out value="${r.precio}"/></td>
                                            <td> <c:out value="${r.cantidad}"/> </td>
                                            <td> <c:out value="${r.foto}"/> </td>
                                            <td>
                                                <c:url var="urlEliminar" value="/admin/pages/eliminarProducto"/>
                                                <form action="${urlEliminar}" method="POST">
                                                    <input type="hidden" name="id" value="${r.id}" />
                                                    <input type="submit" value="Eliminar" />
                                                </form>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </table>
                            </c:if>

                        </div>
                        <c:if test="${not empty respuesta}">
                            <div class="panel-box-blanco">
                                <h2> <c:out value="${respuesta}" /></h2>
                            </div>

                        </c:if>

                    </div>



                </div

            </div>
        </div>
    </body>
</html>