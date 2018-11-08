/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.Serializable;

/**
 *
 * @author STALIN
 */
public class ClsAdministrador extends ClsPersona implements Serializable{
    
    private String clave;
    
    public ClsAdministrador() {
        super();
    }

    public ClsAdministrador(int id, String nombre, String apellido, long cedula) {
        super(id, nombre,apellido,  cedula);
        this.clave = nombre+123;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    
    
     @Override
    public String toString(){
    //return this.getId()+" "+this.getNombre();
    return this.getNombre();
    }
    
    
    
}
