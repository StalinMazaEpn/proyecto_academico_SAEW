
package proyecto;

import java.text.DecimalFormat;
import java.io.Serializable;

/**
 *
 * @author STALIN
 */
public class CargaAcademica  implements Serializable {
    private long identificador;
    private int posicion;
    private String codigo;
    private String asignatura;
    private int numEstudiantes;
    private int HorTeoricas;
    private int HorLaboratorio;
    private int FactorTeorico;
    private int FactorLaboratorio;
    private double puntaje;
    DecimalFormat df = new DecimalFormat("0.00");
    
    public CargaAcademica( ) {
        this.puntaje = 0;
    }

    public CargaAcademica(long identificador, int posicion, String codigo, String asignatura, int numEstudiantes,
            int HorTeoricas, int HorLaboratorio, int FactorTeorico, int FactorLaboratorio, double puntaje) {
        
        this.posicion = posicion;
        this.identificador = identificador;
        this.codigo = codigo;
        this.asignatura = asignatura;
        this.numEstudiantes = numEstudiantes;
        this.HorTeoricas = HorTeoricas;
        this.HorLaboratorio = HorLaboratorio;
        this.FactorTeorico = FactorTeorico;
        this.FactorLaboratorio = FactorLaboratorio;
        this.puntaje = puntaje;
    }

    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public int getHorTeoricas() {
        return HorTeoricas;
    }

    public void setHorTeoricas(int HorTeoricas) {
        this.HorTeoricas = HorTeoricas;
    }

    public int getHorLaboratorio() {
        return HorLaboratorio;
    }

    public void setHorLaboratorio(int HorLaboratorio) {
        this.HorLaboratorio = HorLaboratorio;
    }

    public int getFactorTeorico() {
        return FactorTeorico;
    }

    public void setFactorTeorico(int FactorTeorico) {
        this.FactorTeorico = FactorTeorico;
    }

    public int getFactorLaboratorio() {
        return FactorLaboratorio;
    }

    public void setFactorLaboratorio(int FactorLaboratorio) {
        this.FactorLaboratorio = FactorLaboratorio;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public DecimalFormat getDf() {
        return df;
    }

    public void setDf(DecimalFormat df) {
        this.df = df;
    }

 public String toString(){
        return 
                "\n"+this.getCodigo()+"\n";
    }
    
    
    
    
    
    
}
