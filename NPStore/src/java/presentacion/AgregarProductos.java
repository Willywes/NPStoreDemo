/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;


import Servicios.ServicioProducto;
import dto.ProductoDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Willywes
 */
@WebServlet(name = "AgregarProductos", urlPatterns = {"/admin/pages/agregar-productos"})
public class AgregarProductos extends HttpServlet {

    // TENEMOS QUE COMENTAR ESTAS PARTES POR QE NOS DAN ERRORES Y NUNCA NUCAN PODEMOS HACER FUNCIONAR BIEN EL SERVLET@EJB
    // @EJB
    
    
    private ServicioProducto servicioProducto;

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
            out.println("<title>Servlet AgregarProductos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AgregarProductos at " + request.getContextPath() + "</h1>");
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
        byte[] imagen = null;
        ArrayList<String> errores = new ArrayList<String>();
        String respuesta;
        // recibir parametros

        String idx = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String tipo = request.getParameter("tipo");
        String descripcion = request.getParameter("descripcion");
        String preciox = request.getParameter("precio");
        String stockx = request.getParameter("stock");
        String imagenx = request.getParameter("imagen");
        
        

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
            imagen = null; //generar codigo para crear imagen
        } catch (Exception e) {
            errores.add("Error imagen");
        }

        //ejecutar lógica de negocio
        if (errores.isEmpty()) {
           
            ProductoDTO producto = new ProductoDTO(id, nombre, tipo, descripcion, precio, imagen, stock);  
            
            try {
                 servicioProducto.create(producto);
               
                respuesta = "Participante se agregó exitosamente";
            } catch (Exception ex) {
                respuesta = ex.getMessage();
            }
            
            
        } else {
            respuesta = "Error en completar el formulario";
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
