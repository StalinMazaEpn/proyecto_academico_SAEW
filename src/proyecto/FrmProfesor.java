package proyecto;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class FrmProfesor extends javax.swing.JFrame {
    //tablas
    DefaultTableModel modeloCA = new DefaultTableModel(); //carga academica
    DefaultTableModel modeloDT = new DefaultTableModel(); //director de Tesis
    DefaultTableModel modeloAA = new DefaultTableModel(); //asignacion actividades
    DefaultTableModel modeloCS = new DefaultTableModel(); //curso seminario
    DefaultTableModel modeloLT = new DefaultTableModel(); //lectorTesis
    //arrays para cada pestaña y su contador
    ArrayList<Object> maestros = new ArrayList<>();
    ArrayList<Object> cargaA = new ArrayList<>();
    int contCarga = 0;
    ArrayList<Object> cursoS = new ArrayList<>();
    int contCursoS = 0;
    ArrayList<Object> directorT = new ArrayList<>();
    int contDirectorT= 0;
    ArrayList<Object> lectorTesis = new ArrayList<>();
    int contLectorT = 0;
    ArrayList<Object> asignacionA = new ArrayList<>();
    int contAsignar = 0;
    ArrayList<Object> confirmar = new ArrayList<>();
    //guarda puntaje total
    int puntajeTotal = 0;
    //guarda puntajes parciales 
    int totalCS = 0;
    double parcialCA = 0;
    int parcialDT = 0;
    int parcialLT = 0;
    int parcialAA = 0;
    int cont = 0;
    ClsControlador control = new ClsControlador();
    public FrmProfesor() {
        initComponents();
        this.setTitle("MENU USUARIO PROFESOR - BIENVENIDO");
        this.setResizable(false);
        BtnR1.setBackground(Color.green);
        BtnSalida.setBackground(Color.red);
        
     //controlador e iniciando perfil
        maestros = control.extraer("profesores.dat");
        if (maestros.size() > 0){
                ClsProfesor ultima=(ClsProfesor) maestros.get(maestros.size()-1);
                cont = ultima.getId()+1;
        }
        
        asignacionA = control.extraer("asignacionA.dat");
         if (asignacionA.size() > 0){
                AsignarA ultima=(AsignarA) asignacionA.get(asignacionA.size()-1);
                contAsignar = ultima.getPosicion()+1;
        }
     
         cargaA = control.extraer("cargaA.dat");
         if (cargaA.size() > 0){
                CargaAcademica ultima=(CargaAcademica) cargaA.get(cargaA.size()-1);
                contCarga = ultima.getPosicion()+1;
         }
         
         cursoS = control.extraer("cursoS.dat");
         if (cursoS.size() > 0){
                CursoSeminario ultima =(CursoSeminario) cursoS.get(cursoS.size()-1);
                contCursoS = ultima.getPosicion()+1;
         }
         
         directorT = control.extraer("directorT.dat");
         if (directorT.size() > 0){
                DirectorTesis ultima =(DirectorTesis) directorT.get(directorT.size()-1);
                contDirectorT = ultima.getPosicion()+1;
         }
         
         lectorTesis = control.extraer("lectorT.dat");
         if (lectorTesis.size() > 0){
                LectorTesis ultima =(LectorTesis) lectorTesis.get(lectorTesis.size()-1);
                contLectorT = ultima.getPosicion()+1;
         }
        //dibujando tabla Carga Academica
        modeloCA.addColumn("Codigo");
        modeloCA.addColumn("Asignatura");
        modeloCA.addColumn("Numero Estudiantes");
        modeloCA.addColumn("Horas Teoricas");
        modeloCA.addColumn("Horas Laboratorio");
        modeloCA.addColumn("Factor Teorico");
        modeloCA.addColumn("Factor Laboratorio");
        modeloCA.addColumn("Puntaje");
        TablaCA.setModel(modeloCA);
        // dibujando tabla Curso Seminarios
        modeloCS.addColumn("Curso o Seminario");
        modeloCS.addColumn("Institucion Oferente");
        modeloCS.addColumn("Horas");
        TablaCS.setModel(modeloCS);
        // dibujando tabla Asignacion Actividades
        modeloAA.addColumn("Responsabilidad Tec/Adm");
        modeloAA.addColumn("Nombre Estudiante");
        modeloAA.addColumn("Horas Seminarios");
        modeloAA.addColumn("Num Seminarios");
        modeloAA.addColumn("Horas Totales");
        TablaAA.setModel(modeloAA);
        // dibujando tabla director de Tesis
        modeloDT.addColumn("Carrera");
        modeloDT.addColumn("Tema");
        modeloDT.addColumn("Graduado(s)");
        modeloDT.addColumn("Fecha Aprob");
        modeloDT.addColumn("Fecha Grad");
        modeloDT.addColumn("Horas");
        TablaGraduados.setModel(modeloDT);
        // dibujando tabla Lector de Tesis
        modeloLT.addColumn("Tema");
        modeloLT.addColumn("Carrera");
        modeloLT.addColumn("Horas");
        TablaLT.setModel(modeloLT);
        
      //DIBUJANDO TABLA GRADUADOS
                //bloqueando Txt Perfil
        txtNP.setEnabled(false);
        txtAP.setEnabled(false);
        txtTP.setEnabled(false);
        txtCP.setEnabled(false);
        txtPP.setEnabled(false);
        dib();
        dib2();
    }    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAP = new javax.swing.JTextField();
        txtTP = new javax.swing.JTextField();
        txtCP = new javax.swing.JTextField();
        txtPP = new javax.swing.JTextField();
        lblperfil = new javax.swing.JLabel();
        txtIDP = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtTituloT = new javax.swing.JTextField();
        txtCarreraT = new javax.swing.JTextField();
        btnGuardarT = new javax.swing.JButton();
        btnModificarT = new javax.swing.JButton();
        btnEliminarT = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaLT = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        lblTotalLT = new javax.swing.JLabel();
        txtTotalLT = new javax.swing.JTextField();
        btnNuevoLT = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCarreraD = new javax.swing.JTextField();
        txtTituloD = new javax.swing.JTextField();
        txtGraduadosD = new javax.swing.JTextField();
        btnGuardarD = new javax.swing.JButton();
        btnModificarD = new javax.swing.JButton();
        btnEliminarD = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaGraduados = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        txtTotalD = new javax.swing.JTextField();
        btnNuevoDT = new javax.swing.JButton();
        Calendario1 = new com.toedter.calendar.JDateChooser();
        Calendario2 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNS = new javax.swing.JTextField();
        txtIS = new javax.swing.JTextField();
        txtHorasS = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCS = new javax.swing.JTable();
        btnGuardarCS = new javax.swing.JButton();
        btnModificarCS = new javax.swing.JButton();
        btnEliminarCS = new javax.swing.JButton();
        txtNotaFCS = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btnNuevoCS = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCA = new javax.swing.JTable();
        txtCodigoCA = new javax.swing.JTextField();
        txtAsignaturaCA = new javax.swing.JTextField();
        txtNECA = new javax.swing.JTextField();
        txtHTCA = new javax.swing.JTextField();
        txtHLCA = new javax.swing.JTextField();
        lbltesis = new javax.swing.JLabel();
        btnGuardarCA = new javax.swing.JButton();
        bntModificarCA = new javax.swing.JButton();
        bntEliminarCA = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtNotaFCA = new javax.swing.JTextField();
        btnNuevoCA = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtNA = new javax.swing.JTextField();
        txtHorasA = new javax.swing.JTextField();
        btnGuardarA = new javax.swing.JButton();
        btnModificarA = new javax.swing.JButton();
        btnEliminarA = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaAA = new javax.swing.JTable();
        CmbResponsabilidad = new javax.swing.JComboBox<>();
        lblParcialAA = new javax.swing.JLabel();
        txtParcialAA = new javax.swing.JTextField();
        btnNuevoAA = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        BtnR1 = new javax.swing.JButton();
        BtnSalida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));

        jTabbedPane1.setBackground(new java.awt.Color(255, 51, 51));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("NOMBRE:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 57, 60, -1));

        txtNP.setText("                   ");
        jPanel1.add(txtNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 54, 200, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("APELLIDOS:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 94, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("TITULOS:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 128, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("CEDULA:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 159, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("PUNTAJE:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        txtAP.setText("                  ");
        txtAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAPActionPerformed(evt);
            }
        });
        jPanel1.add(txtAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 91, 200, -1));

        txtTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTPActionPerformed(evt);
            }
        });
        jPanel1.add(txtTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 125, 200, -1));
        jPanel1.add(txtCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 156, 200, -1));
        jPanel1.add(txtPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 200, -1));
        jPanel1.add(lblperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 34, 472, 335));

        txtIDP.setEditable(false);
        txtIDP.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.add(txtIDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 25, -1));

        btnActualizar.setBackground(new java.awt.Color(204, 204, 0));
        btnActualizar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnActualizar.setText("ACTUALIZAR PUNTAJE");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 190, 40));

        jTabbedPane1.addTab("PERFIL", jPanel1);

        jPanel5.setBackground(new java.awt.Color(255, 0, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("TEMA:");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 72, 50, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("CARRERA:");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 115, -1, -1));
        jPanel5.add(txtTituloT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 200, -1));
        jPanel5.add(txtCarreraT, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 112, 200, -1));

        btnGuardarT.setBackground(new java.awt.Color(51, 204, 255));
        btnGuardarT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardarT.setText("GUARDAR");
        btnGuardarT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTActionPerformed(evt);
            }
        });
        jPanel5.add(btnGuardarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 80, 36));

        btnModificarT.setBackground(new java.awt.Color(255, 51, 204));
        btnModificarT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificarT.setText("MODIFICAR");
        btnModificarT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarTActionPerformed(evt);
            }
        });
        jPanel5.add(btnModificarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 160, 90, 38));

        btnEliminarT.setBackground(new java.awt.Color(153, 153, 0));
        btnEliminarT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminarT.setText("ELIMINAR");
        btnEliminarT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTActionPerformed(evt);
            }
        });
        jPanel5.add(btnEliminarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 80, 40));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TablaLT.setBackground(new java.awt.Color(153, 255, 255));
        TablaLT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TablaLT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaLT.setGridColor(new java.awt.Color(255, 51, 51));
        jScrollPane4.setViewportView(TablaLT);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 2, 835, 321));

        jLabel24.setText("jLabel24");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 437, -1, -1));

        lblTotalLT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalLT.setForeground(new java.awt.Color(204, 0, 0));
        lblTotalLT.setText("TOTAL:");
        jPanel5.add(lblTotalLT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 340, 60, 30));
        jPanel5.add(txtTotalLT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 340, 80, 30));

        btnNuevoLT.setBackground(new java.awt.Color(255, 255, 51));
        btnNuevoLT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevoLT.setForeground(new java.awt.Color(0, 0, 204));
        btnNuevoLT.setText("NUEVO");
        btnNuevoLT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevoLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoLTActionPerformed(evt);
            }
        });
        jPanel5.add(btnNuevoLT, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 80, 30));

        jTabbedPane1.addTab("LECTOR DE TESIS", jPanel5);

        jPanel4.setBackground(new java.awt.Color(51, 255, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("CARRERA:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 85, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("TITULO:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 123, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("GRADUADO:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 154, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("FECHA APROBACION :");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 182, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("FECHA GRADUACION :");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 211, -1, -1));
        jPanel4.add(txtCarreraD, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 82, 190, -1));

        txtTituloD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloDActionPerformed(evt);
            }
        });
        jPanel4.add(txtTituloD, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 120, 190, -1));
        jPanel4.add(txtGraduadosD, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 151, 190, -1));

        btnGuardarD.setBackground(new java.awt.Color(0, 204, 255));
        btnGuardarD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardarD.setText("GUARDAR");
        btnGuardarD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDActionPerformed(evt);
            }
        });
        jPanel4.add(btnGuardarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 246, 88, 46));

        btnModificarD.setBackground(new java.awt.Color(255, 102, 255));
        btnModificarD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificarD.setText("MODIFICAR");
        btnModificarD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 100, 46));

        btnEliminarD.setBackground(new java.awt.Color(153, 153, 0));
        btnEliminarD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminarD.setText("ELIMINAR");
        btnEliminarD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 90, 42));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TablaGraduados.setBackground(new java.awt.Color(51, 255, 255));
        TablaGraduados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TablaGraduados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaGraduados.setGridColor(new java.awt.Color(255, 0, 51));
        jScrollPane3.setViewportView(TablaGraduados);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 13, 757, 260));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 0, 0));
        jLabel27.setText("TOTAL:");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 250, 60, 30));
        jPanel4.add(txtTotalD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 250, 70, 30));

        btnNuevoDT.setBackground(new java.awt.Color(255, 255, 153));
        btnNuevoDT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevoDT.setForeground(new java.awt.Color(0, 51, 204));
        btnNuevoDT.setText("NUEVO");
        btnNuevoDT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevoDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoDTActionPerformed(evt);
            }
        });
        jPanel4.add(btnNuevoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 80, 40));
        jPanel4.add(Calendario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 200, -1));
        jPanel4.add(Calendario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 200, -1));

        jTabbedPane1.addTab("DIRECTOR DE TESIS(GRADUADOS)", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("NOMBRE:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 81, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("INSTITUCION:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 119, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("HORAS:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 157, 60, 20));
        jPanel3.add(txtNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 78, 170, -1));
        jPanel3.add(txtIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 116, 170, -1));
        jPanel3.add(txtHorasS, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 154, 170, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TablaCS.setBackground(new java.awt.Color(0, 204, 255));
        TablaCS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TablaCS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaCS.setGridColor(new java.awt.Color(255, 0, 51));
        jScrollPane2.setViewportView(TablaCS);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 2, 852, 337));

        btnGuardarCS.setBackground(new java.awt.Color(51, 204, 255));
        btnGuardarCS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardarCS.setText("GUARDAR");
        btnGuardarCS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardarCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCSActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardarCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 90, 40));

        btnModificarCS.setBackground(new java.awt.Color(255, 51, 153));
        btnModificarCS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificarCS.setText("MODIFICAR");
        btnModificarCS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificarCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCSActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificarCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 90, 40));

        btnEliminarCS.setBackground(new java.awt.Color(153, 153, 0));
        btnEliminarCS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminarCS.setText("ELIMINAR");
        btnEliminarCS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCSActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 90, 50));

        txtNotaFCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotaFCSActionPerformed(evt);
            }
        });
        jPanel3.add(txtNotaFCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 360, 80, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 51, 51));
        jLabel25.setText("TOTAL:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1154, 358, 53, -1));

        btnNuevoCS.setBackground(new java.awt.Color(255, 255, 153));
        btnNuevoCS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevoCS.setForeground(new java.awt.Color(51, 51, 255));
        btnNuevoCS.setText("NUEVO");
        btnNuevoCS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevoCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCSActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevoCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 70, 30));

        jTabbedPane1.addTab("CURSOS-SEMINARIOS", jPanel3);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("CODIGO:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("ASIGNATURA:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Nª ESTUDIANTE:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 89, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("HORAS TEORICAS:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("HORAS LABORATORIO:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 217, 140, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TablaCA.setBackground(new java.awt.Color(0, 255, 255));
        TablaCA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaCA.setGridColor(new java.awt.Color(255, 51, 51));
        jScrollPane1.setViewportView(TablaCA);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 22, 865, 200));
        jPanel2.add(txtCodigoCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 200, -1));
        jPanel2.add(txtAsignaturaCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 200, -1));
        jPanel2.add(txtNECA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 200, -1));
        jPanel2.add(txtHTCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 200, -1));
        jPanel2.add(txtHLCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 200, -1));
        jPanel2.add(lbltesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 700, 130));

        btnGuardarCA.setBackground(new java.awt.Color(0, 255, 255));
        btnGuardarCA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardarCA.setText("GUARDAR");
        btnGuardarCA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardarCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCAActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardarCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 100, 38));

        bntModificarCA.setBackground(new java.awt.Color(255, 51, 204));
        bntModificarCA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntModificarCA.setText("MODIFICAR");
        bntModificarCA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntModificarCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntModificarCAActionPerformed(evt);
            }
        });
        jPanel2.add(bntModificarCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 90, 38));

        bntEliminarCA.setBackground(new java.awt.Color(153, 153, 0));
        bntEliminarCA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntEliminarCA.setText("ELIMINAR");
        bntEliminarCA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntEliminarCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEliminarCAActionPerformed(evt);
            }
        });
        jPanel2.add(bntEliminarCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 89, 40));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 51, 51));
        jLabel26.setText("TOTAL:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 240, 50, 25));
        jPanel2.add(txtNotaFCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 280, 92, 29));

        btnNuevoCA.setBackground(new java.awt.Color(255, 255, 204));
        btnNuevoCA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevoCA.setForeground(new java.awt.Color(51, 0, 255));
        btnNuevoCA.setText("NUEVO");
        btnNuevoCA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevoCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCAActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevoCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 80, 30));

        jTabbedPane1.addTab("CARGA ACADEMICA", jPanel2);

        jPanel6.setBackground(new java.awt.Color(0, 153, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("RESPONSABILIDAD: ");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("NOMBRE: ");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("HORAS: ");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 121, -1, -1));
        jPanel6.add(txtNA, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 77, 210, -1));

        txtHorasA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorasAActionPerformed(evt);
            }
        });
        jPanel6.add(txtHorasA, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 118, 210, -1));

        btnGuardarA.setBackground(new java.awt.Color(0, 204, 204));
        btnGuardarA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardarA.setText("GUARDAR");
        btnGuardarA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAActionPerformed(evt);
            }
        });
        jPanel6.add(btnGuardarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 80, 40));

        btnModificarA.setBackground(new java.awt.Color(255, 51, 153));
        btnModificarA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificarA.setText("MODIFICAR");
        btnModificarA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAActionPerformed(evt);
            }
        });
        jPanel6.add(btnModificarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 92, 37));

        btnEliminarA.setBackground(new java.awt.Color(153, 153, 0));
        btnEliminarA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminarA.setText("ELIMINAR");
        btnEliminarA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAActionPerformed(evt);
            }
        });
        jPanel6.add(btnEliminarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 75, 40));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TablaAA.setBackground(new java.awt.Color(0, 204, 255));
        TablaAA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TablaAA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaAA.setGridColor(new java.awt.Color(255, 0, 0));
        jScrollPane5.setViewportView(TablaAA);

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 15, 813, 210));

        CmbResponsabilidad.setBackground(new java.awt.Color(153, 153, 255));
        CmbResponsabilidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CmbResponsabilidad.setForeground(new java.awt.Color(51, 0, 204));
        CmbResponsabilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comision", "Tutorias" }));
        CmbResponsabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbResponsabilidadActionPerformed(evt);
            }
        });
        jPanel6.add(CmbResponsabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 29, 150, 30));

        lblParcialAA.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblParcialAA.setForeground(java.awt.Color.red);
        lblParcialAA.setText("TOTAL");
        jPanel6.add(lblParcialAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1148, 276, 65, 33));

        txtParcialAA.setEditable(false);
        jPanel6.add(txtParcialAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1231, 277, 73, 37));

        btnNuevoAA.setBackground(new java.awt.Color(255, 255, 153));
        btnNuevoAA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevoAA.setForeground(new java.awt.Color(51, 0, 204));
        btnNuevoAA.setText("NUEVO");
        btnNuevoAA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevoAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAAActionPerformed(evt);
            }
        });
        jPanel6.add(btnNuevoAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 80, 30));

        jTabbedPane1.addTab("ASIGNACION DE ACTIVIDADES", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BtnR1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnR1.setText("REGRESAR");
        BtnR1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnR1ActionPerformed(evt);
            }
        });

        BtnSalida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnSalida.setText("EXIT");
        BtnSalida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnR1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnR1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void imprimirConsolaAsignacion () {
        asignacionA = control.extraer("asignacionA.dat");
        System.out.println("Tamaño asignacion dataA: " + asignacionA.size());
        for (int i = 0; i <asignacionA.size(); i++) {
           AsignarA lectura = new AsignarA();
           lectura = (AsignarA) asignacionA.get(i);
           System.out.println("Identificador " + lectura.getIdentificador());
           System.out.println("Posicion " + lectura.getPosicion());
           System.out.println("Responsabilidad: " + lectura.getResponsabilidad());
           System.out.println("Nombre: " + lectura.getNombreE());
           System.out.println("Horas Sem: " + lectura.getHorasS());
           System.out.println("Numero Sem: " + lectura.getNumS());
           System.out.println("PuntajeAA: " + lectura.getPuntajeA());           
        }  
    }
    
    private void txtAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAPActionPerformed
       
    }//GEN-LAST:event_txtAPActionPerformed
 
    public int publicarP() {
       int casteo = (int)parcialCA;
       int puntajeTotal = totalCS + casteo + parcialDT + parcialLT + parcialAA;
       txtPP.setText(String.valueOf(puntajeTotal)); 
       return puntajeTotal;
    }
    
    public void asignarP() {
       txtPP.setText(String.valueOf(publicarP()));
       long identificar = Long.parseLong(txtCP.getText()); 
       int casteo = (int)parcialCA;
       int puntajeTotal = totalCS + casteo + parcialDT + parcialLT + parcialAA;
      ClsProfesor leer = new ClsProfesor(); 
      maestros = control.extraer("profesores.dat");
       for (int i = 0; i< maestros.size(); i++ ) {
            
             leer = (ClsProfesor) maestros.get(i);
             if ( leer.getCedula() == identificar) {
                 leer.setPuntaje(puntajeTotal); 
                          }
                     }           
        control.insertar("profesores.dat", maestros);       
    }
    
    
    public void CargarAsignacion ( long comparar ) {
    
     String Dato [] = new String [5];     
     for ( int i = 0; i < asignacionA.size(); i++) {
          AsignarA leer = new AsignarA();
          leer = (AsignarA) asignacionA.get(i);
        if (leer.getIdentificador() == comparar) {  
          Dato [0] = leer.getResponsabilidad();
          Dato [1] = String.valueOf(leer.getHorasS());
          Dato [2] = String.valueOf(leer.getHorasS());
          Dato [3] = String.valueOf(leer.getNumS());
          Dato [4] = String.valueOf(leer.getPuntajeA());
          parcialAA = parcialAA+ Integer.parseInt(Dato[4]);
          modeloAA.addRow(Dato);
          i = asignacionA.size();
        }    
           }
     txtParcialAA.setText(String.valueOf(parcialAA));
    }
    
    
    
    public void CargarAcademica (long comparar) {
    
     String Dato [] = new String [8];
     int casteo = 0;
     for ( int i = 0; i < cargaA.size(); i++) {
          CargaAcademica leer = new CargaAcademica();
          leer = (CargaAcademica) cargaA.get(i);
          if (leer.getIdentificador() == comparar) { 
          Dato [0] = leer.getCodigo();
          Dato [1] = leer.getAsignatura();
          Dato [2] = String.valueOf(leer.getNumEstudiantes());
          Dato [3] = String.valueOf(leer.getHorTeoricas());
          Dato [4] = String.valueOf(leer.getHorLaboratorio());
          Dato [5] = String.valueOf(leer.getFactorTeorico());
          Dato [6] = String.valueOf(leer.getFactorLaboratorio());
          Dato [7] = String.valueOf(leer.getPuntaje());
          casteo = (int)Double.parseDouble(Dato[7]);
          parcialCA = parcialCA+ casteo ;
          modeloCA.addRow(Dato);
          i = cargaA.size();
     }
           }
     txtNotaFCA.setText(String.valueOf(parcialCA));
    }
    
    public void CargarSeminario (long comparar) {
     String Dato [] = new String [3];
     for ( int i = 0; i < cursoS.size(); i++) {
          CursoSeminario leer = new CursoSeminario();
          leer = (CursoSeminario) cursoS.get(i);
          if (leer.getIdentificador() == comparar ) {
          Dato [0] = leer.getNombreSemi();
          Dato [1] = leer.getInstitucion();
          Dato [2] = String.valueOf(leer.PuntajeSemi());
          int casteo = (int)Double.parseDouble(Dato[2]);
          totalCS = totalCS + casteo;
          modeloCS.addRow(Dato);
          i = cursoS.size();
          }
           }
     txtNotaFCS.setText(String.valueOf(totalCS));
    }
    
    
    public void CargarDT ( long comparar) {
    
     String Dato [] = new String [6];
     
     for ( int i = 0; i < directorT.size(); i++) {
          DirectorTesis leer = new DirectorTesis();
          leer = (DirectorTesis) directorT.get(i);
          if (leer.getIdentificador() == comparar) {
          Dato [0] = leer.getCarrera();
          Dato [1] = leer.getTitulo();
          Dato [2] = leer.getGraduados();
          Dato [3] = leer.getFechaAprob();
          Dato [4] = leer.getFechaGraduado();
          Dato [5] = String.valueOf(leer.getPuntajeDT());
          parcialDT = parcialDT+ Integer.parseInt(Dato[5]);
          modeloDT.addRow(Dato);
          i=directorT.size();
         }
           }
     txtTotalD.setText(String.valueOf(parcialDT));
    }
    
    
    
    public void CargarLT (long comparar) {
    
     String Dato [] = new String [3];
    
     for ( int i = 0; i < lectorTesis.size(); i++) {
          LectorTesis leer = new LectorTesis();
          leer = (LectorTesis) lectorTesis.get(i);
          if (leer.getIdentificador() == comparar) {
          Dato [0] = leer.getTituloLector();
          Dato [1] = leer.getCarreraLect();
          Dato [2] = String.valueOf(leer.getPuntajeT());
          parcialLT = parcialLT+ Integer.parseInt(Dato[2]);
          modeloLT.addRow(Dato);
          i = lectorTesis.size();
          }
          }
     txtTotalLT.setText(String.valueOf(parcialLT));
    }
    public void dib () {
        
        ImageIcon imagen = new ImageIcon("src/Imagenes/profes.jpg");
        Icon icon1 = new ImageIcon(imagen.getImage().getScaledInstance(lblperfil.getWidth(),lblperfil.getHeight(),Image.SCALE_DEFAULT));
        lblperfil.setIcon(icon1);
        this.pack();       
    }
    
     public void dib2 () {         
        ImageIcon imagen2 = new ImageIcon("src/Imagenes/lector.jpg");
        Icon icon2 = new ImageIcon(imagen2.getImage().getScaledInstance(lbltesis.getWidth(),lbltesis.getHeight(),Image.SCALE_DEFAULT));
        lbltesis.setIcon(icon2);
        this.pack();
    }
    
    private void txtTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTPActionPerformed

    private void txtHorasAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorasAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorasAActionPerformed

    private void btnEliminarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAActionPerformed
        // TODO add your handling code here:
        long identificar = Long.parseLong(txtCP.getText());
        String responsabilidad,nombre;
        int FilaSelecAA = TablaAA.getSelectedRow();
        int auxAA = FilaSelecAA;
        int puntajeS, numH,numS;
        
        if ( FilaSelecAA >=0 ){
            responsabilidad = TablaAA.getValueAt(FilaSelecAA,0).toString();
            nombre = TablaAA.getValueAt(FilaSelecAA,1).toString();
            numH = Integer.parseInt(TablaAA.getValueAt(FilaSelecAA, 2).toString());
            numS = Integer.parseInt(TablaAA.getValueAt(FilaSelecAA, 3).toString());
            puntajeS = Integer.parseInt(TablaAA.getValueAt(FilaSelecAA,4).toString());
            parcialAA = parcialAA - puntajeS;
            txtParcialAA.setText(String.valueOf(parcialAA));
            for (int i = 0; i< asignacionA.size(); i++ ) {
                AsignarA obtener = new AsignarA ();
                obtener = (AsignarA) asignacionA.get(i);
                if ( obtener.getNombreE() == nombre ) {
                        AsignarA obtener2 = (AsignarA) asignacionA.get(i);
                        asignacionA.remove(obtener2);
                        i = maestros.size();
                        }             
                    }                
        control.insertar("asignacionA.dat", asignacionA);
        modeloAA.removeRow(auxAA);
        publicarP();
        } else {      
            JOptionPane.showMessageDialog(null,"Fila No Seleccionada");
        }
        
    }//GEN-LAST:event_btnEliminarAActionPerformed

    private void BtnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalidaActionPerformed
        int opcion=JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion==JOptionPane.YES_OPTION){
            System.out.println("Has pulsado en SI");
            System.exit(0);
        }else if(opcion==JOptionPane.NO_OPTION){
            System.out.println("Has pulsado en NO");
                    }
    }//GEN-LAST:event_BtnSalidaActionPerformed

    private void BtnR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnR1ActionPerformed
        FrmLogin log = new FrmLogin();
        log.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_BtnR1ActionPerformed

    private void txtTituloDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloDActionPerformed

    private void btnModificarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDActionPerformed
        int FilaSelecDT = TablaGraduados.getSelectedRow();
        SimpleDateFormat formato1= new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formato2= new SimpleDateFormat("dd/MM/yyyy");
        Date dato1 = null;
        Date dato2 = null;
        int auxCS = FilaSelecDT;
        if ( FilaSelecDT >= 0 ){        
        txtCarreraD.setText(TablaGraduados.getValueAt(FilaSelecDT, 0).toString());
        txtTituloD.setText(TablaGraduados.getValueAt(FilaSelecDT, 1).toString());
        txtGraduadosD.setText(TablaGraduados.getValueAt(FilaSelecDT, 2).toString());
        String fecha1 = TablaGraduados.getValueAt(FilaSelecDT, 3).toString();
        String fecha2 = TablaGraduados.getValueAt(FilaSelecDT, 4).toString();
        try {
             dato1 = formato1.parse(fecha1);
             dato2 = formato2.parse(fecha2);
        } catch (ParseException ex) {   ex.printStackTrace(); }
        Calendario1.setDate(dato1);
        Calendario2.setDate(dato2);        
        parcialDT = parcialDT - Integer.parseInt(TablaGraduados.getValueAt(FilaSelecDT, 5).toString());
        txtTotalD.setText(String.valueOf(parcialDT));
        String nombre = TablaGraduados.getValueAt(FilaSelecDT, 2).toString();
                for (int i = 0; i< directorT.size(); i++ ) {
                    DirectorTesis obtener = new DirectorTesis();
                    obtener = (DirectorTesis) directorT.get(i);
                    if ( obtener.getGraduados() == nombre ) {
                        DirectorTesis obtener2 = (DirectorTesis) directorT.get(i);
                        directorT.remove(obtener2);
                        i = maestros.size();}             
                    }            
        control.insertar("directorT.dat", directorT);
        modeloDT.removeRow(auxCS);
        publicarP();        
        } else {        
            JOptionPane.showMessageDialog(null,"Fila No Seleccionada");
        }        
    }//GEN-LAST:event_btnModificarDActionPerformed

    public int diferencia2Dias (Date fechaMayor, Date fechaMenor) {
    
      long diferenciaMS = fechaMayor.getTime() - fechaMenor.getTime();
      long dias = diferenciaMS / (1000 * 60 * 60 * 24);
      return (int) dias;
    }
    
    
    private void btnGuardarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDActionPerformed
        long identificar = Long.parseLong(txtCP.getText());    
        Date fecha1 = Calendario1.getDate();
        Date fecha2 = Calendario2.getDate();
    SimpleDateFormat formato1 = new SimpleDateFormat("yyyy-MM-dd-hh");
    SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd-hh");
    String F1 = formato1.format(fecha1);
    String F2 = formato1.format(fecha2);
    System.out.println("Fecha1 = " + F1);
    System.out.println("Fecha2 = " + F2);
        int horasDA = 0;
        int dias = 0;
        String [] DatoDT = new String[6];
    dias = diferencia2Dias(fecha1, fecha2);
    if (dias < 0) {
      dias = dias * -1;
    }
    System.out.println(dias);
              
        try{
        DatoDT[0] = txtCarreraD.getText();
        DatoDT[1] = txtTituloD.getText();
        DatoDT[2] = txtGraduadosD.getText();
        DatoDT[3] = F1;
        DatoDT[4] = F2;
        
      if ( dias <= 180 ) { DatoDT[5] = String.valueOf(90);
                           horasDA = Integer.parseInt(DatoDT[5]);
      }
      else if ( dias > 180 && dias <= 366) { DatoDT[5] = String.valueOf(65);
                           horasDA = Integer.parseInt(DatoDT[5]);
      }
      else if (dias > 366) { DatoDT[5] = String.valueOf(52);
                           horasDA = Integer.parseInt(DatoDT[5]);
      }      
      horasDA = Integer.parseInt(DatoDT[5]);
      //guardando en el data
      DirectorTesis guardar = new DirectorTesis(identificar,contDirectorT, txtCarreraD.getText(),txtTituloD.getText(),txtGraduadosD.getText(),F1,F2,horasDA);
      directorT.add(guardar);        
      control.insertar("directorT.dat", directorT);
      parcialDT = parcialDT + horasDA;
      txtTotalD.setText(String.valueOf(parcialDT));
      modeloDT.addRow(DatoDT);
      contDirectorT++;
      publicarP();
        }catch(NumberFormatException ex){ // handle your exception
             System.out.println("Ingreso no es Entero");
         }
    }//GEN-LAST:event_btnGuardarDActionPerformed

    private void btnModificarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarTActionPerformed
       
        int FilaSelecLT = TablaLT.getSelectedRow();
        int auxLT = FilaSelecLT;
        
        if ( FilaSelecLT >= 0 ){        
        txtTituloT.setText(TablaLT.getValueAt(FilaSelecLT, 0).toString());
        txtCarreraT.setText(TablaLT.getValueAt(FilaSelecLT, 1).toString());       
        parcialLT = parcialLT - Integer.parseInt(TablaLT.getValueAt(FilaSelecLT, 2).toString());
        txtTotalLT.setText(String.valueOf(parcialLT));
        
        String nombre = TablaLT.getValueAt(FilaSelecLT, 0).toString();
                for (int i = 0; i < lectorTesis.size(); i++ ) {
                    LectorTesis obtener = new LectorTesis();
                    obtener = (LectorTesis) lectorTesis.get(i);
                    if ( obtener.getTituloLector() == nombre ) {
                        LectorTesis obtener2 = (LectorTesis) lectorTesis.get(i);
                        lectorTesis.remove(obtener2);
                        i = maestros.size();
                                                    }             
                    }         
               
        control.insertar("lectorT.dat", lectorTesis);
        modeloLT.removeRow(auxLT);
        publicarP();       
        } else {        
            JOptionPane.showMessageDialog(null,"Fila No Seleccionada");
        }
    }//GEN-LAST:event_btnModificarTActionPerformed

    private void btnGuardarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTActionPerformed
        long identificar = Long.parseLong(txtCP.getText());
        String DatoLT [] = new String [6];
        int auxiliar = 0;
        LectorTesis guardar = new LectorTesis(identificar, contDirectorT, txtTituloT.getText(),txtCarreraT.getText(),6);
        lectorTesis.add(guardar);        
        control.insertar("lectorT.dat", lectorTesis);
        int horasDA = 0;
        try{
        DatoLT[0] = txtTituloT.getText();
        DatoLT[1] = txtCarreraT.getText();
        DatoLT[2] = String.valueOf(6);
        auxiliar = Integer.parseInt(DatoLT[2]);        
       parcialLT = parcialLT + auxiliar;
       txtTotalLT.setText(String.valueOf(parcialLT));
       modeloLT.addRow(DatoLT);
       contDirectorT++;
        }catch(NumberFormatException ex){ // handle your exception
             System.out.println("Ingreso no es Entero");
         }
        publicarP();
    }//GEN-LAST:event_btnGuardarTActionPerformed

    private void btnGuardarCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCAActionPerformed
        long identificador = Long.parseLong(txtCP.getText());        
        String DatoCA [] = new String [8];       
        double puntajeCA = 0;
        DatoCA[0] = txtCodigoCA.getText();
        DatoCA[1] = txtAsignaturaCA.getText();
        DatoCA[2] = txtNECA.getText();
        DatoCA[3] = txtHTCA.getText();
        DatoCA[4] = txtHLCA.getText();
        //factor teorico horas teoricas por 0.3
        DecimalFormat lab = new DecimalFormat("0");
        
        double Ft = Double.parseDouble(txtHTCA.getText()) * 0.3 ;
        System.out.println("Numero Decimal " + lab.format(Ft));
        DatoCA[5] = String.valueOf(lab.format(Ft));
        //factor laboratorio horas laboratorio por 0.6
        double Fl = Double.parseDouble(txtHLCA.getText()) * 0.6 ;
        DatoCA[6] = String.valueOf(lab.format(Fl));
        //SUMA EXTRA
        int extra = 0;
        int nE = Integer.parseInt(txtNECA.getText());
        
        if ( nE <= 15 ) { extra = 0 ;}
        if ( nE > 15 && nE <= 25 ) { extra = 20 ;}
        if ( nE > 25 && nE <= 35  ) { extra = 35 ;}
        if ( nE > 35  ) { extra = 50 ;}
        
        
        
        double puntuacion = (Integer.parseInt( txtHTCA.getText()) *  Integer.parseInt(txtHLCA.getText())
                            * Ft * Fl ) + extra;
        
        DecimalFormat conv = new DecimalFormat("0");
        
       
        DatoCA[7] = String.valueOf(lab.format(puntuacion));
        puntajeCA = Double.valueOf(conv.format(puntuacion));
        CargaAcademica guardar = new CargaAcademica(identificador,contCarga, DatoCA[0],DatoCA[1],
                                 Integer.parseInt(DatoCA[2]),Integer.parseInt(DatoCA[3]),Integer.parseInt(DatoCA[4]),Integer.parseInt(DatoCA[5]),Integer.parseInt(DatoCA[6]),puntajeCA);
        cargaA.add(guardar);        
        control.insertar("cargaA.dat", cargaA);
        parcialCA = parcialCA + puntajeCA;
        txtNotaFCA.setText(String.valueOf(parcialCA));
        modeloCA.addRow(DatoCA);
        contCarga++;
        publicarP();
        
    }//GEN-LAST:event_btnGuardarCAActionPerformed

    private void bntModificarCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntModificarCAActionPerformed
        int FilaSelecCA = TablaCA.getSelectedRow();
        int aux = FilaSelecCA;
        if ( FilaSelecCA >= 0 ){
        
        txtCodigoCA.setText(TablaCA.getValueAt(FilaSelecCA, 1).toString());
        txtAsignaturaCA.setText(TablaCA.getValueAt(FilaSelecCA, 2).toString());
        txtNECA.setText(TablaCA.getValueAt(FilaSelecCA, 3).toString());
        txtHTCA.setText(TablaCA.getValueAt(FilaSelecCA, 4).toString());
        txtHLCA.setText(TablaCA.getValueAt(FilaSelecCA, 5).toString());
        parcialCA = parcialCA - Double.parseDouble(TablaCA.getValueAt(FilaSelecCA, 7).toString());
        txtNotaFCA.setText(String.valueOf(parcialCA));
        String nombre = TablaCA.getValueAt(FilaSelecCA, 1).toString();
            for (int i = 0; i< cargaA.size(); i++ ) {
                CargaAcademica obtener = new CargaAcademica ();
                obtener = (CargaAcademica) cargaA.get(i);
                if ( obtener.getAsignatura() == nombre ) {
                        CargaAcademica obtener2 = (CargaAcademica) cargaA.get(i);
                        cargaA.remove(obtener2);
                        i = maestros.size();
                                                    }             
                    }              
        control.insertar("cargaA.dat", cargaA);
        modeloCA.removeRow(aux);
        publicarP();       
        } else {        
            JOptionPane.showMessageDialog(null,"Fila No Seleccionada");
        }
    }//GEN-LAST:event_bntModificarCAActionPerformed

    private void bntEliminarCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEliminarCAActionPerformed
        // TODO add your handling code here:
        int FilaSelecCA = TablaCA.getSelectedRow();
        int auxCA = FilaSelecCA;
               
          if ( FilaSelecCA >=0 ){              
            String nombre = TablaCA.getValueAt(FilaSelecCA, 1).toString();
            for (int i = 0; i< cargaA.size(); i++ ) {
                CargaAcademica obtener = new CargaAcademica ();
                obtener = (CargaAcademica) cargaA.get(i);
                if ( obtener.getAsignatura() == nombre ) {
                        CargaAcademica obtener2 = (CargaAcademica) cargaA.get(i);
                        cargaA.remove(obtener2);
                        i = maestros.size();
                                                    }             
                    }             
        control.insertar("cargaA.dat", cargaA);
        parcialCA = parcialCA - Double.parseDouble(TablaCA.getValueAt(FilaSelecCA, 7).toString());
        txtNotaFCA.setText(String.valueOf(parcialCA));
        modeloCA.removeRow(auxCA);
        publicarP();
        } else {        
            JOptionPane.showMessageDialog(null,"Fila No Seleccionada");
        }
        
    }//GEN-LAST:event_bntEliminarCAActionPerformed

    private void btnGuardarCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCSActionPerformed
        long identificador = Long.parseLong(txtCP.getText());
        String DatoCS [] = new String [3];
       
        int horasCS = 0;
        
        DatoCS[0] = txtNS.getText();
        DatoCS[1] = txtIS.getText();
        DatoCS[2] = txtHorasS.getText();
        horasCS = Integer.parseInt(txtHorasS.getText());
       CursoSeminario guardar = new CursoSeminario(identificador, contCursoS, txtNS.getText(),txtIS.getText(),horasCS);
       cursoS.add(guardar);        
       control.insertar("cursoS.dat", cursoS);
       totalCS = totalCS + horasCS;
       txtNotaFCS.setText(String.valueOf(totalCS));
       modeloCS.addRow(DatoCS);
       contCursoS++;
       publicarP();
      
        
    }//GEN-LAST:event_btnGuardarCSActionPerformed

    private void btnModificarCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCSActionPerformed
        int FilaSelecCS = TablaCS.getSelectedRow();
        int auxCS = FilaSelecCS;
        if ( FilaSelecCS >= 0 ){
        
        txtNS.setText(TablaCS.getValueAt(FilaSelecCS, 0).toString());
        txtIS.setText(TablaCS.getValueAt(FilaSelecCS, 1).toString());
        txtHorasS.setText(TablaCS.getValueAt(FilaSelecCS, 2).toString());
        //profesores.get(aux).setNombre(txtNombre.getText());
        totalCS = totalCS - Integer.parseInt(TablaCS.getValueAt(FilaSelecCS, 2).toString());
        txtNotaFCS.setText(String.valueOf(totalCS));
        String nombre = TablaCS.getValueAt(FilaSelecCS, 0).toString();
                for (int i = 0; i< cursoS.size(); i++ ) {
                    CursoSeminario obtener = new CursoSeminario();
                    obtener = (CursoSeminario) cursoS.get(i);
                    if ( obtener.getNombreSemi() == nombre ) {
                        CursoSeminario obtener2 = (CursoSeminario) cursoS.get(i);
                        cursoS.remove(obtener2);
                        i = maestros.size();              
                                                    }             
                    }    
        control.insertar("cursoS.dat", cursoS);
        modeloCS.removeRow(auxCS);
        publicarP();        
        } else {        
            JOptionPane.showMessageDialog(null,"Fila No Seleccionada");
        }
        
        
    }//GEN-LAST:event_btnModificarCSActionPerformed

    private void btnEliminarCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCSActionPerformed
         int FilaSelecCS = TablaCS.getSelectedRow();
         int auxCS = FilaSelecCS;
         int posicion = 0;
            if ( FilaSelecCS >=0 ){   
                 String nombre = TablaCS.getValueAt(FilaSelecCS, 0).toString();
                for (int i = 0; i< cursoS.size(); i++ ) {
                    CursoSeminario obtener = new CursoSeminario();
                    obtener = (CursoSeminario) cursoS.get(i);
                    if ( obtener.getNombreSemi() == nombre ) {
                        CursoSeminario obtener2 = (CursoSeminario) cursoS.get(i);
                        cursoS.remove(obtener2);
                        i = maestros.size();              
                                                    }             
                    }            
        System.out.println("posicion: " + posicion);        
        control.insertar("cursoS.dat", cursoS);
        double a = Double.parseDouble(TablaCS.getValueAt(FilaSelecCS, 2).toString());
        int x = (int) a; 
        totalCS = totalCS - x;
        txtNotaFCS.setText(String.valueOf(totalCS));
        modeloCS.removeRow(auxCS);
        publicarP();
        } else {        
            JOptionPane.showMessageDialog(null,"Fila No Seleccionada");
        }
        
    }//GEN-LAST:event_btnEliminarCSActionPerformed

    private void txtNotaFCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotaFCSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNotaFCSActionPerformed

    private void btnGuardarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAActionPerformed
        // TODO add your handling code here:
        long identificar = Long.parseLong(txtCP.getText());
        String DatoAA [] = new String [5];
        int horasAA = 0;
        int numsem = 0;
        int totalHA = 0;
        int sumaAA = 0;
        if ( CmbResponsabilidad.getSelectedIndex() == 0  ) {
                DatoAA[0] = "Comision";
                DatoAA[1] = txtNA.getText();
                DatoAA[2] = txtHorasA.getText();
                DatoAA[3] = "24";
                totalHA= Integer.parseInt(txtHorasA.getText()) * 24; 
                DatoAA[4] = String.valueOf(totalHA);
        } else if ( CmbResponsabilidad.getSelectedIndex() == 1 ){
                DatoAA[0] = "Tutorias Estudiante " ;
                DatoAA[1] = txtNA.getText();
                DatoAA[2] = "0";
                DatoAA[3] = "0";
                DatoAA[4] = String.valueOf(12);
                totalHA= 12;
        }
        AsignarA guardar = new AsignarA(contAsignar,identificar, DatoAA[0],DatoAA[1],
                                 Integer.parseInt(DatoAA[2]),Integer.parseInt(DatoAA[3]),totalHA);
        
        asignacionA.add(guardar);        
        control.insertar("asignacionA.dat", asignacionA);
        parcialAA = parcialAA + totalHA;
        txtParcialAA.setText(String.valueOf(parcialAA));
        modeloAA.addRow(DatoAA);
        contAsignar++; 
        publicarP();
    }//GEN-LAST:event_btnGuardarAActionPerformed

    private void btnModificarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAActionPerformed
         long identificar = Long.parseLong(txtCP.getText());
         String responsabilidad, nombre;
         int numH, numS, puntajeS;
        int FilaSelecAA = TablaAA.getSelectedRow();
        int auxAA = FilaSelecAA;
        if ( FilaSelecAA >= 0 ){
        responsabilidad = TablaAA.getValueAt(FilaSelecAA,0).toString();
        nombre = TablaAA.getValueAt(FilaSelecAA,1).toString();
        numH = Integer.parseInt(TablaAA.getValueAt(FilaSelecAA, 2).toString());
        numS = Integer.parseInt(TablaAA.getValueAt(FilaSelecAA, 3).toString());
        puntajeS = Integer.parseInt(TablaAA.getValueAt(FilaSelecAA,4).toString());
        txtNA.setText(nombre);
        txtHorasA.setText(String.valueOf(numH));
        parcialAA = parcialAA - puntajeS;
        txtParcialAA.setText(String.valueOf(parcialAA));
        for (int i = 0; i< asignacionA.size(); i++ ) {
                AsignarA obtener = new AsignarA ();
                obtener = (AsignarA) asignacionA.get(i);
                if ( obtener.getNombreE() == nombre ) {
                        AsignarA obtener2 = (AsignarA) asignacionA.get(i);
                        asignacionA.remove(obtener2);
                        i = maestros.size();
                        }             
                    }                
        control.insertar("asignacionA.dat", asignacionA);
        modeloAA.removeRow(auxAA);
        publicarP();
                     }
    }//GEN-LAST:event_btnModificarAActionPerformed

    private void btnEliminarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDActionPerformed
        int FilaSelecDT = TablaGraduados.getSelectedRow();
        int auxCS = FilaSelecDT;
        if ( FilaSelecDT >=0 ){
        //parcialDT= totalCS - Integer.parseInt(TablaCS.getValueAt(FilaSelecDT, 2).toString());
                String nombre = TablaGraduados.getValueAt(FilaSelecDT, 2).toString();
                for (int i = 0; i< directorT.size(); i++ ) {
                    DirectorTesis obtener = new DirectorTesis();
                    obtener = (DirectorTesis) directorT.get(i);
                    if ( obtener.getGraduados() == nombre ) {
                        DirectorTesis obtener2 = (DirectorTesis) directorT.get(i);
                        directorT.remove(obtener2);
                        i = maestros.size(); }             
                    }            
               
        control.insertar("directorT.dat", directorT);
        parcialDT = parcialDT - Integer.parseInt(TablaGraduados.getValueAt(FilaSelecDT, 5).toString());
        txtTotalD.setText(String.valueOf(parcialDT));
        modeloDT.removeRow(auxCS);
        publicarP();
        } else {        
            JOptionPane.showMessageDialog(null,"Fila No Seleccionada");
        }
        
    }//GEN-LAST:event_btnEliminarDActionPerformed

    private void btnEliminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTActionPerformed
        
        int FilaSelecLT = TablaLT.getSelectedRow();
        int auxCS = FilaSelecLT;
        int posicion = 0; 
        if ( FilaSelecLT >=0 ){
            String nombre = TablaLT.getValueAt(FilaSelecLT, 0).toString();
                for (int i = 0; i < lectorTesis.size(); i++ ) {
                    LectorTesis obtener = new LectorTesis();
                    obtener = (LectorTesis) lectorTesis.get(i);
                    if ( obtener.getTituloLector() == nombre ) {
                        LectorTesis obtener2 = (LectorTesis) lectorTesis.get(i);
                        lectorTesis.remove(obtener2);
                        i = maestros.size();
                                                    }             
                    }            
        System.out.println("posicion: " + posicion);        
        control.insertar("lectorT.dat", lectorTesis);
            
            
        parcialLT = parcialLT - Integer.parseInt(TablaLT.getValueAt(FilaSelecLT, 2).toString());
        txtTotalLT.setText(String.valueOf(parcialLT));
        modeloLT.removeRow(auxCS);
        publicarP();
          } else {        
            JOptionPane.showMessageDialog(null,"Fila No Seleccionada");
        }
        
    }//GEN-LAST:event_btnEliminarTActionPerformed

    private void btnNuevoLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoLTActionPerformed
        txtTituloT.setText("");
        txtCarreraT.setText("");
    }//GEN-LAST:event_btnNuevoLTActionPerformed

    private void btnNuevoDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDTActionPerformed
        txtCarreraD.setText("");
        txtTituloD.setText("");
        txtGraduadosD.setText("");
        Calendario1.setCalendar(null);
        Calendario2.setCalendar(null);
    }//GEN-LAST:event_btnNuevoDTActionPerformed

    private void btnNuevoCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCSActionPerformed
        txtNS.setText("");
        txtIS.setText("");
        txtHorasS.setText("");
    }//GEN-LAST:event_btnNuevoCSActionPerformed

    private void btnNuevoCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCAActionPerformed
        txtCodigoCA.setText("");
        txtAsignaturaCA.setText("");
        txtNECA.setText("");
        txtHTCA.setText("");
        txtHLCA.setText("");
    }//GEN-LAST:event_btnNuevoCAActionPerformed

    private void btnNuevoAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAAActionPerformed
        txtNA.setText("");
        txtHorasA.setText("");
    }//GEN-LAST:event_btnNuevoAAActionPerformed

    private void CmbResponsabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbResponsabilidadActionPerformed
        if (CmbResponsabilidad.getSelectedIndex() == 0) { txtHorasA.setEnabled(true);
        txtNA.setText("");
        txtHorasA.setText("");
        }
        else if (CmbResponsabilidad.getSelectedIndex() == 1) { txtHorasA.setEnabled(false);
        txtNA.setText("");
        txtHorasA.setText("");
        }
    }//GEN-LAST:event_CmbResponsabilidadActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        publicarP();
        asignarP();
    }//GEN-LAST:event_btnActualizarActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrmProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnR1;
    private javax.swing.JButton BtnSalida;
    private com.toedter.calendar.JDateChooser Calendario1;
    private com.toedter.calendar.JDateChooser Calendario2;
    private javax.swing.JComboBox<String> CmbResponsabilidad;
    private javax.swing.JTable TablaAA;
    private javax.swing.JTable TablaCA;
    private javax.swing.JTable TablaCS;
    private javax.swing.JTable TablaGraduados;
    private javax.swing.JTable TablaLT;
    private javax.swing.JButton bntEliminarCA;
    private javax.swing.JButton bntModificarCA;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminarA;
    private javax.swing.JButton btnEliminarCS;
    private javax.swing.JButton btnEliminarD;
    private javax.swing.JButton btnEliminarT;
    private javax.swing.JButton btnGuardarA;
    private javax.swing.JButton btnGuardarCA;
    private javax.swing.JButton btnGuardarCS;
    private javax.swing.JButton btnGuardarD;
    private javax.swing.JButton btnGuardarT;
    private javax.swing.JButton btnModificarA;
    private javax.swing.JButton btnModificarCS;
    private javax.swing.JButton btnModificarD;
    private javax.swing.JButton btnModificarT;
    private javax.swing.JButton btnNuevoAA;
    private javax.swing.JButton btnNuevoCA;
    private javax.swing.JButton btnNuevoCS;
    private javax.swing.JButton btnNuevoDT;
    private javax.swing.JButton btnNuevoLT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblParcialAA;
    private javax.swing.JLabel lblTotalLT;
    private javax.swing.JLabel lblperfil;
    private javax.swing.JLabel lbltesis;
    public javax.swing.JTextField txtAP;
    private javax.swing.JTextField txtAsignaturaCA;
    public javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCarreraD;
    private javax.swing.JTextField txtCarreraT;
    private javax.swing.JTextField txtCodigoCA;
    private javax.swing.JTextField txtGraduadosD;
    private javax.swing.JTextField txtHLCA;
    private javax.swing.JTextField txtHTCA;
    private javax.swing.JTextField txtHorasA;
    private javax.swing.JTextField txtHorasS;
    public static javax.swing.JTextField txtIDP;
    private javax.swing.JTextField txtIS;
    private javax.swing.JTextField txtNA;
    private javax.swing.JTextField txtNECA;
    public javax.swing.JTextField txtNP;
    private javax.swing.JTextField txtNS;
    private javax.swing.JTextField txtNotaFCA;
    private javax.swing.JTextField txtNotaFCS;
    public javax.swing.JTextField txtPP;
    private javax.swing.JTextField txtParcialAA;
    public javax.swing.JTextField txtTP;
    private javax.swing.JTextField txtTituloD;
    private javax.swing.JTextField txtTituloT;
    private javax.swing.JTextField txtTotalD;
    private javax.swing.JTextField txtTotalLT;
    // End of variables declaration//GEN-END:variables
}
