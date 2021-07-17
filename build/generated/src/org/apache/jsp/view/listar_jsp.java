package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import modelo.Persona;
import modeloDAO.PersonaDAO;

public final class listar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html >\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Pagina de Listar</title>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("      \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"text-center\">Personas</h1>\n");
      out.write("            <a class=\"btn btn-success \" href=\"Controlador?accion=add\"> Agregar Nuevo </a>\n");
      out.write("            <table class=\"table table-bordered table-success \" ><br><br>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"text-center text-success\"><strong> CODIGO PERSONA</strong</td>\n");
      out.write("                        <td class=\"text-center text-success\"><strong>DPI</strong></td>\n");
      out.write("                        <td class=\"text-center text-success\"><strong>NOMBRES</strong></td>\n");
      out.write("                        <td class=\"text-center text-success\"><strong>ACCIONES</strong></td\n");
      out.write("                    </tr>                                      \n");
      out.write("                </thead>\n");
      out.write("                ");
   
                    PersonaDAO dao = new PersonaDAO();
                    List<Persona> listaPersona = dao.listar();
                    Iterator<Persona> iterator = listaPersona.iterator();
                    Persona per= null;
                    
                    while (iterator.hasNext()){
                        per = iterator.next();
                        
                
                
                    
                    
                    
                    
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"text-center active\">");
      out.print(per.getCodigoPersona() );
      out.write(" </td>\n");
      out.write("                        <td class=\"text-center  \">");
      out.print(per.getDPI() );
      out.write("</td>\n");
      out.write("                        <td class=\"text-center active  \" >");
      out.print(per.getNombrePersona() );
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">\n");
      out.write("                              <a class=\"btn  btn-warning txt-light\"href=\"Controlador?accion=editar&codigoPersona=");
      out.print( per.getCodigoPersona());
      out.write("\"> Edit</a>\n");
      out.write("                            <a class=\"btn  btn-danger \" href=\"Controlador?accion=eliminar&codigoPersona=");
      out.print( per.getCodigoPersona());
      out.write("\"> Remove</a>\n");
      out.write("\n");
      out.write("                        </td\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    \n");
      out.write("              \n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
