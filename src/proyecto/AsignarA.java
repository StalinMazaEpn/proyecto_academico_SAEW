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
public class AsignarA implements Serializable {
    
    private long identificador;
    private String responsabilidad;
    private String nombreE;
    private int horasS;
    private int numS;
    private int puntajeA;
    int posicion;

    public AsignarA() {
    }
    
    

    public AsignarA(int posicion,long identificador,  String responsabilidad, String nombreE, int horasS, int numS, int puntajeA) {
        this.posicion = posicion;
        this.identificador = identificador;
        this.responsabilidad = responsabilidad;
        this.nombreE = nombreE;
        this.horasS = horasS;
        this.numS = numS;
        this.puntajeA = puntajeA;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    
    
    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public String getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(String responsabilidad) {
        this.responsabilidad = responsabilidad;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public int getHorasS() {
        return horasS;
    }

    public void setHorasS(int horasS) {
        this.horasS = horasS;
    }

    public int getNumS() {
        return numS;
    }

    public void setNumS(int numS) {
        this.numS = numS;
    }

    public int getPuntajeA() {
        return puntajeA;
    }

    public void setPuntajeA(int puntajeA) {
        this.puntajeA = puntajeA;
    }

    
    
    
    
    
}
