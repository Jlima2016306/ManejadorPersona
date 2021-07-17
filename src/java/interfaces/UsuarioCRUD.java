/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


import java.util.List;
import modelo.Usuario;

/**
 *
 * @author julio
 */
public interface UsuarioCRUD {
        public List listar();
        public boolean valida(Usuario id);
        public boolean validaRol(Usuario id);
        public int list (Usuario id); 
        public int Buscar(String nombre, String Pass);
}
