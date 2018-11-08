/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.StreamCorruptedException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author STALIN
 */
public class ClsControlador {
                 
    
    public void crear (String fichero) {
    
        ObjectOutputStream oos;
        try {
        
        oos = new ObjectOutputStream(new FileOutputStream(fichero));
        oos.close();
        } catch (FileNotFoundException ex) {
        
                 System.out.println(ex.getMessage());
        
        } catch (IOException ex) {
        
                System.out.println(ex.getMessage());
        }
        
        //crear un data
    }
    
    public void insertar (String fichero, ArrayList<Object> elementos) {
    
      try {
    
        ObjectOutputStream oos;
        oos = new ObjectOutputStream(new FileOutputStream(fichero));
                for (int i = 0; i < elementos.size(); i++) {
            
                            Object elemento = new Object();
                            elemento = elementos.get(i);
                            oos.writeObject(elemento);
                    }
            oos.close();
    
           } catch(Exception e) {
    
            System.out.println(e.getMessage());
                                 }                           
    //insertar elemento data
    }
    
    
    
    public ArrayList<Object> extraer (String fichero) {
    
    ArrayList<Object> objetos = new ArrayList<Object>();
    try {
    
            ObjectInputStream ois = new ObjectInputStream ( new FileInputStream(fichero));
            Object aux = ois.readObject();
            
            while (aux != null) {
            objetos.add(aux);
            aux = ois.readObject();
            }
         ois.close();
    } catch (FileNotFoundException ex) {
    
                crear(fichero);
      } catch (EOFException el) {
      //System.out.println("Fin de Fichero");
      } catch (Exception e2) {
      
            e2.printStackTrace();
      }
     //crea arraylist 
    return objetos;
    }
    
    
}
