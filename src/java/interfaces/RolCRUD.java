/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.Rol;

/**
 *
 * @author julio
 */
public interface RolCRUD {
        public List listar();
        public Rol list (int id); 
     
}
