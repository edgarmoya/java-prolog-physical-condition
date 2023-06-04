package physical_condition.visual;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import physical_condition.Connection;
import physical_condition.ResultModel;

public class FAQWindow extends javax.swing.JFrame {

    public FAQWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(this.getIconImage());
        setTypes();
    }
    
    @Override
    public final Image getIconImage() {
        Image res = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("physical_condition/images/icon.png"));
        return res;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panel_top = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_back = new physical_condition.customs.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        faq_panel = new javax.swing.JPanel();
        faq1 = new physical_condition.customs.Panel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        labelMessage = new javax.swing.JTextArea();
        faq2 = new physical_condition.customs.Panel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        labelMessage1 = new javax.swing.JTextArea();
        faq3 = new physical_condition.customs.Panel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        labelMessage2 = new javax.swing.JTextArea();
        faq4 = new physical_condition.customs.Panel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        labelMessage3 = new javax.swing.JTextArea();
        faq5 = new physical_condition.customs.Panel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        labelMessage4 = new javax.swing.JTextArea();
        faq6 = new physical_condition.customs.Panel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        lb_condiciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Preguntas Frecuentes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bg.setBackground(new java.awt.Color(255, 255, 255));

        panel_top.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Preguntas Frecuentes");

        btn_back.setBackground(new java.awt.Color(0, 102, 255));
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/physical_condition/images/icon_arrow-left.png"))); // NOI18N
        btn_back.setText("Atrás");
        btn_back.setToolTipText("Ir al menú principal");
        btn_back.setFocusPainted(false);
        btn_back.setIconTextGap(12);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_topLayout = new javax.swing.GroupLayout(panel_top);
        panel_top.setLayout(panel_topLayout);
        panel_topLayout.setHorizontalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_topLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_topLayout.setVerticalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_topLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(617, 432));

        faq_panel.setBackground(new java.awt.Color(255, 255, 255));
        faq_panel.setAutoscrolls(true);
        faq_panel.setPreferredSize(new java.awt.Dimension(800, 750));

        faq1.setBackground(new java.awt.Color(235, 243, 254));
        faq1.setRoundBottomLeft(15);
        faq1.setRoundBottomRight(15);
        faq1.setRoundTopLeft(15);
        faq1.setRoundTopRight(15);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("¿Qué es la condición física?");

        jScrollPane3.setBorder(null);

        labelMessage.setBackground(new java.awt.Color(235, 243, 254));
        labelMessage.setColumns(20);
        labelMessage.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelMessage.setLineWrap(true);
        labelMessage.setRows(2);
        labelMessage.setText("Este término hace referencia a la capacidad de realizar actividades rutinarias con fuerza y ahorrando parte de tu energía para actividades lúdicas o situaciones de emergencia.");
        labelMessage.setWrapStyleWord(true);
        labelMessage.setAlignmentX(0.0F);
        labelMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        labelMessage.setFocusable(false);
        jScrollPane3.setViewportView(labelMessage);

        javax.swing.GroupLayout faq1Layout = new javax.swing.GroupLayout(faq1);
        faq1.setLayout(faq1Layout);
        faq1Layout.setHorizontalGroup(
            faq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faq1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(faq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20))
        );
        faq1Layout.setVerticalGroup(
            faq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faq1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        faq2.setBackground(new java.awt.Color(235, 243, 254));
        faq2.setRoundBottomLeft(15);
        faq2.setRoundBottomRight(15);
        faq2.setRoundTopLeft(15);
        faq2.setRoundTopRight(15);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("¿Qué debo hacer para mejorar la condición física?");

        jScrollPane4.setBorder(null);

        labelMessage1.setBackground(new java.awt.Color(235, 243, 254));
        labelMessage1.setColumns(20);
        labelMessage1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelMessage1.setLineWrap(true);
        labelMessage1.setRows(2);
        labelMessage1.setText("Para ponerse en forma tienes que desarrollar los componentes básicos de la condición física, que son: fuerza, flexibilidad y capacidad aeróbica.");
        labelMessage1.setWrapStyleWord(true);
        labelMessage1.setAlignmentX(0.0F);
        labelMessage1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        labelMessage1.setFocusable(false);
        jScrollPane4.setViewportView(labelMessage1);

        javax.swing.GroupLayout faq2Layout = new javax.swing.GroupLayout(faq2);
        faq2.setLayout(faq2Layout);
        faq2Layout.setHorizontalGroup(
            faq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faq2Layout.createSequentialGroup()
                .addGroup(faq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(faq2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2))
                    .addGroup(faq2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        faq2Layout.setVerticalGroup(
            faq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faq2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        faq3.setBackground(new java.awt.Color(235, 243, 254));
        faq3.setRoundBottomLeft(15);
        faq3.setRoundBottomRight(15);
        faq3.setRoundTopLeft(15);
        faq3.setRoundTopRight(15);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("¿Es importante practicar deportes o hacer actividad física?");

        jScrollPane5.setBorder(null);

        labelMessage2.setBackground(new java.awt.Color(235, 243, 254));
        labelMessage2.setColumns(20);
        labelMessage2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelMessage2.setLineWrap(true);
        labelMessage2.setRows(5);
        labelMessage2.setText("Sí, y mucho. Practicar ejercicios y hacer actividad física cotidiana puede ayudar a prevenir o retrasar el desarrollo de enfermedades crónicas como diabetes tipo 2, algunos tipos de cáncer, osteoporosis y enfermedades cardiovasculares. Además, mejora el estado de ánimo, estimula la agilidad mental, alivia la depresión, ayuda a manejar el estrés y mejora la capacidad de relacionarnos con otras personas.");
        labelMessage2.setWrapStyleWord(true);
        labelMessage2.setAlignmentX(0.0F);
        labelMessage2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        labelMessage2.setFocusable(false);
        jScrollPane5.setViewportView(labelMessage2);

        javax.swing.GroupLayout faq3Layout = new javax.swing.GroupLayout(faq3);
        faq3.setLayout(faq3Layout);
        faq3Layout.setHorizontalGroup(
            faq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faq3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(faq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20))
        );
        faq3Layout.setVerticalGroup(
            faq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faq3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        faq4.setBackground(new java.awt.Color(235, 243, 254));
        faq4.setRoundBottomLeft(15);
        faq4.setRoundBottomRight(15);
        faq4.setRoundTopLeft(15);
        faq4.setRoundTopRight(15);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("¿Tengo que consultar al médico antes de empezar a practicar actividad física?");

        jScrollPane6.setBorder(null);

        labelMessage3.setBackground(new java.awt.Color(235, 243, 254));
        labelMessage3.setColumns(20);
        labelMessage3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelMessage3.setLineWrap(true);
        labelMessage3.setRows(3);
        labelMessage3.setText("Conviene que lo hagan especialmente los hombres sedentarios de más de cuarenta años, las mujeres mayores de cincuenta, aquellos que padecen alguna enfermedad crónica y los que tienen cualquier duda acerca de su salud.");
        labelMessage3.setWrapStyleWord(true);
        labelMessage3.setAlignmentX(0.0F);
        labelMessage3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        labelMessage3.setFocusable(false);
        jScrollPane6.setViewportView(labelMessage3);

        javax.swing.GroupLayout faq4Layout = new javax.swing.GroupLayout(faq4);
        faq4.setLayout(faq4Layout);
        faq4Layout.setHorizontalGroup(
            faq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faq4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(faq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20))
        );
        faq4Layout.setVerticalGroup(
            faq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faq4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        faq5.setBackground(new java.awt.Color(235, 243, 254));
        faq5.setRoundBottomLeft(15);
        faq5.setRoundBottomRight(15);
        faq5.setRoundTopLeft(15);
        faq5.setRoundTopRight(15);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("¿Debo mantener siempre el mismo tipo de actividad física?");

        jScrollPane7.setBorder(null);

        labelMessage4.setBackground(new java.awt.Color(235, 243, 254));
        labelMessage4.setColumns(20);
        labelMessage4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelMessage4.setLineWrap(true);
        labelMessage4.setRows(4);
        labelMessage4.setText("Es bueno variar de actividad, puedes cambiar los ejercicios que haces, el horario y la cantidad de tiempo. Alternar ejercicios como caminar, correr, tomar clases de aerobics, hacer pesas, yoga, un deporte u otros. Aflojar un poco en un área y concentrarse en otra puede darte nuevo impulso cuando te aburras o te cueste moverse.");
        labelMessage4.setWrapStyleWord(true);
        labelMessage4.setAlignmentX(0.0F);
        labelMessage4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        labelMessage4.setFocusable(false);
        jScrollPane7.setViewportView(labelMessage4);

        javax.swing.GroupLayout faq5Layout = new javax.swing.GroupLayout(faq5);
        faq5.setLayout(faq5Layout);
        faq5Layout.setHorizontalGroup(
            faq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faq5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(faq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20))
        );
        faq5Layout.setVerticalGroup(
            faq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faq5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        faq6.setBackground(new java.awt.Color(235, 243, 254));
        faq6.setRoundBottomLeft(15);
        faq6.setRoundBottomRight(15);
        faq6.setRoundTopLeft(15);
        faq6.setRoundTopRight(15);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("¿Cuáles son los tipos de condiciones según la altura y el peso?");

        jScrollPane8.setBorder(null);

        lb_condiciones.setBackground(new java.awt.Color(235, 243, 254));
        lb_condiciones.setColumns(20);
        lb_condiciones.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lb_condiciones.setLineWrap(true);
        lb_condiciones.setRows(7);
        lb_condiciones.setText("condiciones\n");
        lb_condiciones.setWrapStyleWord(true);
        lb_condiciones.setAlignmentX(0.0F);
        lb_condiciones.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lb_condiciones.setFocusable(false);
        jScrollPane8.setViewportView(lb_condiciones);

        javax.swing.GroupLayout faq6Layout = new javax.swing.GroupLayout(faq6);
        faq6.setLayout(faq6Layout);
        faq6Layout.setHorizontalGroup(
            faq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faq6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(faq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20))
        );
        faq6Layout.setVerticalGroup(
            faq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faq6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout faq_panelLayout = new javax.swing.GroupLayout(faq_panel);
        faq_panel.setLayout(faq_panelLayout);
        faq_panelLayout.setHorizontalGroup(
            faq_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faq_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(faq_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(faq3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faq5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faq6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faq4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        faq_panelLayout.setVerticalGroup(
            faq_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faq_panelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(faq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(faq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(faq6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(faq3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(faq4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(faq5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(faq_panel);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(panel_top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
        );

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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_formWindowClosing

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(FAQWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAQWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAQWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAQWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAQWindow().setVisible(true);
            }
        });
    }
    
    private void setTypes(){
        ResultModel rm = new ResultModel();
        String[] files = new String[1];
        files[0] = "src/physical_condition/prolog.pl";
        Connection c = new Connection(files);
        List<String> types = c.types_conditions();
        
        String msg = "Según el resultado del Indice de Masa Corporal (IMC), existen varias clasificaciones las cuales son:\n";
        for (int i = 0; i < types.size(); i++) {
            msg += "● " + rm.inside(types.get(i)) + "\n";
        }       
        lb_condiciones.setText(msg);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private physical_condition.customs.Button btn_back;
    private physical_condition.customs.Button btn_mainmenu;
    private physical_condition.customs.Button btn_mainmenu1;
    private physical_condition.customs.Button btn_mainmenu2;
    private physical_condition.customs.Panel faq1;
    private physical_condition.customs.Panel faq2;
    private physical_condition.customs.Panel faq3;
    private physical_condition.customs.Panel faq4;
    private physical_condition.customs.Panel faq5;
    private physical_condition.customs.Panel faq6;
    private javax.swing.JPanel faq_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea labelMessage;
    private javax.swing.JTextArea labelMessage1;
    private javax.swing.JTextArea labelMessage2;
    private javax.swing.JTextArea labelMessage3;
    private javax.swing.JTextArea labelMessage4;
    private javax.swing.JTextArea lb_condiciones;
    private javax.swing.JPanel panel_top;
    // End of variables declaration//GEN-END:variables
}
