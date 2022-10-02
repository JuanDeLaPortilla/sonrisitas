package Vista;

import java.awt.Color;
import javax.swing.JOptionPane;

public class AdminVista extends javax.swing.JFrame {

    int xMouse, yMouse;

    public AdminVista() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        favicon = new javax.swing.JLabel();
        adminsBtn = new javax.swing.JPanel();
        adminsBtnTxt = new javax.swing.JLabel();
        seccionesBtn = new javax.swing.JPanel();
        seccionesBtnTxt = new javax.swing.JLabel();
        estudiantesBtn = new javax.swing.JPanel();
        estudiantesBtnTxt = new javax.swing.JLabel();
        docenteBtn = new javax.swing.JPanel();
        docentesBtnTxt = new javax.swing.JLabel();
        apoderadoBtn = new javax.swing.JPanel();
        apoderadosBtnTxt = new javax.swing.JLabel();
        estudiantes_apoderadoBtn = new javax.swing.JPanel();
        estudiantes_apoderadoBtnTxt = new javax.swing.JLabel();
        asignaturas_seccionBtn = new javax.swing.JPanel();
        asignaturas_seccionBtnTxt = new javax.swing.JLabel();
        estudiantes_seccionBtn = new javax.swing.JPanel();
        estudiantes_seccionBtnTxt = new javax.swing.JLabel();
        asignaturasBtn = new javax.swing.JPanel();
        asignaturasBtnTxt = new javax.swing.JLabel();
        favicon1 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(550, 459));
        bg.setPreferredSize(new java.awt.Dimension(550, 459));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 510, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 40));

        favicon.setBackground(new java.awt.Color(187, 155, 107));
        favicon.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        favicon.setForeground(new java.awt.Color(51, 51, 51));
        favicon.setText("Panel de Control");
        bg.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        adminsBtn.setBackground(new java.awt.Color(228, 228, 228));
        adminsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        adminsBtnTxt.setBackground(new java.awt.Color(235, 235, 235));
        adminsBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        adminsBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminsBtnTxt.setText("ADMINS");
        adminsBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        adminsBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminsBtnTxt.setMaximumSize(new java.awt.Dimension(147, 34));
        adminsBtnTxt.setMinimumSize(new java.awt.Dimension(147, 34));
        adminsBtnTxt.setPreferredSize(new java.awt.Dimension(147, 34));
        adminsBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminsBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminsBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminsBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout adminsBtnLayout = new javax.swing.GroupLayout(adminsBtn);
        adminsBtn.setLayout(adminsBtnLayout);
        adminsBtnLayout.setHorizontalGroup(
            adminsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(adminsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adminsBtnLayout.createSequentialGroup()
                    .addComponent(adminsBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        adminsBtnLayout.setVerticalGroup(
            adminsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(adminsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(adminsBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        bg.add(adminsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 170, 70));

        seccionesBtn.setBackground(new java.awt.Color(228, 228, 228));
        seccionesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        seccionesBtnTxt.setBackground(new java.awt.Color(235, 235, 235));
        seccionesBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        seccionesBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seccionesBtnTxt.setText("SECCIONES");
        seccionesBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        seccionesBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seccionesBtnTxt.setMaximumSize(new java.awt.Dimension(147, 34));
        seccionesBtnTxt.setMinimumSize(new java.awt.Dimension(147, 34));
        seccionesBtnTxt.setPreferredSize(new java.awt.Dimension(147, 34));
        seccionesBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seccionesBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seccionesBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                seccionesBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout seccionesBtnLayout = new javax.swing.GroupLayout(seccionesBtn);
        seccionesBtn.setLayout(seccionesBtnLayout);
        seccionesBtnLayout.setHorizontalGroup(
            seccionesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(seccionesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(seccionesBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
        );
        seccionesBtnLayout.setVerticalGroup(
            seccionesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(seccionesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(seccionesBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        bg.add(seccionesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 170, 70));

        estudiantesBtn.setBackground(new java.awt.Color(228, 228, 228));
        estudiantesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        estudiantesBtnTxt.setBackground(new java.awt.Color(235, 235, 235));
        estudiantesBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        estudiantesBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estudiantesBtnTxt.setText("ESTUDIANTES");
        estudiantesBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        estudiantesBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estudiantesBtnTxt.setMaximumSize(new java.awt.Dimension(147, 34));
        estudiantesBtnTxt.setMinimumSize(new java.awt.Dimension(147, 34));
        estudiantesBtnTxt.setPreferredSize(new java.awt.Dimension(147, 34));
        estudiantesBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estudiantesBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                estudiantesBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                estudiantesBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout estudiantesBtnLayout = new javax.swing.GroupLayout(estudiantesBtn);
        estudiantesBtn.setLayout(estudiantesBtnLayout);
        estudiantesBtnLayout.setHorizontalGroup(
            estudiantesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(estudiantesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(estudiantesBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
        );
        estudiantesBtnLayout.setVerticalGroup(
            estudiantesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(estudiantesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(estudiantesBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        bg.add(estudiantesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 170, 70));

        docenteBtn.setBackground(new java.awt.Color(235, 235, 235));
        docenteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        docentesBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        docentesBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        docentesBtnTxt.setText("DOCENTES");
        docentesBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        docentesBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        docentesBtnTxt.setMaximumSize(new java.awt.Dimension(147, 34));
        docentesBtnTxt.setMinimumSize(new java.awt.Dimension(147, 34));
        docentesBtnTxt.setPreferredSize(new java.awt.Dimension(147, 34));
        docentesBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docentesBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                docentesBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                docentesBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout docenteBtnLayout = new javax.swing.GroupLayout(docenteBtn);
        docenteBtn.setLayout(docenteBtnLayout);
        docenteBtnLayout.setHorizontalGroup(
            docenteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(docentesBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        docenteBtnLayout.setVerticalGroup(
            docenteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(docentesBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        bg.add(docenteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 170, 70));

        apoderadoBtn.setBackground(new java.awt.Color(235, 235, 235));
        apoderadoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        apoderadosBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        apoderadosBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apoderadosBtnTxt.setText("APODERADOS");
        apoderadosBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        apoderadosBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apoderadosBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apoderadosBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                apoderadosBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                apoderadosBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout apoderadoBtnLayout = new javax.swing.GroupLayout(apoderadoBtn);
        apoderadoBtn.setLayout(apoderadoBtnLayout);
        apoderadoBtnLayout.setHorizontalGroup(
            apoderadoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(apoderadoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apoderadoBtnLayout.createSequentialGroup()
                    .addComponent(apoderadosBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        apoderadoBtnLayout.setVerticalGroup(
            apoderadoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
            .addGroup(apoderadoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apoderadoBtnLayout.createSequentialGroup()
                    .addComponent(apoderadosBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(apoderadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 170, 70));

        estudiantes_apoderadoBtn.setBackground(new java.awt.Color(228, 228, 228));
        estudiantes_apoderadoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        estudiantes_apoderadoBtnTxt.setBackground(new java.awt.Color(235, 235, 235));
        estudiantes_apoderadoBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        estudiantes_apoderadoBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estudiantes_apoderadoBtnTxt.setText("<html><center>ESTUDIANTES <br> X <br> APODERADO </center></html>");
        estudiantes_apoderadoBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        estudiantes_apoderadoBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estudiantes_apoderadoBtnTxt.setMaximumSize(new java.awt.Dimension(147, 34));
        estudiantes_apoderadoBtnTxt.setMinimumSize(new java.awt.Dimension(147, 34));
        estudiantes_apoderadoBtnTxt.setPreferredSize(new java.awt.Dimension(147, 34));
        estudiantes_apoderadoBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estudiantes_apoderadoBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                estudiantes_apoderadoBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                estudiantes_apoderadoBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout estudiantes_apoderadoBtnLayout = new javax.swing.GroupLayout(estudiantes_apoderadoBtn);
        estudiantes_apoderadoBtn.setLayout(estudiantes_apoderadoBtnLayout);
        estudiantes_apoderadoBtnLayout.setHorizontalGroup(
            estudiantes_apoderadoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(estudiantes_apoderadoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(estudiantes_apoderadoBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
        );
        estudiantes_apoderadoBtnLayout.setVerticalGroup(
            estudiantes_apoderadoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(estudiantes_apoderadoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(estudiantes_apoderadoBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );

        bg.add(estudiantes_apoderadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 780, 170, 130));

        asignaturas_seccionBtn.setBackground(new java.awt.Color(228, 228, 228));
        asignaturas_seccionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        asignaturas_seccionBtnTxt.setBackground(new java.awt.Color(235, 235, 235));
        asignaturas_seccionBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        asignaturas_seccionBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asignaturas_seccionBtnTxt.setText("<html><center>ASIGNATURAS <br> X <br> SECCION </center></html>");
        asignaturas_seccionBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        asignaturas_seccionBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asignaturas_seccionBtnTxt.setMaximumSize(new java.awt.Dimension(147, 34));
        asignaturas_seccionBtnTxt.setMinimumSize(new java.awt.Dimension(147, 34));
        asignaturas_seccionBtnTxt.setPreferredSize(new java.awt.Dimension(147, 34));
        asignaturas_seccionBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                asignaturas_seccionBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                asignaturas_seccionBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                asignaturas_seccionBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout asignaturas_seccionBtnLayout = new javax.swing.GroupLayout(asignaturas_seccionBtn);
        asignaturas_seccionBtn.setLayout(asignaturas_seccionBtnLayout);
        asignaturas_seccionBtnLayout.setHorizontalGroup(
            asignaturas_seccionBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(asignaturas_seccionBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(asignaturas_seccionBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
        );
        asignaturas_seccionBtnLayout.setVerticalGroup(
            asignaturas_seccionBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(asignaturas_seccionBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(asignaturas_seccionBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );

        bg.add(asignaturas_seccionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 170, 130));

        estudiantes_seccionBtn.setBackground(new java.awt.Color(228, 228, 228));
        estudiantes_seccionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        estudiantes_seccionBtnTxt.setBackground(new java.awt.Color(235, 235, 235));
        estudiantes_seccionBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        estudiantes_seccionBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estudiantes_seccionBtnTxt.setText("<html><center>ESTUDIANTES <br> X <br> SECCION </center></html>");
        estudiantes_seccionBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        estudiantes_seccionBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estudiantes_seccionBtnTxt.setMaximumSize(new java.awt.Dimension(147, 34));
        estudiantes_seccionBtnTxt.setMinimumSize(new java.awt.Dimension(147, 34));
        estudiantes_seccionBtnTxt.setPreferredSize(new java.awt.Dimension(147, 34));
        estudiantes_seccionBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estudiantes_seccionBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                estudiantes_seccionBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                estudiantes_seccionBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout estudiantes_seccionBtnLayout = new javax.swing.GroupLayout(estudiantes_seccionBtn);
        estudiantes_seccionBtn.setLayout(estudiantes_seccionBtnLayout);
        estudiantes_seccionBtnLayout.setHorizontalGroup(
            estudiantes_seccionBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(estudiantes_seccionBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(estudiantes_seccionBtnLayout.createSequentialGroup()
                    .addComponent(estudiantes_seccionBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        estudiantes_seccionBtnLayout.setVerticalGroup(
            estudiantes_seccionBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(estudiantes_seccionBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(estudiantes_seccionBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );

        bg.add(estudiantes_seccionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 170, 130));

        asignaturasBtn.setBackground(new java.awt.Color(235, 235, 235));
        asignaturasBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        asignaturasBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        asignaturasBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asignaturasBtnTxt.setText("ASIGNATURAS");
        asignaturasBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        asignaturasBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asignaturasBtnTxt.setMaximumSize(new java.awt.Dimension(147, 34));
        asignaturasBtnTxt.setMinimumSize(new java.awt.Dimension(147, 34));
        asignaturasBtnTxt.setPreferredSize(new java.awt.Dimension(147, 34));
        asignaturasBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                asignaturasBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                asignaturasBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                asignaturasBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout asignaturasBtnLayout = new javax.swing.GroupLayout(asignaturasBtn);
        asignaturasBtn.setLayout(asignaturasBtnLayout);
        asignaturasBtnLayout.setHorizontalGroup(
            asignaturasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asignaturasBtnLayout.createSequentialGroup()
                .addComponent(asignaturasBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        asignaturasBtnLayout.setVerticalGroup(
            asignaturasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(asignaturasBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        bg.add(asignaturasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 170, -1));

        favicon1.setBackground(new java.awt.Color(187, 155, 107));
        favicon1.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        favicon1.setForeground(new java.awt.Color(51, 51, 51));
        favicon1.setText("NIDO \"SONRISITAS\"");
        bg.add(favicon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/6f773050ada66498f36acc7d00a9850c.jpg"))); // NOI18N
        img.setText("jLabel1");
        bg.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 560, 1210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
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
        exitBtn.setBackground(Color.black);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void estudiantesBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudiantesBtnTxtMouseEntered
        estudiantesBtn.setBackground(Color.white);
        estudiantesBtnTxt.setForeground(new Color(235, 235, 235));
    }//GEN-LAST:event_estudiantesBtnTxtMouseEntered

    private void estudiantesBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudiantesBtnTxtMouseExited
        estudiantesBtn.setBackground(new Color(235, 235, 235));
        estudiantesBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_estudiantesBtnTxtMouseExited

    private void estudiantesBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudiantesBtnTxtMouseClicked
        Estudiantes abrir = new Estudiantes();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_estudiantesBtnTxtMouseClicked

    private void docentesBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docentesBtnTxtMouseClicked
        Docentes abrir = new Docentes();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_docentesBtnTxtMouseClicked

    private void docentesBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docentesBtnTxtMouseEntered
        docenteBtn.setBackground(Color.white);
        docentesBtnTxt.setForeground(new Color(235, 235, 235));
    }//GEN-LAST:event_docentesBtnTxtMouseEntered

    private void docentesBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docentesBtnTxtMouseExited
        docenteBtn.setBackground(new Color(235, 235, 235));
        docentesBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_docentesBtnTxtMouseExited

    private void apoderadosBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apoderadosBtnTxtMouseClicked
        Apoderados abrir = new Apoderados();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_apoderadosBtnTxtMouseClicked

    private void apoderadosBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apoderadosBtnTxtMouseEntered
        apoderadoBtn.setBackground(Color.white);
        apoderadosBtnTxt.setForeground(new Color(235, 235, 235));
    }//GEN-LAST:event_apoderadosBtnTxtMouseEntered

    private void apoderadosBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apoderadosBtnTxtMouseExited
        apoderadoBtn.setBackground(new Color(235, 235, 235));
        apoderadosBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_apoderadosBtnTxtMouseExited

    private void asignaturasBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignaturasBtnTxtMouseClicked
        Asignaturas abrir = new Asignaturas();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_asignaturasBtnTxtMouseClicked

    private void asignaturasBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignaturasBtnTxtMouseEntered
        asignaturasBtn.setBackground(Color.white);
        asignaturasBtnTxt.setForeground(new Color(235, 235, 235));
    }//GEN-LAST:event_asignaturasBtnTxtMouseEntered

    private void asignaturasBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignaturasBtnTxtMouseExited
        asignaturasBtn.setBackground(new Color(235, 235, 235));
        asignaturasBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_asignaturasBtnTxtMouseExited

    private void seccionesBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionesBtnTxtMouseClicked
        Secciones abrir = new Secciones();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_seccionesBtnTxtMouseClicked

    private void seccionesBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionesBtnTxtMouseEntered
        seccionesBtn.setBackground(Color.white);
        seccionesBtnTxt.setForeground(new Color(235, 235, 235));
    }//GEN-LAST:event_seccionesBtnTxtMouseEntered

    private void seccionesBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seccionesBtnTxtMouseExited
        seccionesBtn.setBackground(new Color(235, 235, 235));
        seccionesBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_seccionesBtnTxtMouseExited

    private void adminsBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminsBtnTxtMouseClicked
        Admins abrir = new Admins();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_adminsBtnTxtMouseClicked

    private void adminsBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminsBtnTxtMouseEntered
        adminsBtn.setBackground(Color.white);
        adminsBtnTxt.setForeground(new Color(235, 235, 235));
    }//GEN-LAST:event_adminsBtnTxtMouseEntered

    private void adminsBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminsBtnTxtMouseExited
        adminsBtn.setBackground(new Color(235, 235, 235));
        adminsBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_adminsBtnTxtMouseExited

    private void asignaturas_seccionBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignaturas_seccionBtnTxtMouseClicked
        Asignaturas_Seccion abrir = new Asignaturas_Seccion();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_asignaturas_seccionBtnTxtMouseClicked

    private void asignaturas_seccionBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignaturas_seccionBtnTxtMouseEntered
        asignaturas_seccionBtn.setBackground(Color.white);
        asignaturas_seccionBtnTxt.setForeground(new Color(235, 235, 235));
    }//GEN-LAST:event_asignaturas_seccionBtnTxtMouseEntered

    private void asignaturas_seccionBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignaturas_seccionBtnTxtMouseExited
        asignaturas_seccionBtn.setBackground(new Color(235, 235, 235));
        asignaturas_seccionBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_asignaturas_seccionBtnTxtMouseExited

    private void estudiantes_seccionBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudiantes_seccionBtnTxtMouseClicked
        Estudiantes_Seccion abrir = new Estudiantes_Seccion();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_estudiantes_seccionBtnTxtMouseClicked

    private void estudiantes_seccionBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudiantes_seccionBtnTxtMouseEntered
        estudiantes_seccionBtn.setBackground(Color.white);
        estudiantes_seccionBtnTxt.setForeground(new Color(235, 235, 235));
    }//GEN-LAST:event_estudiantes_seccionBtnTxtMouseEntered

    private void estudiantes_seccionBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudiantes_seccionBtnTxtMouseExited
        estudiantes_seccionBtn.setBackground(new Color(235, 235, 235));
        estudiantes_seccionBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_estudiantes_seccionBtnTxtMouseExited

    private void estudiantes_apoderadoBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudiantes_apoderadoBtnTxtMouseClicked
        Estudiantes_Apoderado abrir = new Estudiantes_Apoderado();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_estudiantes_apoderadoBtnTxtMouseClicked

    private void estudiantes_apoderadoBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudiantes_apoderadoBtnTxtMouseEntered
        estudiantes_apoderadoBtn.setBackground(Color.white);
        estudiantes_apoderadoBtnTxt.setForeground(new Color(235, 235, 235));
    }//GEN-LAST:event_estudiantes_apoderadoBtnTxtMouseEntered

    private void estudiantes_apoderadoBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudiantes_apoderadoBtnTxtMouseExited
        estudiantes_apoderadoBtn.setBackground(new Color(235, 235, 235));
        estudiantes_apoderadoBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_estudiantes_apoderadoBtnTxtMouseExited

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
            java.util.logging.Logger.getLogger(AdminVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new AdminVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminsBtn;
    private javax.swing.JLabel adminsBtnTxt;
    private javax.swing.JPanel apoderadoBtn;
    private javax.swing.JLabel apoderadosBtnTxt;
    private javax.swing.JPanel asignaturasBtn;
    private javax.swing.JLabel asignaturasBtnTxt;
    private javax.swing.JPanel asignaturas_seccionBtn;
    private javax.swing.JLabel asignaturas_seccionBtnTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel docenteBtn;
    private javax.swing.JLabel docentesBtnTxt;
    private javax.swing.JPanel estudiantesBtn;
    private javax.swing.JLabel estudiantesBtnTxt;
    private javax.swing.JPanel estudiantes_apoderadoBtn;
    private javax.swing.JLabel estudiantes_apoderadoBtnTxt;
    private javax.swing.JPanel estudiantes_seccionBtn;
    private javax.swing.JLabel estudiantes_seccionBtnTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JLabel favicon1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel img;
    private javax.swing.JPanel seccionesBtn;
    private javax.swing.JLabel seccionesBtnTxt;
    // End of variables declaration//GEN-END:variables
}
