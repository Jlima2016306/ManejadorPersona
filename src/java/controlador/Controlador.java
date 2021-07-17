 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona;
import modeloDAO.PersonaDAO;

/**
 *
 * @author Admin
 */
public class Controlador extends HttpServlet {
    
    String listar = "view/listar.jsp";
    String add = "view/add.jsp";
    String edit = "view/editar.jsp";
    Persona nuevaPersona = new Persona();
    PersonaDAO nuevaPersonaDao = new PersonaDAO();
    int codigoPersona;

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
         
        String codigo = request.getParameter("Codigo");
        String dpi = request.getParameter("txtDPI");
        String nombrePersona = request.getParameter("txtNombre");
        
        int DPI=0;
        String Persona="";
        String mensaje="";
        String error="";
        
        try{
            DPI = Integer.parseInt(dpi);
        }catch(NumberFormatException e){
            
            error="Error,verifique que solo sean numeros";
          
        }
        if(error.isEmpty()){
            // si no hay errores, se aceptaran los datos
            
        }else{
            //si no motrar el error
            request.setAttribute("error",error);

        }
        
        
        try{
            Persona = nombrePersona;
                }catch(Exception e){
                    e.printStackTrace();
                    error="No se reconoce el nombre de u suario";
                }
        if(error.isEmpty()){
            // si no hay errores, se aceptaran los datos
            
        }else{
            //si no motrar el error
            request.setAttribute("error",error);    
        }



        request.getRequestDispatcher("listar").forward(request,response);
        // en el parentesis y dentro e la comilla se agrega el nombre de la vista.



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
        
        String acceso = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("listar")) {
            acceso = listar;
            
        }else if(action.equalsIgnoreCase("add")){
            acceso = add;
            
        }else if(action.equalsIgnoreCase("Agregar")){
            String DPI= request.getParameter("txtDPI");
            String nombre= request.getParameter("txtNombre");
            nuevaPersona.setDPI(DPI);
            nuevaPersona.setNombrePersona(nombre);
            nuevaPersonaDao.add(nuevaPersona);
            acceso = listar;
            
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("codPer", request.getParameter("codigoPersona"));
            acceso = edit;
            
        }else if(action.equalsIgnoreCase("Actualizar")){
            codigoPersona = Integer.parseInt(request.getParameter("txtCodigoPersona"));
            String DPI = request.getParameter("txtDPI");
            String nombres = request.getParameter("txtNombre");
            nuevaPersona.setCodigoPersona(codigoPersona);
            nuevaPersona.setDPI(DPI);
            nuevaPersona.setNombrePersona(nombres);
            nuevaPersonaDao.edit(nuevaPersona);
            acceso = listar;    
        }else if(action.equalsIgnoreCase("eliminar")){
            codigoPersona = Integer.parseInt(request.getParameter("codigoPersona"));
            nuevaPersona.setCodigoPersona(codigoPersona);
            nuevaPersonaDao.eliminar(codigoPersona);
            acceso = listar;
        }
        
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
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
    public String getServletInfo(){ 
        return "Short description";
    }// </editor-fold>

}