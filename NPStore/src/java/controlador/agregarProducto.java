/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Producto;
import modelo.ProductoColeccion;

/**
 *
 * @author Willywes
 */
@WebServlet(name = "agregarProducto", urlPatterns = {"/admin/pages/agregarProducto"})
public class agregarProducto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet agregarProducto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet agregarProducto at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        int id = 0, precio =0, stock = 0;
        Blob imagen = null;
        ArrayList<String> errores = new ArrayList<String>();
        String respuesta;
        // recibir parametros

        String idx = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String tipo = request.getParameter("tipo");
        String descripcion = request.getParameter("descripcion");
        String preciox = request.getParameter("precio");
        String stockx = request.getParameter("stock");
        String imagenx = request.getParameter("examinar");
        
        

        // validar
        if (idx.isEmpty()) {
            errores.add("Ingrese un valor para código");
        }
        if (nombre.isEmpty()) {
            errores.add("Ingrese un valor para nombre");
        }
        if (tipo.equals("tipo")) {
            errores.add("seleccion un tipo");
        }
        if (descripcion.isEmpty()) {
            errores.add("Ingrese un valor para la descripción");
        }
        if (preciox.isEmpty()) {
            errores.add("Ingrese un precio");
        }
        if (stockx.isEmpty()) {
            errores.add("Ingrese un Stock");
        }
        if (imagenx.isEmpty()) {
            errores.add("Ingrese una Imagen");
        }
        try {
            id = Integer.parseInt(idx);
        } catch (Exception e) {
            errores.add("El código debe ser un número");
        }

        try {
            precio = Integer.parseInt(preciox);
        } catch (Exception e) {
            errores.add("El precio debe ser un número");
        }

        try {
            stock = Integer.parseInt(stockx);
        } catch (Exception e) {
            errores.add("El stock debe ser un número");
        }
        try {
            imagen = null; //Blob.class.cast(imagenx);
        } catch (Exception e) {
            errores.add("Error imagen");
        }

        //ejecutar lógica de negocio
        if (errores.size() == 0) {
            Producto producto = new Producto(id, nombre, tipo, descripcion, precio, stock, imagen);

            // agregar mensaje a la session
            HttpSession session = request.getSession();
            ProductoColeccion registro = (ProductoColeccion) session.getAttribute("registro");
            if (registro == null) {
                registro = new ProductoColeccion();
                session.setAttribute("registro", registro);
            }
            if (ProductoColeccion.comprobarIdRepetido(id)) {
                errores.add("El codigo ya existe, ingrese el producto con un código distinto");
            } else {
                ProductoColeccion.agregarProducto(producto);
            }
            respuesta = "Se ha agregado su producto";
        } else {
            respuesta = "No se ha agregado su producto";
        }

        request.setAttribute("respuesta", respuesta);
        request.setAttribute("error", errores);

        RequestDispatcher despachador = request.getRequestDispatcher("/admin/pages/agregar-productos.jsp");
        despachador.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
