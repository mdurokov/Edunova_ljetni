/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durokovic.ljetnizadatak.view;

import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author Mata
 */
public class MainForm extends javax.swing.JFrame {
    private String url;
    /**
     * Creates new form MainApp
     */
    public MainForm() {
        initComponents();
        url = "https://github.com/mdurokov/Edunova_ljetni";
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        roundTypesBtn = new javax.swing.JButton();
        continentsBtn = new javax.swing.JButton();
        eventBtn = new javax.swing.JButton();
        formatsBtn = new javax.swing.JButton();
        eraBtn = new javax.swing.JButton();
        codeLinkLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WCA - World Cube Association");
        setResizable(false);

        mainPanel.setName(""); // NOI18N

        roundTypesBtn.setText("RoundTypes");
        roundTypesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundTypesBtnActionPerformed(evt);
            }
        });

        continentsBtn.setText("Continents");
        continentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continentsBtnActionPerformed(evt);
            }
        });

        eventBtn.setText("Events");
        eventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventBtnActionPerformed(evt);
            }
        });

        formatsBtn.setText("Formats");
        formatsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatsBtnActionPerformed(evt);
            }
        });

        eraBtn.setText("ERA Diagram");
        eraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraBtnActionPerformed(evt);
            }
        });

        codeLinkLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        codeLinkLbl.setText("Link To Code");
        codeLinkLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codeLinkLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formatsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eventBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(continentsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roundTypesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eraBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                            .addComponent(codeLinkLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(continentsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formatsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundTypesBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eraBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codeLinkLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codeLinkLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codeLinkLblMouseClicked
        openLink(url);
    }//GEN-LAST:event_codeLinkLblMouseClicked

    private void continentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continentsBtnActionPerformed
        ContinentsForm continentsForm = new ContinentsForm();
        continentsForm.setVisible(true);        
    }//GEN-LAST:event_continentsBtnActionPerformed

    private void eventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventBtnActionPerformed
        EventsForm eventForm = new EventsForm();
        eventForm.setVisible(true);
    }//GEN-LAST:event_eventBtnActionPerformed

    private void formatsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatsBtnActionPerformed
        FormatsForm formatsForm = new FormatsForm();
        formatsForm.setVisible(true);
    }//GEN-LAST:event_formatsBtnActionPerformed

    private void roundTypesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundTypesBtnActionPerformed
        RoundTypesForm roundTypesForm = new RoundTypesForm();
        roundTypesForm.setVisible(true);
    }//GEN-LAST:event_roundTypesBtnActionPerformed

    private void eraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraBtnActionPerformed
        EraForm eraForm = new EraForm();
        eraForm.setVisible(true);
    }//GEN-LAST:event_eraBtnActionPerformed

    private void openLink(String url){
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI open = new URI(url);
            desktop.browse(open);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codeLinkLbl;
    private javax.swing.JButton continentsBtn;
    private javax.swing.JButton eraBtn;
    private javax.swing.JButton eventBtn;
    private javax.swing.JButton formatsBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton roundTypesBtn;
    // End of variables declaration//GEN-END:variables
}
