
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" type="text/css" rel="stylesheet"/>

        <title>NP Store - Login Admin</title>
    </head>
    <body>
        <div class="space">
            <div class ="">
                <div class="contendedor-login">
                    <img src="../images/npshop-logo.png" width="100%"/>
                    <form action="pages/index.jsp">

                        <input type="text" name="usuario" value="" placeholder="Usuario" autofocus="true" style="width : 236px"/><br/>
                        <input type="password" name="pass" value="" placeholder="Contraseña" style="width : 236px;"/><br/>
                        <input type="submit" value="Acceder" style="width : 100%;"/>
                        <!-- falta implemetnar el servlet-->

                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
