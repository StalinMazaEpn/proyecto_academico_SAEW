/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.Serializable;



public class ClsProfesor extends ClsPersona implements Serializable  {
    
 private String titulo;
 private String clave;
 private int puntaje;


    public ClsProfesor() {
        super();
        this.puntaje = 0;
    }

    public ClsProfesor(int id, String nombre, String apellido, long cedula, String titulo , int puntaje) {
        super(id, nombre,apellido, cedula);
        this.titulo = titulo;
        this.clave = nombre+123;
        this.puntaje = puntaje;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
     

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
 
    
    
  @Override
    public String toString(){
    //return this.getId()+" "+this.getNombre();
    return this.getNombre();
    }
    
}
