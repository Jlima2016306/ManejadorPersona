/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author julio
 */
public class Usuario {
    private String Usuario;
    private String Password;
    private int rol;

    public Usuario() {
    }

    public Usuario(String Usuario, String Password, int rol) {
        this.Usuario = Usuario;
        this.Password = Password;
        this.rol = rol;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    
    
}

  