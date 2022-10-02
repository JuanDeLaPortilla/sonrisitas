package Vista;

import DAO.CRUDapoderado;
import Modelo.Apoderado;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SignUp extends javax.swing.JFrame {

    int xMouse, yMouse;
    Apoderado ad = new Apoderado();
    CRUDapoderado apoderado = new CRUDapoderado();
    DefaultTableModel modelo = new DefaultTableModel();

    public SignUp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void limpiarCampos() {
        txtApellido.setText("Ingrese el apellido");
        txtDNI.setText("Ingrese el DNI");
        txtDireccion.setText("Ingrese la dirección");
        txtEdad.setText("Ingrese la edad");
        txtNombre.setText("Ingrese el nombre");
        txtCorreo.setText("Ingrese el correo electrónico");
        txtPass.setText("Ingrese la contraseña");
    }

    public String generarID(int id) {
        DecimalFormat df = new DecimalFormat("A00000");
        return df.format(id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        favicon = new javax.swing.JLabel();
        favicon1 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        panel4 = new javax.swing.JPanel();
        nombrelbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        agregarBtn = new javax.swing.JPanel();
        agregarBtnTxt = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        panel6 = new javax.swing.JPanel();
        nombrelbl2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        panel7 = new javax.swing.JPanel();
        nombrelbl3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        panel8 = new javax.swing.JPanel();
        nombrelbl4 = new javax.swing.JLabel();
        panel9 = new javax.swing.JPanel();
        nombrelbl5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        panel10 = new javax.swing.JPanel();
        nombrelbl6 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        panel5 = new javax.swing.JPanel();
        nombrelbl1 = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        header = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        favicon.setBackground(new java.awt.Color(187, 155, 107));
        favicon.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        favicon.setForeground(new java.awt.Color(204, 0, 0));
        favicon.setText("Registro de Usuario");
        bg.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        favicon1.setBackground(new java.awt.Color(187, 155, 107));
        favicon1.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        favicon1.setForeground(new java.awt.Color(204, 0, 0));
        favicon1.setText("Nido \"Sonrisitas\"");
        bg.add(favicon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        txtDNI.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(204, 204, 204));
        txtDNI.setText("Ingrese el DNI");
        txtDNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDNI.setCaretColor(new java.awt.Color(0, 51, 204));
        txtDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDNIMousePressed(evt);
            }
        });
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        bg.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 270, 30));

        panel4.setBackground(new java.awt.Color(252, 148, 148));
        panel4.setBorder(new javax.swing.border.MatteBorder(null));

        nombrelbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombrelbl.setForeground(new java.awt.Color(102, 0, 0));
        nombrelbl.setText("DNI");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nombrelbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(nombrelbl))
        );

        bg.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 160, 20));

        exitBtn.setBackground(new java.awt.Color(255, 229, 181));

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

        bg.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        agregarBtn.setBackground(new java.awt.Color(182, 249, 205));
        agregarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        agregarBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        agregarBtnTxt.setForeground(new java.awt.Color(79, 209, 123));
        agregarBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarBtnTxt.setText("REGISTRARSE");
        agregarBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 209, 123), 2));
        agregarBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout agregarBtnLayout = new javax.swing.GroupLayout(agregarBtn);
        agregarBtn.setLayout(agregarBtnLayout);
        agregarBtnLayout.setHorizontalGroup(
            agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarBtnLayout.createSequentialGroup()
                .addComponent(agregarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        agregarBtnLayout.setVerticalGroup(
            agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarBtnLayout.createSequentialGroup()
                .addComponent(agregarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(agregarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 660, 150, 50));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Ingrese el nombre");
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
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 270, 30));

        panel6.setBackground(new java.awt.Color(252, 148, 148));
        panel6.setBorder(new javax.swing.border.MatteBorder(null));

        nombrelbl2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombrelbl2.setForeground(new java.awt.Color(102, 0, 0));
        nombrelbl2.setText("Apellido");

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nombrelbl2)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(nombrelbl2))
        );

        bg.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        txtApellido.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtApellido.setText("Ingrese el apellido");
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtApellido.setCaretColor(new java.awt.Color(0, 51, 204));
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoMousePressed(evt);
            }
        });
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        bg.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 270, 30));

        txtEdad.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(204, 204, 204));
        txtEdad.setText("Ingrese la edad");
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
        bg.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 270, 30));

        panel7.setBackground(new java.awt.Color(252, 148, 148));
        panel7.setBorder(new javax.swing.border.MatteBorder(null));

        nombrelbl3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombrelbl3.setForeground(new java.awt.Color(102, 0, 0));
        nombrelbl3.setText("Edad");

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nombrelbl3)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(nombrelbl3))
        );

        bg.add(panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(204, 204, 204));
        txtDireccion.setText("Ingrese la dirección");
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDireccion.setCaretColor(new java.awt.Color(0, 51, 204));
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDireccionMousePressed(evt);
            }
        });
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        bg.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 270, 30));

        panel8.setBackground(new java.awt.Color(252, 148, 148));
        panel8.setBorder(new javax.swing.border.MatteBorder(null));

        nombrelbl4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombrelbl4.setForeground(new java.awt.Color(102, 0, 0));
        nombrelbl4.setText("Dirección");

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nombrelbl4)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(nombrelbl4))
        );

        bg.add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        panel9.setBackground(new java.awt.Color(252, 148, 148));
        panel9.setBorder(new javax.swing.border.MatteBorder(null));

        nombrelbl5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombrelbl5.setForeground(new java.awt.Color(102, 0, 0));
        nombrelbl5.setText("Correo Electrónico");

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nombrelbl5)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(nombrelbl5))
        );

        bg.add(panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setText("Ingrese el correo electrónico");
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCorreo.setCaretColor(new java.awt.Color(0, 51, 204));
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        bg.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 270, 30));

        panel10.setBackground(new java.awt.Color(252, 148, 148));
        panel10.setBorder(new javax.swing.border.MatteBorder(null));

        nombrelbl6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombrelbl6.setForeground(new java.awt.Color(102, 0, 0));
        nombrelbl6.setText("Contraseña");

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nombrelbl6)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel10Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(nombrelbl6))
        );

        bg.add(panel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, -1, -1));

        txtPass.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtPass.setForeground(new java.awt.Color(204, 204, 204));
        txtPass.setText("Ingrese la contraseña");
        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPass.setCaretColor(new java.awt.Color(0, 51, 204));
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        bg.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 270, 30));

        panel5.setBackground(new java.awt.Color(252, 148, 148));
        panel5.setBorder(new javax.swing.border.MatteBorder(null));

        nombrelbl1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombrelbl1.setForeground(new java.awt.Color(102, 0, 0));
        nombrelbl1.setText("Nombre");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nombrelbl1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(nombrelbl1))
        );

        bg.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 160, 20));

        citybg.setBackground(new java.awt.Color(0, 134, 190));
        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/lindo-fondo-escritorio-animal-abeja-infantil_23-2148946634.png"))); // NOI18N
        bg.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 740));

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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            Login vista1 = new Login();
            vista1.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(new Color(255, 229, 181));
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void agregarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarBtnTxtMouseEntered
        agregarBtn.setBackground(new Color(79, 209, 123));
        agregarBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_agregarBtnTxtMouseEntered

    private void agregarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarBtnTxtMouseExited
        agregarBtn.setBackground(new Color(182, 249, 205));
        agregarBtnTxt.setForeground(new Color(79, 209, 123));
    }//GEN-LAST:event_agregarBtnTxtMouseExited

    private void txtDNIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDNIMousePressed
        if (txtDNI.getText().equals("Ingrese el DNI")) {
            txtDNI.setText("");
            txtDNI.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtDNIMousePressed

    private void agregarBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarBtnTxtMouseClicked
        if ("".equals(txtNombre.getText()) || "Ingrese el nombre".equals(txtNombre.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese un Nombre", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtApellido.getText()) || "Ingrese el apellido".equals(txtApellido.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese un Apellido", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtEdad.getText()) || "Ingrese la edad".equals(txtEdad.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese una Edad", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtDNI.getText()) || "Ingrese el DNI".equals(txtDNI.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese un DNI", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtDireccion.getText()) || "Ingrese la dirección".equals(txtDireccion.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese una Dirección", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtCorreo.getText()) || "Ingrese el correo electrónico".equals(txtDNI.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese un correo electrónico", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtDireccion.getText()) || "Ingrese la contraseña".equals(txtDireccion.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese una contraseña", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "¿Está seguro de registarse?", "REGISTRO DE USUARIO", JOptionPane.YES_NO_OPTION);
        if (confirmation == 0) {
            ad.setApoderadoID(ad.generarID());
            ad.setDni(Integer.parseInt(txtDNI.getText()));
            ad.setNombre(txtNombre.getText());
            ad.setApellido(txtApellido.getText());
            ad.setEdad(Integer.parseInt(txtEdad.getText()));
            ad.setDireccion(txtDireccion.getText());
            ad.setCorreo(txtCorreo.getText());
            ad.setContraseña(txtPass.getText());
            apoderado.RegistrarApoderado(ad);
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Usuario Registrado con Éxito ", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_agregarBtnTxtMouseClicked

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if (txtNombre.getText().equals("Ingrese el nombre")) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMousePressed
        if (txtApellido.getText().equals("Ingrese el apellido")) {
            txtApellido.setText("");
            txtApellido.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtApellidoMousePressed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtEdadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEdadMousePressed
        if (txtEdad.getText().equals("Ingrese la edad")) {
            txtEdad.setText("");
            txtEdad.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtEdadMousePressed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMousePressed
        if (txtDireccion.getText().equals("Ingrese la dirección")) {
            txtDireccion.setText("");
            txtDireccion.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtDireccionMousePressed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        if (txtCorreo.getText().equals("Ingrese el correo electrónico")) {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        if (txtPass.getText().equals("Ingrese la contraseña")) {
            txtPass.setText("");
            txtPass.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtPassMousePressed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarBtn;
    private javax.swing.JLabel agregarBtnTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel citybg;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JLabel favicon1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel nombrelbl;
    private javax.swing.JLabel nombrelbl1;
    private javax.swing.JLabel nombrelbl2;
    private javax.swing.JLabel nombrelbl3;
    private javax.swing.JLabel nombrelbl4;
    private javax.swing.JLabel nombrelbl5;
    private javax.swing.JLabel nombrelbl6;
    private javax.swing.JPanel panel10;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel panel9;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPass;
    // End of variables declaration//GEN-END:variables
}
