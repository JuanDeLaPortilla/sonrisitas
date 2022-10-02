package Vista;

import DAO.CRUDasignatura;
import Modelo.Asignatura;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Asignaturas extends javax.swing.JFrame {

    int xMouse, yMouse;
    Asignatura as = new Asignatura();
    CRUDasignatura asignatura = new CRUDasignatura();
    DefaultTableModel modelo = new DefaultTableModel();

    public Asignaturas() {
        initComponents();
        this.setLocationRelativeTo(null);
        listarAsignaturas();
    }

    public void listarAsignaturas() {
        List<Asignatura> listarAS = asignatura.ListarAsignatura();
        modelo = (DefaultTableModel) tableAsignatura.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < listarAS.size(); i++) {
            ob[0] = listarAS.get(i).getAsignaturaID();
            ob[1] = listarAS.get(i).getNombre();
            ob[2] = listarAS.get(i).getHorario();
            ob[3] = listarAS.get(i).getProfesorID();
            ob[4] = asignatura.buscarNombreProfesor(listarAS.get(i).getProfesorID(), listarAS.get(i).getAsignaturaID());
            modelo.addRow(ob);
        }
        tableAsignatura.setModel(modelo);
    }

    public void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
        }
    }

    public void limpiarCampos() {
        txtHorario.setText("Ingrese el horario");
        txtIdProfesor.setText("Ingrese el ID del Profesor");
        txtIdAsignatura.setText("Ingrese el ID");
        txtNombre.setText("Ingrese el nombre");
    }

    public String generarID(int id) {
        DecimalFormat df = new DecimalFormat("AS0000");
        return df.format(id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        favicon = new javax.swing.JLabel();
        favicon1 = new javax.swing.JLabel();
        txtIdProfesor = new javax.swing.JTextField();
        panel = new javax.swing.JPanel();
        iddocente = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        nombrelbl = new javax.swing.JLabel();
        txtIdAsignatura = new javax.swing.JTextField();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        agregarBtn = new javax.swing.JPanel();
        agregarBtnTxt = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JPanel();
        buscarBtnTxt = new javax.swing.JLabel();
        deletelBtn = new javax.swing.JPanel();
        deleteBtnTxt = new javax.swing.JLabel();
        updateBtn = new javax.swing.JPanel();
        updateBtnTxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAsignatura = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        panel6 = new javax.swing.JPanel();
        nombrelbl2 = new javax.swing.JLabel();
        txtHorario = new javax.swing.JTextField();
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
        favicon.setText("Panel de Asignaturas");
        bg.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        favicon1.setBackground(new java.awt.Color(187, 155, 107));
        favicon1.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        favicon1.setForeground(new java.awt.Color(204, 0, 0));
        favicon1.setText("Nido \"Sonrisitas\"");
        bg.add(favicon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        txtIdProfesor.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtIdProfesor.setForeground(new java.awt.Color(204, 204, 204));
        txtIdProfesor.setText("Ingrese el ID del Profesor");
        txtIdProfesor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIdProfesor.setCaretColor(new java.awt.Color(0, 51, 204));
        txtIdProfesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdProfesorMousePressed(evt);
            }
        });
        txtIdProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProfesorActionPerformed(evt);
            }
        });
        bg.add(txtIdProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 270, 30));

        panel.setBackground(new java.awt.Color(252, 148, 148));
        panel.setBorder(new javax.swing.border.MatteBorder(null));

        iddocente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        iddocente.setForeground(new java.awt.Color(102, 0, 0));
        iddocente.setText("ID Asignatura");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(iddocente)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(iddocente))
        );

        bg.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 160, 20));

        panel4.setBackground(new java.awt.Color(252, 148, 148));
        panel4.setBorder(new javax.swing.border.MatteBorder(null));

        nombrelbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombrelbl.setForeground(new java.awt.Color(102, 0, 0));
        nombrelbl.setText("ID Profesor");

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

        bg.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 160, 20));

        txtIdAsignatura.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtIdAsignatura.setForeground(new java.awt.Color(204, 204, 204));
        txtIdAsignatura.setText("Ingrese el ID");
        txtIdAsignatura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIdAsignatura.setCaretColor(new java.awt.Color(0, 51, 204));
        txtIdAsignatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdAsignaturaMousePressed(evt);
            }
        });
        txtIdAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAsignaturaActionPerformed(evt);
            }
        });
        bg.add(txtIdAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 270, 30));

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
        agregarBtnTxt.setText("AGREGAR");
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
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(agregarBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(agregarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        agregarBtnLayout.setVerticalGroup(
            agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(agregarBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(agregarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(agregarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 120, 50));

        buscarBtn.setBackground(new java.awt.Color(197, 218, 249));
        buscarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buscarBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        buscarBtnTxt.setForeground(new java.awt.Color(91, 150, 238));
        buscarBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarBtnTxt.setText("BUSCAR");
        buscarBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(91, 150, 238), 2));
        buscarBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buscarBtnLayout = new javax.swing.GroupLayout(buscarBtn);
        buscarBtn.setLayout(buscarBtnLayout);
        buscarBtnLayout.setHorizontalGroup(
            buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buscarBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(buscarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        buscarBtnLayout.setVerticalGroup(
            buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buscarBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(buscarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 120, 50));

        deletelBtn.setBackground(new java.awt.Color(249, 206, 206));
        deletelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletelBtn.setPreferredSize(new java.awt.Dimension(120, 50));

        deleteBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        deleteBtnTxt.setForeground(new java.awt.Color(239, 71, 71));
        deleteBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteBtnTxt.setText("ELIMINAR");
        deleteBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 71, 71), 2));
        deleteBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout deletelBtnLayout = new javax.swing.GroupLayout(deletelBtn);
        deletelBtn.setLayout(deletelBtnLayout);
        deletelBtnLayout.setHorizontalGroup(
            deletelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(deletelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deletelBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deleteBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        deletelBtnLayout.setVerticalGroup(
            deletelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(deletelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deletelBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deleteBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(deletelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        updateBtn.setBackground(new java.awt.Color(255, 255, 204));
        updateBtn.setForeground(new java.awt.Color(102, 102, 102));
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.setPreferredSize(new java.awt.Dimension(120, 50));

        updateBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        updateBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        updateBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateBtnTxt.setText("ACTUALIZAR");
        updateBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        updateBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout updateBtnLayout = new javax.swing.GroupLayout(updateBtn);
        updateBtn.setLayout(updateBtnLayout);
        updateBtnLayout.setHorizontalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateBtnLayout.createSequentialGroup()
                .addComponent(updateBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        updateBtnLayout.setVerticalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateBtnLayout.createSequentialGroup()
                .addComponent(updateBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, -1, -1));

        tableAsignatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ASIGNATURA", "NOMBRE ", "HORARIO", "ID PROFESOR", "NOMBRE PROFESOR"
            }
        ));
        jScrollPane1.setViewportView(tableAsignatura);
        if (tableAsignatura.getColumnModel().getColumnCount() > 0) {
            tableAsignatura.getColumnModel().getColumn(0).setPreferredWidth(120);
            tableAsignatura.getColumnModel().getColumn(0).setMaxWidth(120);
            tableAsignatura.getColumnModel().getColumn(1).setPreferredWidth(120);
            tableAsignatura.getColumnModel().getColumn(1).setMaxWidth(120);
            tableAsignatura.getColumnModel().getColumn(3).setPreferredWidth(120);
            tableAsignatura.getColumnModel().getColumn(3).setMaxWidth(120);
            tableAsignatura.getColumnModel().getColumn(4).setPreferredWidth(130);
            tableAsignatura.getColumnModel().getColumn(4).setMaxWidth(130);
        }

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 690, 370));

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
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 270, 30));

        panel6.setBackground(new java.awt.Color(252, 148, 148));
        panel6.setBorder(new javax.swing.border.MatteBorder(null));

        nombrelbl2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombrelbl2.setForeground(new java.awt.Color(102, 0, 0));
        nombrelbl2.setText("Horario");

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

        bg.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, -1, -1));

        txtHorario.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtHorario.setForeground(new java.awt.Color(204, 204, 204));
        txtHorario.setText("Ingrese el horario");
        txtHorario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtHorario.setCaretColor(new java.awt.Color(0, 51, 204));
        txtHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtHorarioMousePressed(evt);
            }
        });
        txtHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioActionPerformed(evt);
            }
        });
        bg.add(txtHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 270, 30));

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

        bg.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 160, 20));

        citybg.setBackground(new java.awt.Color(0, 134, 190));
        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/lindo-fondo-escritorio-animal-abeja-infantil_23-2148946634.png"))); // NOI18N
        bg.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 550));

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
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            AdminVista vista1 = new AdminVista();
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

    private void txtIdProfesorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdProfesorMousePressed
        if (txtIdProfesor.getText().equals("Ingrese el ID del Profesor")) {
            txtIdProfesor.setText("");
            txtIdProfesor.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtIdProfesorMousePressed

    private void agregarBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarBtnTxtMouseClicked
        if ("".equals(txtIdAsignatura.getText()) || "Ingrese el ID".equals(txtIdAsignatura.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese un ID", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtNombre.getText()) || "Ingrese el nombre".equals(txtNombre.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese un Nombre", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtHorario.getText()) || "Ingrese el horario".equals(txtHorario.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese un Horario", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtIdProfesor.getText()) || "Ingrese el ID del Profesor".equals(txtIdProfesor.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese un ID de profesor", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        as.setAsignaturaID(generarID(Integer.parseInt(txtIdAsignatura.getText())));
        as.setNombre(txtNombre.getText());
        as.setHorario(txtHorario.getText());
        as.setProfesorID(txtIdProfesor.getText());
        asignatura.RegistrarAsignatura(as);
        limpiarTabla();
        limpiarCampos();
        listarAsignaturas();
        JOptionPane.showMessageDialog(this, "Asignatura Registrada con Éxito ", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_agregarBtnTxtMouseClicked

    private void buscarBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnTxtMouseClicked
        if ("".equals(txtIdAsignatura.getText()) || "Ingrese el ID".equals(txtIdAsignatura.getText()) || null == (txtIdAsignatura.getText())) {
            String id = JOptionPane.showInputDialog(null, "Ingrese el ID de la asignatura a buscar", "BUSCAR ASIGNATURA", JOptionPane.INFORMATION_MESSAGE);
            if (id != null) {
                JOptionPane.showMessageDialog(null, (asignatura.BuscarAsignatura(id)), ("DATOS DE LA ASIGNATURA " + id), JOptionPane.INFORMATION_MESSAGE);
                limpiarTabla();
                limpiarCampos();
                listarAsignaturas();
            }
            return;
        }
        String id = txtIdAsignatura.getText();
        JOptionPane.showMessageDialog(null, (asignatura.BuscarAsignatura(id)), ("DATOS DE LA ASIGNATURA " + id), JOptionPane.INFORMATION_MESSAGE);
        limpiarTabla();
        limpiarCampos();
        listarAsignaturas();
    }//GEN-LAST:event_buscarBtnTxtMouseClicked

    private void buscarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnTxtMouseEntered
        buscarBtn.setBackground(new Color(91, 150, 238));
        buscarBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_buscarBtnTxtMouseEntered

    private void buscarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnTxtMouseExited
        buscarBtn.setBackground(new Color(197, 218, 249));
        buscarBtnTxt.setForeground(new Color(91, 150, 238));
    }//GEN-LAST:event_buscarBtnTxtMouseExited

    private void deleteBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnTxtMouseClicked
        if ("".equals(txtIdAsignatura.getText()) || "Ingrese el ID".equals(txtIdAsignatura.getText()) || null == txtIdAsignatura) {
            String id = JOptionPane.showInputDialog(null, "Ingrese el ID de la asignatura a eliminar", "ELIMINAR ASIGNATURA", JOptionPane.INFORMATION_MESSAGE);
            if (id != null) {
                int confirmation = JOptionPane.showConfirmDialog(null, ("¿Estas seguro de eliminar la asignatura " + id + " ?"), "ELIMINAR ASIGNATURA", JOptionPane.YES_NO_OPTION);
                if (confirmation == 0) {
                    asignatura.EliminarAsignatura(id);
                    limpiarTabla();
                    limpiarCampos();
                    listarAsignaturas();
                    JOptionPane.showMessageDialog(this, "Asignatura Eliminada con Éxito ", "ELIMINACIÓN EXITOSA", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            return;
        }
        String id = txtIdAsignatura.getText();
        int confirmation = JOptionPane.showConfirmDialog(null, ("¿Estas seguro de eliminar la asignatura " + id + " ?"), "ELIMINAR ASIGNATURA", JOptionPane.YES_NO_OPTION);
        if (confirmation == 0) {
            asignatura.EliminarAsignatura(id);
            limpiarTabla();
            limpiarCampos();
            listarAsignaturas();
            JOptionPane.showMessageDialog(this, "Asignatura Eliminada con Éxito ", "ELIMINACIÓN EXITOSA", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnTxtMouseClicked

    private void deleteBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnTxtMouseEntered
        deletelBtn.setBackground(new Color(239, 71, 71));
        deleteBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_deleteBtnTxtMouseEntered

    private void deleteBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnTxtMouseExited
        deletelBtn.setBackground(new Color(249, 206, 206));
        deleteBtnTxt.setForeground(new Color(239, 71, 71));
    }//GEN-LAST:event_deleteBtnTxtMouseExited

    private void txtIdProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProfesorActionPerformed

    private void txtIdAsignaturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdAsignaturaMousePressed
        if (txtIdAsignatura.getText().equals("Ingrese el ID")) {
            txtIdAsignatura.setText("");
            txtIdAsignatura.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtIdAsignaturaMousePressed

    private void txtIdAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAsignaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAsignaturaActionPerformed

    private void updateBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnTxtMouseClicked
        if ("".equals(txtIdAsignatura.getText()) || "Ingrese el ID".equals(txtIdAsignatura.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese un ID", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtNombre.getText()) || "Ingrese el nombre".equals(txtNombre.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese un Nombre", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtHorario.getText()) || "Ingrese el horario".equals(txtHorario.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese un Horario", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ("".equals(txtIdProfesor.getText()) || "Ingrese el ID del Profesor".equals(txtIdProfesor.getText())) {
            JOptionPane.showMessageDialog(null, "Porfavor Ingrese un ID de profesor", "CAMPO INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        as.setAsignaturaID(generarID(Integer.parseInt(txtIdAsignatura.getText())));
        as.setNombre(txtNombre.getText());
        as.setHorario(txtHorario.getText());
        as.setProfesorID(txtIdProfesor.getText());
        int confirmation = JOptionPane.showConfirmDialog(null, ("¿Estas seguro de actualizar la asignatura " + as.getAsignaturaID()+ " ?"), "ACTUALIZAR ASIGNATURA", JOptionPane.YES_NO_OPTION);
        if (confirmation == 0) {
            asignatura.ModificarAsignatura(as);
            limpiarTabla();
            limpiarCampos();
            listarAsignaturas();
            JOptionPane.showMessageDialog(this, "Asignatura Actualizada con Éxito ", "ACTUALIZACIÓN EXITOSA", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_updateBtnTxtMouseClicked

    private void updateBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnTxtMouseEntered
        updateBtn.setBackground(Color.white);
        updateBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_updateBtnTxtMouseEntered

    private void updateBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnTxtMouseExited
        updateBtn.setBackground(new Color(255, 255, 204));
        updateBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_updateBtnTxtMouseExited

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if (txtNombre.getText().equals("Ingrese el nombre")) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtHorarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHorarioMousePressed
        if (txtHorario.getText().equals("Ingrese el horario")) {
            txtHorario.setText("");
            txtHorario.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtHorarioMousePressed

    private void txtHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioActionPerformed

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
            java.util.logging.Logger.getLogger(Asignaturas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asignaturas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asignaturas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asignaturas.class
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
                new Asignaturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarBtn;
    private javax.swing.JLabel agregarBtnTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel buscarBtn;
    private javax.swing.JLabel buscarBtnTxt;
    private javax.swing.JLabel citybg;
    private javax.swing.JLabel deleteBtnTxt;
    private javax.swing.JPanel deletelBtn;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JLabel favicon1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel iddocente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombrelbl;
    private javax.swing.JLabel nombrelbl1;
    private javax.swing.JLabel nombrelbl2;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JTable tableAsignatura;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtIdAsignatura;
    private javax.swing.JTextField txtIdProfesor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPanel updateBtn;
    private javax.swing.JLabel updateBtnTxt;
    // End of variables declaration//GEN-END:variables
}
