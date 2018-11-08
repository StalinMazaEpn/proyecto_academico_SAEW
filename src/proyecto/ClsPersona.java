
package proyecto;

import java.io.Serializable;

public class ClsPersona implements Serializable {
  
    private int id;
    private String nombre;
    private String apellido;
    long cedula;
    
    public ClsPersona(int id, String nombre, String apellido, long cedula) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
           }

    public ClsPersona() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

   
    
     @Override
    public String toString(){
    //return this.getId()+" "+this.getNombre();
    return this.getNombre();
    }
    
    
    
    
    
    
}
