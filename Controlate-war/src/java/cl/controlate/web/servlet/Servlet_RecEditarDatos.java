/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package cl.controlate.web.servlet;


import cl.controlate.web.clases.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 *
 * @author dev
 */
@WebServlet(name = "RecuperacionDatos_Editar", urlPatterns = {"/RecuperacionDatos_Editar"}) // url patterns significa la ruta para llamarlo
public class Servlet_RecEditarDatos extends HttpServlet {
    private final Logger oLog = Logger.getLogger("Servlet_RecEditarDatos");
    @EJB cl.controlate.web.ejb.Ejb_Rec_EditarDatos oEjb;
    datos datos_editar;
    
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
        
        HttpSession oSession = request.getSession();
        if(oSession == null || oSession.isNew()){
            //Error
            return;
        }
        String rut = oSession.getAttribute("rut").toString();
      
        
           oLog.log(Level.INFO, rut);
        
       datos datos_editar = oEjb.recuperarDatos(rut);                          // Llamada a la base de datos y devuelto el objeto datos login
       
        
             request.setAttribute("datos", datos_editar);                      // Porque capturo datos, pq asi puedo trabajar con todos los datos en un objeto :D
             request.setAttribute("Ficha", datos_editar.getiFicha());
             request.setAttribute("Nombre", datos_editar.getsNombre());
             request.setAttribute("Rut", datos_editar.getsRut());
             request.setAttribute("FechaNac", datos_editar.getsFechaNac());
             request.setAttribute("Genero", datos_editar.getsGenero());
             request.setAttribute("Direccion", datos_editar.getsDireccion());
             request.setAttribute("Ciudad", datos_editar.getsCiudad());
             request.setAttribute("Comuna", datos_editar.getsComuna());
             request.setAttribute("Region", datos_editar.getsRegion());
             request.setAttribute("Celular", datos_editar.getsCelular());
             request.setAttribute("Email", datos_editar.getsEmail());
             request.setAttribute("Prevision", datos_editar.getsPrevision());
             request.setAttribute("TipoSangre", datos_editar.getsTipoSangre());
             request.setAttribute("Estatura", datos_editar.getfEstatura());
             request.setAttribute("Peso", datos_editar.getfPeso());
             request.setAttribute("RutaFoto", datos_editar.getsRutaFoto());
             request.setAttribute("Contrasena", datos_editar.getsContrasena());
             
                      
             request.getRequestDispatcher("EditarDatos.jsp").forward(request, response);
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
        processRequest(request, response);
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