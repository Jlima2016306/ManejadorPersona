package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import modeloDAO.RolDAO;
import modelo.Rol;

public final class Logi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"./css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        \r\n");
      out.write("        <title>Pagina Principal</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body >\r\n");
      out.write("             \r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label for=\"exampleFormControlInput1\">Usuario</label>\r\n");
      out.write("     <input class=\"form-control\" type=\"text\" name=\"username\" />  </div>\r\n");
      out.write("           \r\n");
      out.write("   <div class=\"form-group\">\r\n");
      out.write("    <label for=\"exampleFormControlInput1\">Contraseña</label>\r\n");
      out.write("    <input type=\"password\" class=\"form-control\"  name=\"password\"/>\r\n");
      out.write("  </div>\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label>Rol</label>\r\n");
      out.write("    <select class=\"form-control\" name=\"Roles\">\r\n");
      out.write("        \r\n");
      out.write("        ");

            
                RolDAO RolDAO = new RolDAO();
                List<Rol> listaRol= RolDAO.listar();
                Iterator<Rol> iterator = listaRol.iterator();
                Rol rol= null;
            while(iterator.hasNext()){
                rol = iterator.next();

        
      out.write("\r\n");
      out.write("        <option value=\"");
      out.print( rol.getCodigoRol() );
      out.write('"');
      out.write('>');
      out.print( rol.getRol() );
      out.write("</option>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("    </select>\r\n");
      out.write("  </div>\r\n");
      out.write("         <div class=\"text-center\">   \r\n");
      out.write("                         <a class=\"btn btn-success btn-lg btn-block\"  href=\"LoginController?accion=listar\">Listar Personas</a> \r\n");
      out.write("\r\n");
      out.write("        </div> \r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
