
package proyecto;

import java.io.Serializable;

/**
 *
 * @author STALIN
 */
public class LectorTesis implements Serializable {
    private long identificador;
    private int posicion;
    private String tituloLector;
    private String carreraLect;
    private int puntajeT;

    public LectorTesis() {
        this.puntajeT = 0;
    }

    public LectorTesis(long identificador, int posicion, String tituloLector, String carreraLect, int puntajeT) {
        this.posicion = posicion;
        this.identificador = identificador;
        this.tituloLector = tituloLector;
        this.carreraLect = carreraLect;
        this.puntajeT = puntajeT;
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

    public int getPuntajeT() {
        return puntajeT;
    }

    public void setPuntajeT(int puntajeT) {
        this.puntajeT = puntajeT;
    }

    
    public String getTituloLector() {
        return tituloLector;
    }

    public void setTituloLector(String tituloLector) {
        this.tituloLector = tituloLector;
    }

    public String getCarreraLect() {
        return carreraLect;
    }

    public void setCarreraLect(String carreraLect) {
        this.carreraLect = carreraLect;
    }
    
    
    public double puntajeLector(){
    double puntaje;
    
    puntaje = 6;
    return puntaje;
    }
         

    public String toString(){
        return 
                "\n"+this.getTituloLector()+"\n";
    }  
    
    
    
}
