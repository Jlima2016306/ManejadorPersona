<%-- 
    Document   : index
    Created on : 15/09/2020, 09:00:04 PM
    Author     : Admin
--%>


<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modeloDAO.RolDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Rol"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        
        <title>Pagina Principal</title>
    </head>
    <body >
        <form action="<%=request.getContextPath()%>/login" method="post">  
  <div class="form-group">
    <label for="exampleFormControlInput1">Usuario</label>
     <input class="form-control" type="text" name="username" />  </div>
           
   <div class="form-group">
    <label for="exampleFormControlInput1">Contraseña</label>
    <input type="password" class="form-control"  name="password"/>
  </div>
           
           
  <div class="form-group">
    <label>Rol</label>
    <select class="form-control" name="Roles">
        
        <%
            
                RolDAO RolDAO = new RolDAO();
                List<Rol> listaRol= RolDAO.listar();
                Iterator<Rol> iterator = listaRol.iterator();
                Rol rol= null;
            while(iterator.hasNext()){
                rol = iterator.next();

        %>
        <option value="<%= rol.getCodigoRol() %>"><%= rol.getRol() %></option>
            <% } %>
    </select>
  </div>
         <div class="text-center">   
               <input type="submit" value="Submit" />
        </div> 

        </form> 
    </body>
</html>
