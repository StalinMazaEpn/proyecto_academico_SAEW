package proyecto;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STALIN
 */
public class enviarD implements Serializable{
    int posicion;
    private long enviado;

    public enviarD() {
    }

    
    
    public enviarD(int posicion, long enviado) {
        this.enviado = enviado;
    }

    public long getEnviado() {
        return enviado;
    }

    public void setEnviado(long enviado) {
        this.enviado = enviado;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    
    
}
