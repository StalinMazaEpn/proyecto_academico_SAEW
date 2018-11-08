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
public class CursoSeminario implements Serializable {
    
    private long identificador;
    private int posicion;
    private String NombreSemi;
    private String Institucion;
    private int HorasSemi;

    public CursoSeminario() {
        this.HorasSemi = 0;
    }
    
    public CursoSeminario(long identificador,int posicion ,String NombreSemi, String Institucion, int HorasSemi) {
        this.posicion = posicion;
        this.NombreSemi = NombreSemi;
        this.Institucion = Institucion;
        this.HorasSemi = HorasSemi;
        this.identificador = identificador;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    

    public String getNombreSemi() {
        return NombreSemi;
    }

    public void setNombreSemi(String NombreSemi) {
        this.NombreSemi = NombreSemi;
    }

    public String getInstitucion() {
        return Institucion;
    }

    public void setInstitucion(String Institucion) {
        this.Institucion = Institucion;
    }

    public int getHorasSemi() {
        return HorasSemi;
    }

    public void setHorasSemi(int HorasSemi) {
        this.HorasSemi = HorasSemi;
    }

    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }
    
    
    
    public double PuntajeSemi(){
    double puntajeSem = 0;
    puntajeSem += HorasSemi;
    
    return puntajeSem;    
    }
    
    public String toString(){
        return 
                "\n"+this.getNombreSemi();
    }
    
    
    
}
