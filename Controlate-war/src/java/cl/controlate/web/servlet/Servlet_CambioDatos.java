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
@WebServlet(name = "Servlet_CambioDatos", urlPatterns = {"/Servlet_CambioDatos"})
public class Servlet_CambioDatos extends HttpServlet {
    private final Logger oLog = Logger.getLogger("Servlet_CambioDatos");
    @EJB cl.controlate.web.ejb.Ejb_Rec_EditarDatos oEjb;
    datos datos_cambiados;
    
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
            return ;
        }
        
        String rut = oSession.getAttribute("rut").toString();
        String direccion = request.getParameter("Direccion");
        String ciudad = request.getParameter("Ciudad");
        String comuna = request.getParameter("Comuna");
        String region = request.getParameter("Region");
        String telefono = request.getParameter("Celular");
        String email = request.getParameter("Email");
        String pass = request.getParameter("Pass");
        
                
         datos_cambiados = oEjb.modificar_datos(rut,direccion,ciudad,comuna,region,telefono,email); // Llamada a la base de datos y devuelto el objeto datos login
         
         oLog.log(Level.INFO, rut);
        oLog.log(Level.INFO, direccion);
        oLog.log(Level.INFO, ciudad);
        oLog.log(Level.INFO, comuna);
        oLog.log(Level.INFO, region);
        oLog.log(Level.INFO, telefono);
        oLog.log(Level.INFO, email);
        oLog.log(Level.INFO, datos_cambiados.getsEmail());
        oLog.log(Level.INFO, pass);
        
                 request.setAttribute("datos", datos_cambiados);                      // Porque capturo datos, pq asi puedo trabajar con todos los datos en un objeto :D
             request.setAttribute("Ficha", datos_cambiados.getiFicha());
             request.setAttribute("Nombre", datos_cambiados.getsNombre());
             request.setAttribute("Rut", datos_cambiados.getsRut());
             request.setAttribute("FechaNac", datos_cambiados.getsFechaNac());
             request.setAttribute("Genero", datos_cambiados.getsGenero());
             request.setAttribute("Direccion", datos_cambiados.getsDireccion());
             request.setAttribute("Ciudad", datos_cambiados.getsCiudad());
             request.setAttribute("Comuna", datos_cambiados.getsComuna());
             request.setAttribute("Region", datos_cambiados.getsRegion());
             request.setAttribute("Celular", datos_cambiados.getsCelular());
             request.setAttribute("Email", datos_cambiados.getsEmail());
             request.setAttribute("Prevision", datos_cambiados.getsPrevision());
             request.setAttribute("TipoSangre", datos_cambiados.getsTipoSangre());
             request.setAttribute("Estatura", datos_cambiados.getfEstatura());
             request.setAttribute("Peso", datos_cambiados.getfPeso());
             request.setAttribute("RutaFoto", datos_cambiados.getsRutaFoto());
             
             
                      
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
