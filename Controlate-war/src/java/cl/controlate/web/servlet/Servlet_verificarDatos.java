/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.controlate.web.servlet;



import cl.controlate.web.clases.datos_login;
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
@WebServlet(name = "Servlet_varificarDatos", urlPatterns = {"/Servlet_verificarDatos"}) // Agregar la direccion del servlet en el urlPatterns 

public class Servlet_verificarDatos extends HttpServlet {
    
    @EJB cl.controlate.web.ejb.Ejb_login oEjb;
     datos_login datos_login;
                
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
        
       
       
        String rut = request.getParameter("rut");
        String pas = request.getParameter("pass");
      
        datos_login = oEjb.login(rut, pas);
       
        if(datos_login.getiError()==0){
//             request.setAttribute("user", datos_login.getsName());
//             request.setAttribute("mensaje",datos_login.getsError());
//             HttpSession sesion = request.getSession(true);
//             sesion.setAttribute("usuario", datos_login.getsName());
//            sesion.setAttribute("rut", rut);
            response.setContentType("text/plain");
            PrintWriter out = response.getWriter();
            out.println(" ");
            out.flush();
            out.close();
            // request.getRequestDispatcher("Servlet_ficha").forward(request, response);
       
        }
        else{
            response.setContentType("text/plain");
            PrintWriter out = response.getWriter();
            out.println(datos_login.getsError());
            out.flush();
            out.close();
//             request.setAttribute("mensaje", datos_login.getsError());
//             request.getRequestDispatcher("login.jsp").forward(request, response);
            
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
        
       
//       
//        String rut = request.getParameter("rut");
//        String pas = request.getParameter("pass");
//      
//        datos_login = oEjb.login(rut, pas);
//       
//        if(datos_login.getiError()==0){
////             request.setAttribute("user", datos_login.getsName());
////             request.setAttribute("mensaje",datos_login.getsError());
//            
//            response.setContentType("text/plain");
//            PrintWriter out = response.getWriter();
//            out.println(" ");
//            out.flush();
//            out.close();
//             //request.getRequestDispatcher("Servlet_ficha").forward(request, response);
//       
//        }
//        else{
//            response.setContentType("text/plain");
//            PrintWriter out = response.getWriter();
//            out.println(datos_login.getsError());
//            out.flush();
//            out.close();
////             request.setAttribute("mensaje", datos_login.getsError());
////             request.getRequestDispatcher("login.jsp").forward(request, response);
//            
//        }
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
        
       
//       
//        String rut = request.getParameter("rut");
//        String pas = request.getParameter("pass");
//      
//        datos_login = oEjb.login(rut, pas);
//       
//        if(datos_login.getiError()==0){
////             request.setAttribute("user", datos_login.getsName());
////             request.setAttribute("mensaje",datos_login.getsError());
//             HttpSession sesion = request.getSession(true);
//             sesion.setAttribute("usuario", datos_login.getsName());
//            sesion.setAttribute("rut", rut);
//           // response.setContentType("text/plain");
//            //
//             request.getRequestDispatcher("Servlet_ficha").forward(request, response);
//       
//        }
//        else{
//            
//            
////             HttpSession sesion = request.getSession(true);
////             if(sesion!=null){
////                 request.getRequestDispatcher("Servlet_ficha").forward(request, response);
////             }
////             else{
////                  request.getRequestDispatcher("index.jsp").forward(request, response);
////             }
//             request.setAttribute("mensaje", datos_login.getsError());
//             request.getRequestDispatcher("index.jsp").forward(request, response);
//            
//        }
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
