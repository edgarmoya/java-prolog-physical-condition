package condicionfisica.visual;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

public class TestWindow extends javax.swing.JFrame {

    public TestWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(this.getIconImage());
        tf_age.requestFocus();
    }

    @Override
    public final Image getIconImage() {
        Image res = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("condicionfisica/images/icon.png"));
        return res;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgroup_coordination = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        tabbed = new condicionfisica.customs.MaterialTabbed();
        jp_biometric = new javax.swing.JPanel();
        jp_footer5 = new javax.swing.JPanel();
        btn_next = new condicionfisica.customs.Button();
        btn_mainmenu = new condicionfisica.customs.Button();
        lb_icon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_age = new condicionfisica.customs.TextField();
        tf_weight = new condicionfisica.customs.TextField();
        tf_height = new condicionfisica.customs.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jp_coordination = new javax.swing.JPanel();
        jp_footer1 = new javax.swing.JPanel();
        btn_next1 = new condicionfisica.customs.Button();
        btn_previous1 = new condicionfisica.customs.Button();
        rb_coo_1 = new condicionfisica.customs.RadioButton();
        rb_coo_2 = new condicionfisica.customs.RadioButton();
        rb_coo_3 = new condicionfisica.customs.RadioButton();
        rb_coo_5 = new condicionfisica.customs.RadioButton();
        rb_coo_4 = new condicionfisica.customs.RadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jp_flexibility = new javax.swing.JPanel();
        jp_footer2 = new javax.swing.JPanel();
        btn_next2 = new condicionfisica.customs.Button();
        btn_previous2 = new condicionfisica.customs.Button();
        jp_strength = new javax.swing.JPanel();
        jp_footer3 = new javax.swing.JPanel();
        btn_next3 = new condicionfisica.customs.Button();
        btn_previous3 = new condicionfisica.customs.Button();
        jp_resistance = new javax.swing.JPanel();
        jp_footer4 = new javax.swing.JPanel();
        btn_finish = new condicionfisica.customs.Button();
        btn_previous4 = new condicionfisica.customs.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Condición Física");
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        tabbed.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jp_biometric.setBackground(new java.awt.Color(255, 255, 255));

        jp_footer5.setBackground(new java.awt.Color(255, 255, 255));

        btn_next.setBackground(new java.awt.Color(0, 102, 255));
        btn_next.setForeground(new java.awt.Color(255, 255, 255));
        btn_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/icon_arrow-right.png"))); // NOI18N
        btn_next.setText("Siguiente");
        btn_next.setToolTipText("Siguiente prueba");
        btn_next.setFocusPainted(false);
        btn_next.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_next.setIconTextGap(12);
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_mainmenu.setBackground(new java.awt.Color(0, 102, 255));
        btn_mainmenu.setForeground(new java.awt.Color(255, 255, 255));
        btn_mainmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/icon_menu.png"))); // NOI18N
        btn_mainmenu.setText("Menú Principal");
        btn_mainmenu.setToolTipText("Volver al menú principal");
        btn_mainmenu.setFocusPainted(false);
        btn_mainmenu.setIconTextGap(12);
        btn_mainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mainmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_footer5Layout = new javax.swing.GroupLayout(jp_footer5);
        jp_footer5.setLayout(jp_footer5Layout);
        jp_footer5Layout.setHorizontalGroup(
            jp_footer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 419, Short.MAX_VALUE)
                .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jp_footer5Layout.setVerticalGroup(
            jp_footer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jp_footer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        lb_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/image_height.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Edad");

        tf_age.setToolTipText("Inserte su edad");

        tf_weight.setToolTipText("Inserte su peso en kilogramos");

        tf_height.setToolTipText("Inserte su altura en centímetros");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Altura (cm)");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Peso (kg)");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Complete los siguientes campos:");

        javax.swing.GroupLayout jp_biometricLayout = new javax.swing.GroupLayout(jp_biometric);
        jp_biometric.setLayout(jp_biometricLayout);
        jp_biometricLayout.setHorizontalGroup(
            jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_biometricLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lb_icon)
                .addGap(60, 60, 60)
                .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tf_age, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_weight, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_height, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_biometricLayout.setVerticalGroup(
            jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_biometricLayout.createSequentialGroup()
                .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_biometricLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(tf_weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(tf_height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_biometricLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jp_footer5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Biométrica", new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/icon_body-scale.png")), jp_biometric); // NOI18N

        jp_coordination.setBackground(new java.awt.Color(255, 255, 255));

        jp_footer1.setBackground(new java.awt.Color(255, 255, 255));

        btn_next1.setBackground(new java.awt.Color(0, 102, 255));
        btn_next1.setForeground(new java.awt.Color(255, 255, 255));
        btn_next1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/icon_arrow-right.png"))); // NOI18N
        btn_next1.setText("Siguiente");
        btn_next1.setToolTipText("Siguiente prueba");
        btn_next1.setFocusPainted(false);
        btn_next1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_next1.setIconTextGap(12);
        btn_next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_next1ActionPerformed(evt);
            }
        });

        btn_previous1.setBackground(new java.awt.Color(0, 102, 255));
        btn_previous1.setForeground(new java.awt.Color(255, 255, 255));
        btn_previous1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/icon_arrow-left.png"))); // NOI18N
        btn_previous1.setText("Anterior");
        btn_previous1.setToolTipText("Prueba anterior");
        btn_previous1.setFocusPainted(false);
        btn_previous1.setIconTextGap(12);
        btn_previous1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previous1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_footer1Layout = new javax.swing.GroupLayout(jp_footer1);
        jp_footer1.setLayout(jp_footer1Layout);
        jp_footer1Layout.setHorizontalGroup(
            jp_footer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_previous1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_next1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jp_footer1Layout.setVerticalGroup(
            jp_footer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jp_footer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_next1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_previous1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        bgroup_coordination.add(rb_coo_1);
        rb_coo_1.setSelected(true);
        rb_coo_1.setText("<html>No mantiene el equilibrio sobre un pie ni tan siquiera balanceándose o no es capaz de mantener <br> la posición durante cinco segundos.");
        rb_coo_1.setActionCommand("No mantiene el equilibrio");
        rb_coo_1.setFocusPainted(false);
        rb_coo_1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_1.setIconTextGap(8);

        bgroup_coordination.add(rb_coo_2);
        rb_coo_2.setText("Mantiene el equilibrio al menos cinco segundos, aunque sea necesario balancearse.");
        rb_coo_2.setActionCommand("Mantiene el equilibrio al menos cinco segundos");
        rb_coo_2.setFocusPainted(false);
        rb_coo_2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_2.setIconTextGap(8);

        bgroup_coordination.add(rb_coo_3);
        rb_coo_3.setText("Mantiene el equilibrio por lo menos diez segundos, aunque sea balanceándose en algún momento.");
        rb_coo_3.setActionCommand("Mantiene el equilibrio por lo menos diez segundos");
        rb_coo_3.setFocusPainted(false);
        rb_coo_3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_3.setIconTextGap(8);

        bgroup_coordination.add(rb_coo_5);
        rb_coo_5.setText("<html>Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima <br> de la cabeza, aunque sea balanceándose.");
        rb_coo_5.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_5.setFocusPainted(false);
        rb_coo_5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_5.setIconTextGap(8);

        bgroup_coordination.add(rb_coo_4);
        rb_coo_4.setText("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados, aunque sea balanceándose.");
        rb_coo_4.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados");
        rb_coo_4.setFocusPainted(false);
        rb_coo_4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_4.setIconTextGap(8);

        jScrollPane1.setBorder(null);

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Hay que descalzarse sobre una superficie lisa y no deslizante y levantar una pierna sin que esta entre en contacto con la pierna de apoyo. Mientras dura el ejercicio, las manos se mantienen apoyadas sin esfuerzo en las caderas. Se da como buena aquella posición que es capaz de mantenerse sin tener que hacer movimientos compensatorios para evitar perder el equilibrio.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Seleccione:");

        javax.swing.GroupLayout jp_coordinationLayout = new javax.swing.GroupLayout(jp_coordination);
        jp_coordination.setLayout(jp_coordinationLayout);
        jp_coordinationLayout.setHorizontalGroup(
            jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_coordinationLayout.createSequentialGroup()
                .addGroup(jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_coordinationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rb_coo_5, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_coordinationLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rb_coo_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                            .addComponent(rb_coo_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jp_coordinationLayout.setVerticalGroup(
            jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_coordinationLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(rb_coo_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_coo_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_coo_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_coo_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_coo_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jp_footer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        tabbed.addTab("Coordinación", new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/icon_equanimity.png")), jp_coordination); // NOI18N

        jp_flexibility.setBackground(new java.awt.Color(255, 255, 255));

        jp_footer2.setBackground(new java.awt.Color(255, 255, 255));

        btn_next2.setBackground(new java.awt.Color(0, 102, 255));
        btn_next2.setForeground(new java.awt.Color(255, 255, 255));
        btn_next2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/icon_arrow-right.png"))); // NOI18N
        btn_next2.setText("Siguiente");
        btn_next2.setToolTipText("Siguiente prueba");
        btn_next2.setFocusPainted(false);
        btn_next2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_next2.setIconTextGap(12);
        btn_next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_next2ActionPerformed(evt);
            }
        });

        btn_previous2.setBackground(new java.awt.Color(0, 102, 255));
        btn_previous2.setForeground(new java.awt.Color(255, 255, 255));
        btn_previous2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/icon_arrow-left.png"))); // NOI18N
        btn_previous2.setText("Anterior");
        btn_previous2.setToolTipText("Prueba anterior");
        btn_previous2.setFocusPainted(false);
        btn_previous2.setIconTextGap(12);
        btn_previous2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previous2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_footer2Layout = new javax.swing.GroupLayout(jp_footer2);
        jp_footer2.setLayout(jp_footer2Layout);
        jp_footer2Layout.setHorizontalGroup(
            jp_footer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_previous2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 433, Short.MAX_VALUE)
                .addComponent(btn_next2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jp_footer2Layout.setVerticalGroup(
            jp_footer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jp_footer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_next2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_previous2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jp_flexibilityLayout = new javax.swing.GroupLayout(jp_flexibility);
        jp_flexibility.setLayout(jp_flexibilityLayout);
        jp_flexibilityLayout.setHorizontalGroup(
            jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_flexibilityLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jp_footer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_flexibilityLayout.setVerticalGroup(
            jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_flexibilityLayout.createSequentialGroup()
                .addGap(0, 404, Short.MAX_VALUE)
                .addComponent(jp_footer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Flexibilidad", new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/icon_diet.png")), jp_flexibility); // NOI18N

        jp_strength.setBackground(new java.awt.Color(255, 255, 255));

        jp_footer3.setBackground(new java.awt.Color(255, 255, 255));

        btn_next3.setBackground(new java.awt.Color(0, 102, 255));
        btn_next3.setForeground(new java.awt.Color(255, 255, 255));
        btn_next3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/icon_arrow-right.png"))); // NOI18N
        btn_next3.setText("Siguiente");
        btn_next3.setToolTipText("Siguiente prueba");
        btn_next3.setFocusPainted(false);
        btn_next3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_next3.setIconTextGap(12);
        btn_next3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_next3ActionPerformed(evt);
            }
        });

        btn_previous3.setBackground(new java.awt.Color(0, 102, 255));
        btn_previous3.setForeground(new java.awt.Color(255, 255, 255));
        btn_previous3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/icon_arrow-left.png"))); // NOI18N
        btn_previous3.setText("Anterior");
        btn_previous3.setToolTipText("Prueba anterior");
        btn_previous3.setFocusPainted(false);
        btn_previous3.setIconTextGap(12);
        btn_previous3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previous3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_footer3Layout = new javax.swing.GroupLayout(jp_footer3);
        jp_footer3.setLayout(jp_footer3Layout);
        jp_footer3Layout.setHorizontalGroup(
            jp_footer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_previous3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 433, Short.MAX_VALUE)
                .addComponent(btn_next3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jp_footer3Layout.setVerticalGroup(
            jp_footer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jp_footer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_next3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_previous3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jp_strengthLayout = new javax.swing.GroupLayout(jp_strength);
        jp_strength.setLayout(jp_strengthLayout);
        jp_strengthLayout.setHorizontalGroup(
            jp_strengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_strengthLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jp_footer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_strengthLayout.setVerticalGroup(
            jp_strengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_strengthLayout.createSequentialGroup()
                .addGap(0, 404, Short.MAX_VALUE)
                .addComponent(jp_footer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Fortaleza", new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/icon_three-dumbell.png")), jp_strength); // NOI18N

        jp_resistance.setBackground(new java.awt.Color(255, 255, 255));

        jp_footer4.setBackground(new java.awt.Color(255, 255, 255));

        btn_finish.setBackground(new java.awt.Color(0, 102, 255));
        btn_finish.setForeground(new java.awt.Color(255, 255, 255));
        btn_finish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/icon_check.png"))); // NOI18N
        btn_finish.setText("Finalizar");
        btn_finish.setToolTipText("Finalizar diagnóstico");
        btn_finish.setFocusPainted(false);
        btn_finish.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_finish.setIconTextGap(12);
        btn_finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finishActionPerformed(evt);
            }
        });

        btn_previous4.setBackground(new java.awt.Color(0, 102, 255));
        btn_previous4.setForeground(new java.awt.Color(255, 255, 255));
        btn_previous4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/icon_arrow-left.png"))); // NOI18N
        btn_previous4.setText("Anterior");
        btn_previous4.setToolTipText("Prueba anterior");
        btn_previous4.setFocusPainted(false);
        btn_previous4.setIconTextGap(12);
        btn_previous4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previous4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_footer4Layout = new javax.swing.GroupLayout(jp_footer4);
        jp_footer4.setLayout(jp_footer4Layout);
        jp_footer4Layout.setHorizontalGroup(
            jp_footer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_previous4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 433, Short.MAX_VALUE)
                .addComponent(btn_finish, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jp_footer4Layout.setVerticalGroup(
            jp_footer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jp_footer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_finish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_previous4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jp_resistanceLayout = new javax.swing.GroupLayout(jp_resistance);
        jp_resistance.setLayout(jp_resistanceLayout);
        jp_resistanceLayout.setHorizontalGroup(
            jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_resistanceLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jp_footer4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_resistanceLayout.setVerticalGroup(
            jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_resistanceLayout.createSequentialGroup()
                .addGap(0, 404, Short.MAX_VALUE)
                .addComponent(jp_footer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Resistencia", new javax.swing.ImageIcon(getClass().getResource("/condicionfisica/images/icon_run.png")), jp_resistance); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbed.getAccessibleContext().setAccessibleName("Tab");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_next1ActionPerformed
        transactionsNext();
    }//GEN-LAST:event_btn_next1ActionPerformed

    private void btn_previous1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previous1ActionPerformed
        transactionsPrevious();
    }//GEN-LAST:event_btn_previous1ActionPerformed

    private void btn_next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_next2ActionPerformed
        transactionsNext();
    }//GEN-LAST:event_btn_next2ActionPerformed

    private void btn_previous2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previous2ActionPerformed
        transactionsPrevious();
    }//GEN-LAST:event_btn_previous2ActionPerformed

    private void btn_next3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_next3ActionPerformed
        transactionsNext();
    }//GEN-LAST:event_btn_next3ActionPerformed

    private void btn_previous3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previous3ActionPerformed
        transactionsPrevious();
    }//GEN-LAST:event_btn_previous3ActionPerformed

    private void btn_finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finishActionPerformed
        actionFinish();
    }//GEN-LAST:event_btn_finishActionPerformed

    private void btn_previous4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previous4ActionPerformed
        transactionsPrevious();
    }//GEN-LAST:event_btn_previous4ActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        transactionsNext();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainmenuActionPerformed
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_mainmenuActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestWindow().setVisible(true);
            }
        });
    }
    
    private void transactionsNext(){
        int currentIndex = tabbed.getSelectedIndex();
        int maxIndex = tabbed.getTabCount() - 1;
        if (currentIndex < maxIndex) {
            tabbed.setSelectedIndex(currentIndex + 1);
        }
    }
    
    private void transactionsPrevious(){
        int currentIndex = tabbed.getSelectedIndex();
        if (currentIndex > 0) {
            tabbed.setSelectedIndex(currentIndex - 1);
        }
    }
    
    private void actionFinish() {
        System.out.println("Finish");
        System.out.println(""+optionSelected(bgroup_coordination));
        String weight = tf_weight.getText();
        String height = tf_height.getText();
        if (isFieldValids()) {
            System.out.println("valid");
            System.out.println(""+imc(Double.parseDouble(weight), Double.parseDouble(height)));
        }  
    }
    
    private String optionSelected(ButtonGroup button_group){
        ButtonModel selectedButtonModel = button_group.getSelection();
        return selectedButtonModel.getActionCommand();
    }
    
    private String imc(double wieght, double height){
        String res = "";
        double imc = wieght/(height*height);
        if (imc < 18.5){
            res = "bajo peso";
        }else if(imc < 25){
            res = "normal";
        }else if (imc < 30){
            res = "sobrepeso";
        }else{  
            res = "obesidad";
        }
        return res;
    }
    
    private boolean isInteger(String input){
        String regex = "^[1-9]\\d*$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input).matches();
    }
    
    private boolean isFloat(String input){
        String regex = "^\\d+(\\.\\d+)?$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input).matches();
    }
    
    private boolean isFieldValids(){
        String age = tf_age.getText();
        String weight = tf_weight.getText();
        String height = tf_height.getText();
        if (isInteger(age) && isFloat(weight) && isFloat(height)){
            if (Integer.parseInt(age) > 0 && Double.parseDouble(weight) > 0 && Double.parseDouble(height) > 0){
                return true;
            }           
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.ButtonGroup bgroup_coordination;
    private condicionfisica.customs.Button btn_finish;
    private condicionfisica.customs.Button btn_mainmenu;
    private condicionfisica.customs.Button btn_next;
    private condicionfisica.customs.Button btn_next1;
    private condicionfisica.customs.Button btn_next2;
    private condicionfisica.customs.Button btn_next3;
    private condicionfisica.customs.Button btn_previous1;
    private condicionfisica.customs.Button btn_previous2;
    private condicionfisica.customs.Button btn_previous3;
    private condicionfisica.customs.Button btn_previous4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel jp_biometric;
    private javax.swing.JPanel jp_coordination;
    private javax.swing.JPanel jp_flexibility;
    private javax.swing.JPanel jp_footer1;
    private javax.swing.JPanel jp_footer2;
    private javax.swing.JPanel jp_footer3;
    private javax.swing.JPanel jp_footer4;
    private javax.swing.JPanel jp_footer5;
    private javax.swing.JPanel jp_resistance;
    private javax.swing.JPanel jp_strength;
    private javax.swing.JLabel lb_icon;
    private condicionfisica.customs.RadioButton rb_coo_1;
    private condicionfisica.customs.RadioButton rb_coo_2;
    private condicionfisica.customs.RadioButton rb_coo_3;
    private condicionfisica.customs.RadioButton rb_coo_4;
    private condicionfisica.customs.RadioButton rb_coo_5;
    private condicionfisica.customs.MaterialTabbed tabbed;
    private condicionfisica.customs.TextField tf_age;
    private condicionfisica.customs.TextField tf_height;
    private condicionfisica.customs.TextField tf_weight;
    // End of variables declaration//GEN-END:variables

}
