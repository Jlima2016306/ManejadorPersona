/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import static javafx.scene.input.KeyCode.L;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Usuario;
import modeloDAO.UsuarioDAO;

/**
 *
 * @author julio
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
public static final long serialVersionUID =  1 ;
private  UsuarioDAO UsuarioDAO;
String listar = "view/listar.jsp";
public void init(){
    UsuarioDAO= new UsuarioDAO();
}

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
            out.println("<title>Servlet LoginController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginController at " + request.getContextPath() + "</h1>");
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
        
                           
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        int Rol = Integer.parseInt( request.getParameter("Roles"));
        Usuario usuario = new Usuario();
        
        usuario.setUsuario(username);
        usuario.setPassword(password);
        
        if (UsuarioDAO.valida(usuario)) {
            
                    usuario.setRol(Rol);

            
            if(UsuarioDAO.validaRol(usuario) ){
                
                if(Rol==1){
                            response.sendRedirect("view/listar.jsp");
                }else if(Rol ==2){
                            response.sendRedirect("view/listarU.jsp");
                }          
            }else {
         
            
                        response.sendRedirect("view/ErrorRol.jsp");

            }
        } else {
            //session.setAttribute("user", username);
            response.sendRedirect("view/ErrorPU.jsp");
        }
        
    
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
