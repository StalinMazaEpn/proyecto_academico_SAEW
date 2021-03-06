
package proyecto;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class FrmLogin extends javax.swing.JFrame {
   public static final String BLACK = "\u001B[30m";
   public static final String RED = "\u001B[31m";
   public static final String BLUE = "\033[34m";
   public static final String GREEN = "\033[32m";
   public int dato = 0;
    ArrayList<ClsProfesor> profesores = new ArrayList<>();
    ArrayList<Object> profesores2 = new ArrayList<>();
    ArrayList<ClsAdministrador> administradores = new ArrayList<>();
    ArrayList<ClsProfesor> comparacion = new ArrayList<>();
    ArrayList<Object> maestros = new ArrayList<>();
    ClsAdministrador login = new ClsAdministrador(); 
    ClsProfesor leer = new ClsProfesor();
   int cont = 0; //me dice cuantos profesores tenga
   boolean comprobaciona ;
   boolean comprobacionp ;
   
    public FrmLogin() {
        initComponents();
        this.setTitle("LOGIN EPN");
        this.setResizable(false);
        BtnLogin.setBackground(Color.green);
        btnExit.setBackground(Color.red);
        ImageIcon fot = new ImageIcon("src/Imagenes/EPN.jpg");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(lblFondoLogin.getWidth(), lblFondoLogin.getHeight(), Image.SCALE_SMOOTH));
        lblFondoLogin.setIcon(icono);
        this.pack();
        ClsControlador control = new ClsControlador();
        maestros =control.extraer("profesores.dat");//el punto  dat es profesores
        ClsAdministrador adm1 = new ClsAdministrador (0,"Stalin", "Maza",1725452609);
        ClsAdministrador  adm2 =  new ClsAdministrador (1,"Mishel","Centeno",1224364860);
        administradores.add(adm1);
        administradores.add(adm2);
        txtUsuario.setEnabled(false);
        txtPassword.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblnombre = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lblcontrasenia = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        CMBOPCIONES = new javax.swing.JComboBox<>();
        BtnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        labelMP = new javax.swing.JLabel();
        lblFondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 0, 51));
        lblnombre.setText("ESCUELA POLITECNICA NACIONAL - ESFOT");
        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 378, 29));

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(255, 255, 255));
        lblusuario.setText("USUARIO:");
        getContentPane().add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 99, -1));

        lblcontrasenia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblcontrasenia.setForeground(new java.awt.Color(255, 255, 255));
        lblcontrasenia.setText("CONTRASEÑA:");
        getContentPane().add(lblcontrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 260, -1));

        txtPassword.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 260, -1));

        CMBOPCIONES.setBackground(new java.awt.Color(51, 255, 255));
        CMBOPCIONES.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CMBOPCIONES.setForeground(new java.awt.Color(255, 0, 51));
        CMBOPCIONES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "PROFESOR" }));
        CMBOPCIONES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMBOPCIONESActionPerformed(evt);
            }
        });
        getContentPane().add(CMBOPCIONES, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 173, 30));

        BtnLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnLogin.setText("INGRESAR");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 112, 40));

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 108, 40));
        getContentPane().add(labelMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 4, 130, 30));
        getContentPane().add(lblFondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void borrar () {
    txtUsuario.setText("");
    txtPassword.setText("");
    }
    
    public void habilitar () {
           txtUsuario.setEnabled(true);
           txtPassword.setEnabled(true);
    }
    
    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        ClsControlador control = new ClsControlador();
        maestros = control.extraer("profesores.dat");        
        String usuario = txtUsuario.getText();
        String clave = new String (txtPassword.getPassword());
    if ( CMBOPCIONES.getSelectedIndex() == 0 ) {
           int i ;
                   
           for (  i = 0; i < administradores.size(); i++) {
               login = (ClsAdministrador) administradores.get(i);
                if (usuario.equals(login.getNombre()) && (clave.equals(login.getClave()))) {                       
                                comprobaciona = false;
                                FrmAdministrador adm1 = new FrmAdministrador();
                                adm1.setVisible(true);
                                this.setVisible(false);
                                i = administradores.size();                               
                                } else { comprobaciona = true;}
           } 
           
           if (comprobaciona == true) {        
                     JOptionPane.showMessageDialog(null,"Usuario o Password Incorrecto","LOGIN FAIL",JOptionPane.ERROR_MESSAGE);
                    borrar(); }
                                                }    
    //otra parte
    if ( CMBOPCIONES.getSelectedIndex() == 1 ) {
           int j;
           for ( j = 0; j < maestros.size(); j++ ) {
               
                leer = (ClsProfesor) maestros.get(j);
                if (usuario.equals(leer.getNombre()) && (clave.equals(leer.getClave()))) {                        
                            comprobacionp = false;
                            FrmProfesor profesor1 = new FrmProfesor();                            
                            profesor1.CargarAsignacion ( leer.getCedula());
                            profesor1.CargarAcademica (leer.getCedula());
                            profesor1.CargarSeminario (leer.getCedula());
                            profesor1.CargarDT (leer.getCedula());
                            profesor1.CargarLT (leer.getCedula());
                            profesor1.txtIDP.setText(String.valueOf(leer.getId()));
                            profesor1.txtNP.setText(leer.getNombre());
                            profesor1.txtAP.setText(leer.getApellido());
                            profesor1.txtTP.setText(leer.getTitulo());
                            profesor1.txtCP.setText(String.valueOf(leer.getCedula()));
                            profesor1.txtPP.setText(String.valueOf(leer.getPuntaje()));
                            profesor1.setVisible(true);
                            this.setVisible(false);
                            j = maestros.size();
                        } else { comprobacionp = true;}               
            }//fin del if 1
            if ( comprobacionp == true) { JOptionPane.showMessageDialog(null,"Usuario o Password Incorrecto","LOGIN FAIL",JOptionPane.ERROR_MESSAGE);
                    borrar(); }
                                                      }
    }//GEN-LAST:event_BtnLoginActionPerformed
             
 
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int opcion=JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (opcion==JOptionPane.YES_OPTION){
            System.out.println("Has pulsado en SI");
            System.exit(0);
        }else if(opcion==JOptionPane.NO_OPTION){
            System.out.println("Has pulsado en NO");
                    }
        
    }//GEN-LAST:event_btnExitActionPerformed

    private void CMBOPCIONESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMBOPCIONESActionPerformed
       try { 
                if ( CMBOPCIONES.getSelectedIndex() == 0 || CMBOPCIONES.getSelectedIndex() == 1) {
           habilitar();
                }
        }catch(Exception ex) { System.out.println("Excepcion" + ex.getMessage());}
    }//GEN-LAST:event_CMBOPCIONESActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    public static javax.swing.JComboBox<String> CMBOPCIONES;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel labelMP;
    private javax.swing.JLabel lblFondoLogin;
    private javax.swing.JLabel lblcontrasenia;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblusuario;
    public static javax.swing.JPasswordField txtPassword;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
