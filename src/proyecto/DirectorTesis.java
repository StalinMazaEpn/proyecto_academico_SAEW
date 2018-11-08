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
public class DirectorTesis implements Serializable {
    private long identificador;
    private int posicion;
    private int puntajeDT;
    private String Carrera;
    private String Titulo;
    private String Graduados;
    private String FechaAprob;
    private String FechaGraduado;

    public DirectorTesis() {
        
    }

    public DirectorTesis(long identificador, int posicion,String Carrera, String Titulo, String Graduados,
                        String FechaAprob, String FechaGraduado, int puntajeDT) {
        this.posicion = posicion;
        this.Carrera = Carrera;
        this.Titulo = Titulo;
        this.Graduados = Graduados;
        this.FechaAprob = FechaAprob;
        this.FechaGraduado = FechaGraduado;
        this.identificador = identificador;
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

    public int getPuntajeDT() {
        return puntajeDT;
    }

    public void setPuntajeDT(int puntajeDT) {
        this.puntajeDT = puntajeDT;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getGraduados() {
        return Graduados;
    }

    public void setGraduados(String Graduados) {
        this.Graduados = Graduados;
    }

    public String getFechaAprob() {
        return FechaAprob;
    }

    public void setFechaAprob(String FechaAprob) {
        this.FechaAprob = FechaAprob;
    }

    public String getFechaGraduado() {
        return FechaGraduado;
    }

    public void setFechaGraduado(String FechaGraduado) {
        this.FechaGraduado = FechaGraduado;
    }

    public String toString(){
        return 
                "\n"+this.getGraduados()+"\n";
    }
    
}
