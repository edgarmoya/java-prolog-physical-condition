package physical_condition.visual;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;

public class ResultDialog extends javax.swing.JDialog {

    private String action;

    public ResultDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(this.getIconImage());
    }
    
    public final Image getIconImage() {
        Image res = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("physical_condition/images/icon.png"));
        return res;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        labelPoints = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        btn_again = new physical_condition.customs.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        labelMessage = new javax.swing.JTextArea();
        btn_mainmenu = new physical_condition.customs.Button();
        jScrollPane4 = new javax.swing.JScrollPane();
        labelSuggestion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Resultado");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bg.setBackground(new java.awt.Color(255, 255, 255));

        labelPoints.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        labelPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPoints.setText("Puntos");

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/physical_condition/images/icon_rated.png"))); // NOI18N

        btn_again.setBackground(new java.awt.Color(0, 102, 255));
        btn_again.setForeground(new java.awt.Color(255, 255, 255));
        btn_again.setIcon(new javax.swing.ImageIcon(getClass().getResource("/physical_condition/images/icon_rotate.png"))); // NOI18N
        btn_again.setText("Volver a realizar");
        btn_again.setToolTipText("Volver a realizar otra prueba");
        btn_again.setFocusPainted(false);
        btn_again.setIconTextGap(12);
        btn_again.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_againActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(null);

        labelMessage.setBackground(new java.awt.Color(255, 255, 255));
        labelMessage.setColumns(20);
        labelMessage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMessage.setLineWrap(true);
        labelMessage.setRows(2);
        labelMessage.setWrapStyleWord(true);
        labelMessage.setAlignmentX(0.0F);
        labelMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        labelMessage.setFocusable(false);
        jScrollPane3.setViewportView(labelMessage);

        btn_mainmenu.setBackground(new java.awt.Color(0, 102, 255));
        btn_mainmenu.setForeground(new java.awt.Color(255, 255, 255));
        btn_mainmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/physical_condition/images/icon_menu.png"))); // NOI18N
        btn_mainmenu.setText("Menú Principal");
        btn_mainmenu.setToolTipText("Volver al menú principal");
        btn_mainmenu.setFocusPainted(false);
        btn_mainmenu.setIconTextGap(12);
        btn_mainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mainmenuActionPerformed(evt);
            }
        });

        jScrollPane4.setBorder(null);

        labelSuggestion.setBackground(new java.awt.Color(255, 255, 255));
        labelSuggestion.setColumns(20);
        labelSuggestion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelSuggestion.setLineWrap(true);
        labelSuggestion.setRows(6);
        labelSuggestion.setWrapStyleWord(true);
        labelSuggestion.setAlignmentX(0.0F);
        labelSuggestion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        labelSuggestion.setFocusable(false);
        jScrollPane4.setViewportView(labelSuggestion);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Resultados:");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn_mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_again, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))
                        .addGap(32, 32, 32))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPoints)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_again, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void btn_againActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_againActionPerformed
        action = "again";
        this.dispose();
    }//GEN-LAST:event_btn_againActionPerformed

    private void btn_mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainmenuActionPerformed
        action = "menu";
        this.dispose();
    }//GEN-LAST:event_btn_mainmenuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        action = "menu";
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ResultDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResultDialog dialog = new ResultDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    public void setPoints(String points){
        String msg = "Puntuación: "+points+"/20";
        labelPoints.setText(msg);
    }
    
    public void setMessage(String msg){
        String inside = msg.substring(1, msg.length() - 1);
        labelMessage.setText(inside);
    }
    
    public void setSuggestions(List<String> list){ 
        String msg = "";
        for (int i = 0; i < list.size(); i++) {
            msg += "● " + list.get(i) + "\n";
        }
        labelSuggestion.setText(msg);
    }
    
    public String getAction(){
        return action;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private physical_condition.customs.Button btn_again;
    private physical_condition.customs.Button btn_mainmenu;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea labelMessage;
    private javax.swing.JLabel labelPoints;
    private javax.swing.JTextArea labelSuggestion;
    // End of variables declaration//GEN-END:variables
}
