/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.controlate.web.servlet;

import cl.controlate.web.clases.Citas;
import cl.controlate.web.clases.Controles;
import cl.controlate.web.clases.Medicamentos;
import cl.controlate.web.clases.Tutores;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hector
 */
@WebServlet(name = "Servlet_ficha", urlPatterns = {"/Servlet_ficha"})
public class Servlet_ficha extends HttpServlet {

    @EJB
    cl.controlate.web.ejb.Ejb_Ficha oEjb;

    // @EJB ArrayList<cl.controlate.web.clases.Medicamentos> med;

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
        HttpSession session = (HttpSession) request.getSession(true);

        if (session.getAttribute("rut") != null) {
            String rut = session.getAttribute("rut").toString();
           //medicamentos

            ArrayList<Medicamentos> med = oEjb.medicamentos(rut);

            request.setAttribute("medicamentos", med);

             //citas

            ArrayList<Citas> citas = oEjb.citas(rut);

            request.setAttribute("citas", citas);
            
             //controles

            ArrayList<Controles> ctr = oEjb.controles(rut);

            request.setAttribute("controles", ctr);
            
            //tutores

            ArrayList<Tutores> tutor = oEjb.tutores(rut);

            request.setAttribute("tutores", tutor);
            
            request.getRequestDispatcher("Ficha.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("index.jsp").forward(request, response);
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
