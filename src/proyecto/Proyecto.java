/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

//import java.text.SimpleDateFormat;

import java.util.ArrayList;
import javax.swing.JOptionPane;

//import java.util.Date;

/**
 *
 * @author AdminPC
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String verificar = JOptionPane.showInputDialog("Ingrese Numero de Cedula");
        validarCedula prueba = new validarCedula();
        if ( prueba.getValidacion( verificar) == true ) {
        JOptionPane.showMessageDialog(null,"Cedula Valida");
        } else { JOptionPane.showMessageDialog(null,"Cedula Invalida"); }
    }
    
    
}
