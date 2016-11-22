
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