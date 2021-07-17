/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import configuracion.Conexion;
import interfaces.CRUD;
import interfaces.UsuarioCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import modelo.Persona;
import modelo.Usuario;


public class UsuarioDAO implements UsuarioCRUD{
        Conexion conect = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Usuario nUsuario = new Usuario();
    int r= 0;
    @Override
    public List listar() {
        ArrayList<Usuario> listaUsuario = new ArrayList();
        String sql = "select * from Usuarios";
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Usuario nuevoUsuario = new Usuario();
                nuevoUsuario.setUsuario(rs.getString("Usuario"));
                nuevoUsuario.setUsuario(rs.getString("Password"));
                nuevoUsuario.setRol(rs.getInt("rol"));
                listaUsuario.add(nuevoUsuario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return listaUsuario;        
    }



    @Override
    public int list(Usuario id) {
        
        String sql = "select * from usuarios where Usuario=? and password=?";
        try{
            r =0;
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id.getUsuario());
            ps.setString(2, id.getPassword());
            rs = ps.executeQuery();
            
            while (rs.next()){
                 r = r+1;
                nUsuario.setUsuario(rs.getString("Usuario"));
                nUsuario.setPassword(rs.getString("Password"));
                nUsuario.setRol(rs.getInt("Rol"));
            }
            if(r==1){
                return 1;
            }else{
                return 0;
            }
            
            
        }catch (Exception e){
            return 0;
        }
        
    }

    @Override
    public int Buscar(String nombre, String Pass) {
           Usuario user = null;
           int x=0;
        String sql = "select * from usuarios where Usuario= ?  and password=?" ;
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, nombre);
            ps.setString(2, Pass);
            
            rs = ps.executeQuery();
            while(rs.next()){
             
            
            user.setUsuario(rs.getString("Usuario"));
            user.setPassword(rs.getString("Password"));
            user.setRol(rs.getInt("Rol"));
            
            if(nombre == user.getUsuario() ){
                x=1;
            }
            
            }
           
            
        }catch (Exception e){
            e.printStackTrace();
        }
        if(x==1){
            
        x=1;
        
        
      
    } else{
            x=2;
        }  
        
        return x;
    }

    @Override
    public boolean valida(Usuario id) {
        boolean status=false; String sql = "select * from usuarios where Usuario=? and password=?";
        try{
      
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id.getUsuario());
            ps.setString(2, id.getPassword());
           
            System.out.print(ps);
            
            rs= ps.executeQuery();
            status = rs.next();
                
                
          
            
            
        }catch (Exception e){
        }

                    return status;

    }

    @Override
    public boolean validaRol(Usuario id) {
        boolean status=false; String sql = "select * from usuarios where Usuario=? and password=? and Rol=?";
        try{
      
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id.getUsuario());
            ps.setString(2, id.getPassword());
            ps.setInt(3, id.getRol());
           
            System.out.print(ps);
            
            rs= ps.executeQuery();
            status = rs.next();
                
                
          
            
            
        }catch (Exception e){
        }

                    return status;
    }
}

