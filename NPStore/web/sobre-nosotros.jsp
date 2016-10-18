<%-- 
    Document   : index
    Created on : 10-10-2016, 20:38:15
    Author     : Willywes
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NP Store</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,500,600,700,800,900" rel="stylesheet">

    </head>
    <body>

        <div class="contenedor">
            <div class="header">
                <div class="menu-top"><c:import url="menu-top.jsp"/></div>
            </div>
            <div class="main-top">
                <iframe src="slider/slider.html" width="980" height="300"></iframe>
            </div>
            <div class="menu"><c:import url="opciones.jsp"/></div>
            <div class="contenedor-interior">
                <div class="panel-izq">
                    <div class="box">
                        <div class="carrito">
                            <h3><img src="images/carrito.png" width="16px" height="16px"/> CARRITO DE COMPRA</h3>
                            <p>0 Articulos<p>
                                <input type="submit" value="Comprar" />
                        </div>
                        <div class="carrito">
                            <h3>Ofertas</h3>
                            <img src="images/oferta1.png" width="100%"/>
                            <img src="images/oferta2.png" width="100%"/>
                            <img src="images/oferta3.png" width="100%"/>
                        </div>
                        <div class="carrito">
                            <h3>Estamos en</h3>
                            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3344.8650867029864!2d-71.53537278509687!3d-33.03368468362904!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9689de64d74fd4af%3A0x8004f381e9055a38!2sDuoc+UC%3A+Sede+Vi%C3%B1a+Del+Mar!5e0!3m2!1ses!2s!4v1476756906137" width="100%" height="150" frameborder="0" style="border:0" allowfullscreen></iframe>
                        </div>


                    </div>

                </div>

                <div class="panel-main">
                    <div class="box">
                        <div class="carrito">
                            <h3>Sobre Nostros</h3>
                            <p style="padding: 15px; text-align: justify;">
                                NP Store, es una empresa chilena que se lanzó al mercado el año 2016, 
                                encargada de proporcionar los mejores servicios y productos gamer a los usuarios más exigentes.
                                Nuesta visión es buscar ser la empresa preferida por los usuarios o empresas
                            </p>
                        </div>
                    </div>


                </div>
                <div class="footer">
                    <div class="box">
                        <table style="width: 100%;" border="0" align="center">
                            <tbody>
                                <tr>
                                    <td style="width: 20%; text-align: center;">&nbsp;</td>
                                    <td style="width: 20%; text-align: center;"><img src="images/ga2-white.png" width="80%"></a</td>
                                    <td style="width: 20%; text-align: center;"><img src="images/tucreativa.png" width="80%"></a</td>
                                    <td style="width: 20%; text-align: center;"><img src="images/npstore.png" width="80%"></a</td>
                                    <td style="width: 20%; text-align: center;">&nbsp;</td>
                                </tr>
                            </tbody>
                        </table>
                        NP Store © Copyright 2016. Todos los derechos reservados. 
                    </div>
                </div>
            </div>
    </body>
</html>

