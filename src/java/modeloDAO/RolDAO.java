/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import configuracion.Conexion;
import interfaces.RolCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Rol;

/**
 *
 * @author julio
 */
public class RolDAO implements RolCRUD {
    
            Conexion conect = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Rol nRol = new Rol();

    @Override
    public List listar() {
ArrayList<Rol> listaRol = new ArrayList();
        String sql = "select * from rol";
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Rol nuevoRol = new Rol();
                nuevoRol.setCodigoRol(rs.getInt("codigoRol"));
                nuevoRol.setRol(rs.getString("rol"));
                listaRol.add(nuevoRol);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return listaRol;   
    }

    @Override
    public Rol list(int id) {
        String sql = "select * from rol where codigoRol= "+id;
            try{
                con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                nRol.setCodigoRol(rs.getInt("codigoRol"));
                nRol.setRol(rs.getString("rol"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return nRol;
    }
    
}
