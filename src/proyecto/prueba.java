/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AdminPC
 */
public class prueba extends javax.swing.JFrame {
DefaultTableModel modelo = new DefaultTableModel();
  
ArrayList<ClsProfesor> profesores = new ArrayList<>();


        int cont = 0;
        int puntuacion = 0;
        int total = 0;
        int parcial = 0;
        
    public prueba() {
        initComponents();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nª Horas");
        modelo.addColumn("Puntaje");
        Tabla.setModel(modelo);
        
       
        //ClsProfesor prof1 = new ClsProfesor(0,"Juan",1234567892,"Ing.Quimico");
       // profesores.add(prof1s;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        verLista = new javax.swing.JButton();
        copy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jLabel1.setText("nombre");

        jLabel2.setText("cedula");

        jLabel3.setText("titulo");

        agregar.setText("Guardar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        nuevo.setText("nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        modificar.setText("modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setText("eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        verLista.setText("LISTA");
        verLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verListaActionPerformed(evt);
            }
        });

        copy.setText("copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(37, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(copy)
                        .addGap(72, 72, 72)
                        .addComponent(nuevo)
                        .addGap(72, 72, 72)
                        .addComponent(modificar)
                        .addGap(71, 71, 71)
                        .addComponent(eliminar)))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtCedula)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verLista, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(verLista)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nuevo)
                            .addComponent(modificar)
                            .addComponent(eliminar))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(copy)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static int diferenciaFechaDias(Date fechaMayor, Date fechaMenor) {
//long diferenciaEn_ms = fechaMayor.getTime() – fechaMenor.getTime();
//long dias = diferenciaEn_ms / (1000 * 60 * 60 * 24);
long dias = 0;
return (int) dias;
}
    
    
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        
        String Dato [] = new String [4];
        String Dato2 [] = new String [4];
        int posicion = 2;
        
        //ClsProfesor profesor = new ClsProfesor(cont,txtNombre.getText(), "Marco",Long.parseLong(txtCedula.getText()),txtTitulo.getText(),900);
        //profesores.add(profesor);
    
        Dato[0] = String.valueOf(cont);
        Dato[1] = txtNombre.getText();
        
        Dato[2] = txtCedula.getText();
        puntuacion = Integer.parseInt(txtCedula.getText()) * 2 ;
        parcial = parcial + puntuacion;
        Dato[3] = String.valueOf(puntuacion);
         total = parcial ; 
        Dato2[3] = String.valueOf(total);
        modelo.addRow(Dato);
        modelo.addRow(Dato2);
        cont++;
        
        
        System.out.println("En donde esta el contador" + cont);
    }//GEN-LAST:event_agregarActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtCedula.setText("");
        txtTitulo.setText("");
        txtNombre.requestFocus();
    }//GEN-LAST:event_nuevoActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        
       
        int FilaSelec = Tabla.getSelectedRow();
        int aux = FilaSelec;
        if ( FilaSelec >= 0 ){
        
        txtNombre.setText(Tabla.getValueAt(FilaSelec, 1).toString());
        txtCedula.setText(Tabla.getValueAt(FilaSelec, 2).toString());
        txtTitulo.setText(Tabla.getValueAt(FilaSelec, 3).toString());
   //     profesores.get(aux).setNombre(txtNombre.getText());
        modelo.removeRow(aux);
     //   profesores.get(aux).setCedula(Long.parseLong(txtCedula.getText()));
       // profesores.get(aux).setTitulo(txtTitulo.getText());
        //profesores.remove(aux);
        
        //profesores.remove(FilaSelec);
        //ClsProfesor auxiliar = new ClsProfesor(cont,txtNombre.getText(),Long.parseLong(txtCedula.getText()),txtTitulo.getText());
        //profesores.add(auxiliar);
        
        } else {
        
            JOptionPane.showMessageDialog(null,"Fila No Seleccionada");
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        
        int FilaSelec = Tabla.getSelectedRow();
        if ( FilaSelec >=0 ){
        
        modelo.removeRow(FilaSelec);
        //profesores.remove(FilaSelec);
        
        
        } else {
        
            JOptionPane.showMessageDialog(null,"Fila No Seleccionada");
        }
        
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void verListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verListaActionPerformed
        // TODO add your handling code here:
        for ( ClsProfesor  profe : profesores  ) {
                   JOptionPane.showMessageDialog(null,"Nombre del Empleado: " + profe.getNombre() + 
                           "\nTitulo del Empleado: " + profe.getTitulo() 
                           + "\nCedula del Empleado: " + profe.getCedula()
                           + "\n.................................." );
                   
                  // JOptionPane.showMessageDialog(null,"Nombre del Empleado: " + profe.getNombre());
                   //System.out.println("Nombre del Empleado: " + profe.getNombre());
                   //System.out.println("Titulo del Empleado: " + profe.getTitulo());
                   //System.out.println("..................................");
                 } 
        int i = 0;
        profesores.get(i).getNombre();
    }//GEN-LAST:event_verListaActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        // TODO add your handling code here:
        
        for ( int i = 0; i < profesores.size(); i++) {
        
           // teachers.get(i) = profesores.get(i);
        
        }
        
        
        
    }//GEN-LAST:event_copyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton agregar;
    private javax.swing.JButton copy;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JButton verLista;
    // End of variables declaration//GEN-END:variables
}
