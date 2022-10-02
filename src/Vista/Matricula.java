package Vista;

import DAO.CRUDestudiante;
import DAO.CRUDestudiante_seccion;
import DAO.CRUDseccion_asignatura;
import DAO.CRUDestudiante_apoderado;
import DAO.CRUDseccion;
import DAO.CRUDapoderado;
import Modelo.Estudiante;
import Modelo.EstudianteSeccion;
import Modelo.EstudianteApoderado;
import Modelo.SeccionAsignatura;
import Modelo.Seccion;
import Modelo.Apoderado;
import java.awt.Color;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Matricula extends javax.swing.JFrame {

    int xMouse, yMouse;

    //CRUDS
    CRUDestudiante estudiante = new CRUDestudiante();
    CRUDseccion seccion = new CRUDseccion();
    CRUDestudiante_seccion estudiante_seccion = new CRUDestudiante_seccion();
    CRUDseccion_asignatura seccion_asignatura = new CRUDseccion_asignatura();
    CRUDestudiante_apoderado estudiante_apoderado = new CRUDestudiante_apoderado();
    CRUDapoderado apoderado = new CRUDapoderado();

    //Modelos
    Estudiante es = new Estudiante();
    EstudianteSeccion es_sc = new EstudianteSeccion();
    SeccionAsignatura sc_as = new SeccionAsignatura();
    EstudianteApoderado es_ap = new EstudianteApoderado();
    Seccion sc = new Seccion();
    Apoderado ap = new Apoderado();

    //Tabla y JComboBox
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultComboBoxModel modeloJComboBox = new DefaultComboBoxModel();

    public Matricula(String idApoderado) {
        initComponents();
        this.setLocationRelativeTo(null);
        listarSecciones();
        listarAsignaturasSeccion();
        txtIdApoderado.setText(idApoderado);
    }

    public void limpiarCampos() {
        txtApellido.setText("Ingrese el apellido del menor");
        txtDNI.setText("12345678");
        txtDireccion.setText("Ingrese la direccion del menor");
        txtEdad.setText("Ingrese la edad del menor");
        txtNombre.setText("Ingrese el nombre del menor");
        cboSeccion.setSelectedIndex(-1);
    }

    public void listarAsignaturasSeccion() {
        List<SeccionAsignatura> listarSCAS = seccion_asignatura.ListarSeccionAsignatura();
        modelo = (DefaultTableModel) tableSeccionAsignatura.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < listarSCAS.size(); i++) {
            ob[0] = seccion_asignatura.buscarNombreSeccion(listarSCAS.get(i).getSeccionID(), listarSCAS.get(i).getAsignaturaID());
            ob[1] = seccion_asignatura.buscarNombreAsignatura(listarSCAS.get(i).getSeccionID(), listarSCAS.get(i).getAsignaturaID());
            ob[2] = seccion_asignatura.buscarHorarioAsignatura(listarSCAS.get(i).getSeccionID(), listarSCAS.get(i).getAsignaturaID());
            modelo.addRow(ob);
        }
        tableSeccionAsignatura.setModel(modelo);
    }

    public void listarSecciones() {
        List<Seccion> listarSC = seccion.ListarSeccion();
        modeloJComboBox = (DefaultComboBoxModel) cboSeccion.getModel();
        String nombreSeccion;
        for (int i = 0; i < listarSC.size(); i++) {
            nombreSeccion = listarSC.get(i).getNombre();
            modeloJComboBox.addElement(nombreSeccion);
        }
        cboSeccion.setModel(modeloJComboBox);
        cboSeccion.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        favicon = new javax.swing.JLabel();
        favicon1 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtIdApoderado = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        nombrelbl = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        apellidolbl = new javax.swing.JLabel();
        panel5 = new javax.swing.JPanel();
        direccionlbl = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        dnilbl = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        edadlbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSeccionAsignatura = new javax.swing.JTable();
        panel7 = new javax.swing.JPanel();
        cboSeccion = new javax.swing.JComboBox<>();
        ciclolbl1 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JPanel();
        registerBtnTxt = new javax.swing.JLabel();
        cleanBtn = new javax.swing.JPanel();
        cleanBtnTxt = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JPanel();
        cancelBtnTxt = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        header = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        favicon.setBackground(new java.awt.Color(187, 155, 107));
        favicon.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        favicon.setForeground(new java.awt.Color(120, 121, 216));
        favicon.setText("\"SONRISITAS\"");
        bg.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        favicon1.setBackground(new java.awt.Color(187, 155, 107));
        favicon1.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        favicon1.setForeground(new java.awt.Color(120, 121, 216));
        favicon1.setText("NIDO");
        bg.add(favicon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(204, 204, 204));
        txtDireccion.setText("Ingrese la direccion del menor");
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDireccion.setCaretColor(new java.awt.Color(0, 51, 204));
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDireccionMousePressed(evt);
            }
        });
        bg.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 360, 30));

        txtDNI.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(204, 204, 204));
        txtDNI.setText("12345678");
        txtDNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDNI.setCaretColor(new java.awt.Color(0, 51, 204));
        txtDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDNIMousePressed(evt);
            }
        });
        bg.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 80, 30));

        txtEdad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(204, 204, 204));
        txtEdad.setText("Ingrese la edad del menor");
        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEdad.setCaretColor(new java.awt.Color(0, 51, 204));
        txtEdad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEdadMousePressed(evt);
            }
        });
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        bg.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 150, 30));

        txtApellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtApellido.setText("Ingrese el apellido del menor");
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtApellido.setCaretColor(new java.awt.Color(0, 51, 204));
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoMousePressed(evt);
            }
        });
        bg.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 230, 30));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Ingrese el nombre del menor");
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.setCaretColor(new java.awt.Color(0, 51, 204));
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 220, 30));

        txtIdApoderado.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtIdApoderado.setForeground(new java.awt.Color(255, 255, 255));
        txtIdApoderado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIdApoderado.setText("MATRICULAR");
        txtIdApoderado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtIdApoderado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdApoderadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtIdApoderadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtIdApoderadoMouseExited(evt);
            }
        });
        bg.add(txtIdApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 10, 20));

        panel.setBackground(new java.awt.Color(148, 192, 252));

        nombrelbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombrelbl.setForeground(new java.awt.Color(0, 0, 153));
        nombrelbl.setText("Nombre del Estudiante");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombrelbl)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombrelbl)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        bg.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 380, 30));

        panel1.setBackground(new java.awt.Color(148, 192, 252));

        apellidolbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        apellidolbl.setForeground(new java.awt.Color(0, 0, 153));
        apellidolbl.setText("Apellido del Estudiante");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(apellidolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(apellidolbl)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        bg.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 400, -1));

        panel5.setBackground(new java.awt.Color(148, 192, 252));

        direccionlbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        direccionlbl.setForeground(new java.awt.Color(0, 0, 153));
        direccionlbl.setText("Dirección");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(direccionlbl)
                .addContainerGap(374, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(direccionlbl)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        bg.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 440, -1));

        panel3.setBackground(new java.awt.Color(148, 192, 252));

        dnilbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        dnilbl.setForeground(new java.awt.Color(0, 0, 153));
        dnilbl.setText("DNI");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dnilbl)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dnilbl)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        bg.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 120, -1));

        panel2.setBackground(new java.awt.Color(148, 192, 252));

        edadlbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        edadlbl.setForeground(new java.awt.Color(0, 0, 153));
        edadlbl.setText("Edad");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edadlbl)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edadlbl)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        bg.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, -1));

        tableSeccionAsignatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SECCION", "ASIGNATURAS", "HORARIO"
            }
        ));
        jScrollPane1.setViewportView(tableSeccionAsignatura);
        if (tableSeccionAsignatura.getColumnModel().getColumnCount() > 0) {
            tableSeccionAsignatura.getColumnModel().getColumn(0).setPreferredWidth(80);
            tableSeccionAsignatura.getColumnModel().getColumn(0).setMaxWidth(80);
            tableSeccionAsignatura.getColumnModel().getColumn(1).setPreferredWidth(180);
            tableSeccionAsignatura.getColumnModel().getColumn(1).setMaxWidth(180);
        }

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 440, 160));

        panel7.setBackground(new java.awt.Color(148, 192, 252));

        cboSeccion.setFont(new java.awt.Font("Roboto Black", 1, 11)); // NOI18N
        cboSeccion.setBorder(null);
        cboSeccion.setLightWeightPopupEnabled(false);
        cboSeccion.setOpaque(false);
        cboSeccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboSeccionMouseClicked(evt);
            }
        });

        ciclolbl1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        ciclolbl1.setForeground(new java.awt.Color(0, 0, 153));
        ciclolbl1.setText("Seccion");

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ciclolbl1)
                .addGap(18, 18, 18)
                .addComponent(cboSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciclolbl1))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        bg.add(panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 330, 30));

        registerBtn.setBackground(new java.awt.Color(182, 249, 205));
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        registerBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        registerBtnTxt.setForeground(new java.awt.Color(79, 209, 123));
        registerBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerBtnTxt.setText("MATRICULAR");
        registerBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout registerBtnLayout = new javax.swing.GroupLayout(registerBtn);
        registerBtn.setLayout(registerBtnLayout);
        registerBtnLayout.setHorizontalGroup(
            registerBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registerBtnLayout.setVerticalGroup(
            registerBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 120, 50));

        cleanBtn.setBackground(new java.awt.Color(197, 218, 249));
        cleanBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cleanBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        cleanBtnTxt.setForeground(new java.awt.Color(91, 150, 238));
        cleanBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cleanBtnTxt.setText("LIMPIAR");
        cleanBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cleanBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cleanBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cleanBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cleanBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cleanBtnLayout = new javax.swing.GroupLayout(cleanBtn);
        cleanBtn.setLayout(cleanBtnLayout);
        cleanBtnLayout.setHorizontalGroup(
            cleanBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cleanBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        cleanBtnLayout.setVerticalGroup(
            cleanBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cleanBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(cleanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 120, 50));

        cancelBtn.setBackground(new java.awt.Color(249, 206, 206));
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtn.setPreferredSize(new java.awt.Dimension(120, 50));

        cancelBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        cancelBtnTxt.setForeground(new java.awt.Color(239, 71, 71));
        cancelBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelBtnTxt.setText("CANCELAR");
        cancelBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cancelBtnLayout = new javax.swing.GroupLayout(cancelBtn);
        cancelBtn.setLayout(cancelBtnLayout);
        cancelBtnLayout.setHorizontalGroup(
            cancelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cancelBtnLayout.setVerticalGroup(
            cancelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, -1, -1));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        citybg.setBackground(new java.awt.Color(0, 134, 190));
        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/matricula.png"))); // NOI18N
        bg.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 520));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        int input = JOptionPane.showConfirmDialog(null, "¿Está seguro de que quiere salir?", "SALIR", JOptionPane.YES_NO_OPTION);
        if (input == 0) {
            new Login().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(new Color(120, 121, 216));
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void registerBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnTxtMouseEntered
        registerBtn.setBackground(new Color(79, 209, 123));
        registerBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_registerBtnTxtMouseEntered

    private void registerBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnTxtMouseExited
        registerBtn.setBackground(new Color(182, 249, 205));
        registerBtnTxt.setForeground(new Color(79, 209, 123));
    }//GEN-LAST:event_registerBtnTxtMouseExited

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if (txtNombre.getText().equals("Ingrese el nombre del menor")) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void registerBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnTxtMouseClicked
        //Comprobar que los campos no esten vacios
        if ("".equals(txtNombre.getText()) || "Ingrese el nombre del menor".equals(txtNombre.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese un Nombre", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtApellido.getText()) || "Ingrese el apellido del menor".equals(txtApellido.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese un Apellido", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtEdad.getText()) || "Ingrese la edad del menor".equals(txtEdad.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese una Edad", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtDNI.getText()) || "12345678".equals(txtDNI.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese un DNI", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtDireccion.getText()) || "Ingrese la direccion del menor".equals(txtDireccion.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese una Dirección", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "¿Está seguro de realizar la matricula?", "MATRICULA NIDO SONRISITAS", JOptionPane.YES_NO_OPTION);
        if (confirmation == 0) {
            //Registrar Estudiante
            es.setEstudianteID(es.generarID());
            es.setDni(Integer.parseInt(txtDNI.getText()));
            es.setNombre(txtNombre.getText());
            es.setApellido(txtApellido.getText());
            es.setEdad(Integer.parseInt(txtEdad.getText()));
            es.setDireccion(txtDireccion.getText());
            estudiante.RegistrarEstudiante(es);

            //Registrar Estudiante en la Seccion
            String idSeccion = seccion.buscarIdSeccion((String.valueOf(cboSeccion.getSelectedItem())));
            es_sc.setSeccionID(idSeccion);
            es_sc.setEstudianteID(es.getEstudianteID());
            estudiante_seccion.RegistrarEstudianteSeccion(es_sc);

            //Registrar Estudiante del Apoderado
            es_ap.setIdApoderado(txtIdApoderado.getText());
            es_ap.setIdEstudiante(es.getEstudianteID());
            estudiante_apoderado.RegistrarEstudianteApoderado(es_ap);

            //Imprimir Mensaje de Exito
            JOptionPane.showMessageDialog(this, "Alumno Matriculado ", "MATRICULA EXITOSA", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            //Limpiar Campos
            limpiarCampos();
        }
    }//GEN-LAST:event_registerBtnTxtMouseClicked

    private void cleanBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanBtnTxtMouseClicked
        limpiarCampos();
    }//GEN-LAST:event_cleanBtnTxtMouseClicked

    private void cleanBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanBtnTxtMouseEntered
        cleanBtn.setBackground(new Color(91, 150, 238));
        cleanBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_cleanBtnTxtMouseEntered

    private void cleanBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanBtnTxtMouseExited
        cleanBtn.setBackground(new Color(197, 218, 249));
        cleanBtnTxt.setForeground(new Color(91, 150, 238));
    }//GEN-LAST:event_cleanBtnTxtMouseExited

    private void cancelBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnTxtMouseClicked
        int input = JOptionPane.showConfirmDialog(null, "¿Está seguro de que quiere cancelar la matricula?", "CANCELAR", JOptionPane.YES_NO_OPTION);
        if (input == 0) {
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Matricula Cancelada", "MATRICULA CANCELADA", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_cancelBtnTxtMouseClicked

    private void cancelBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnTxtMouseEntered
        cancelBtn.setBackground(new Color(239, 71, 71));
        cancelBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_cancelBtnTxtMouseEntered

    private void cancelBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnTxtMouseExited
        cancelBtn.setBackground(new Color(249, 206, 206));
        cancelBtnTxt.setForeground(new Color(239, 71, 71));
    }//GEN-LAST:event_cancelBtnTxtMouseExited

    private void txtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMousePressed
        if (txtApellido.getText().equals("Ingrese el apellido del menor")) {
            txtApellido.setText("");
            txtApellido.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtApellidoMousePressed

    private void txtEdadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEdadMousePressed
        if (txtEdad.getText().equals("Ingrese la edad del menor")) {
            txtEdad.setText("");
            txtEdad.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtEdadMousePressed

    private void txtDNIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDNIMousePressed
        if (txtDNI.getText().equals("12345678")) {
            txtDNI.setText("");
            txtDNI.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtDNIMousePressed

    private void txtDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMousePressed
        if (txtDireccion.getText().equals("Ingrese la direccion del menor")) {
            txtDireccion.setText("");
            txtDireccion.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtDireccionMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void cboSeccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboSeccionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSeccionMouseClicked

    private void txtIdApoderadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdApoderadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdApoderadoMouseClicked

    private void txtIdApoderadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdApoderadoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdApoderadoMouseEntered

    private void txtIdApoderadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdApoderadoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdApoderadoMouseExited

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
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matricula("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidolbl;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel cancelBtn;
    private javax.swing.JLabel cancelBtnTxt;
    private javax.swing.JComboBox<String> cboSeccion;
    private javax.swing.JLabel ciclolbl1;
    private javax.swing.JLabel citybg;
    private javax.swing.JPanel cleanBtn;
    private javax.swing.JLabel cleanBtnTxt;
    private javax.swing.JLabel direccionlbl;
    private javax.swing.JLabel dnilbl;
    private javax.swing.JLabel edadlbl;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JLabel favicon1;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombrelbl;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel registerBtn;
    private javax.swing.JLabel registerBtnTxt;
    private javax.swing.JTable tableSeccionAsignatura;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JLabel txtIdApoderado;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
