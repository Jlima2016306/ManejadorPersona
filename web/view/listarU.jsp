<%-- 
    Document   : listarU
    Created on : 8/10/2020, 11:34:24 AM
    Author     : julio
--%>


<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Persona"%>
<%@page import="modeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Pagina de Listar</title>
    </head>
    <body >
      
        <div class="container">
            <h1 class="text-center">Personas</h1>
            <table class="table table-bordered table-success " ><br><br>
                <thead>
                    <tr>
                        <td class="text-center text-success"><strong> CODIGO PERSONA</strong</td>
                        <td class="text-center text-success"><strong>DPI</strong></td>
                        <td class="text-center text-success"><strong>NOMBRES</strong></td>
                    </tr>                                      
                </thead>
                <%   
                    PersonaDAO dao = new PersonaDAO();
                    List<Persona> listaPersona = dao.listar();
                    Iterator<Persona> iterator = listaPersona.iterator();
                    Persona per= null;
                    
                    while (iterator.hasNext()){
                        per = iterator.next();
                        
                
                
                    
                    
                    
                    %>
                <tbody>
                    <tr>
                        <td class="text-center active"><%=per.getCodigoPersona() %> </td>
                        <td class="text-center  "><%=per.getDPI() %></td>
                        <td class="text-center active  " ><%=per.getNombrePersona() %></td>
                       

                        </td
                    </tr>
                    
                    <%}%>
                    
              
                    
                </tbody>
                
            </table>
        </div>
    </body>
</html>
