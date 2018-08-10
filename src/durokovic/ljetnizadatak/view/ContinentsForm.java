/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durokovic.ljetnizadatak.view;

import durokovic.ljetnizadatak.contoller.ContinentController;
import durokovic.ljetnizadatak.model.Continent;
import durokovic.ljetnizadatak.tablemodel.ContinentTableModel;
import java.awt.Component;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author Mata
 */
public class ContinentsForm extends javax.swing.JFrame {
    private ContinentController continentController;
    private int row;

    //  CONSTRUCTORS
    public ContinentsForm() {
        try {
            continentController = new ContinentController();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        initComponents();
        //  showing list of continents
        refreshContinentsView();
    }
    //  END CONSTRUCTORS

    //  INITIALIZING COMPONENTS
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        buttonPanel = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        clearSelectionLbl = new javax.swing.JLabel();
        fieldsPanel = new javax.swing.JPanel();
        nameLbl = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        recordNameLbl = new javax.swing.JLabel();
        recordNameField = new javax.swing.JTextField();
        latitudeLbl = new javax.swing.JLabel();
        latitudeField = new javax.swing.JTextField();
        longitudeLbl = new javax.swing.JLabel();
        longitudeField = new javax.swing.JTextField();
        zoomLbl = new javax.swing.JLabel();
        zoomField = new javax.swing.JTextField();
        infoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Continents");
        setResizable(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        addBtn.setText("Add");
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBtnMouseExited(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateBtnMouseExited(evt);
            }
        });
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.setMaximumSize(new java.awt.Dimension(125, 23));
        deleteBtn.setMinimumSize(new java.awt.Dimension(125, 23));
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteBtnMouseExited(evt);
            }
        });
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        clearSelectionLbl.setText("Clear Selection");
        clearSelectionLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearSelectionLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearSelectionLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addComponent(clearSelectionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearSelectionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        nameLbl.setText("Name: ");

        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameFieldKeyTyped(evt);
            }
        });

        recordNameLbl.setText("Record Name: ");

        recordNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                recordNameFieldKeyTyped(evt);
            }
        });

        latitudeLbl.setText("Latidue: ");

        latitudeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                latitudeFieldKeyTyped(evt);
            }
        });

        longitudeLbl.setText("Longitude: ");

        longitudeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                longitudeFieldKeyTyped(evt);
            }
        });

        zoomLbl.setText("Zoom: ");

        zoomField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                zoomFieldKeyTyped(evt);
            }
        });

        infoLbl.setForeground(new java.awt.Color(255, 51, 51));
        infoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLbl.setBorder(javax.swing.BorderFactory.createTitledBorder("Info Panel"));

        javax.swing.GroupLayout fieldsPanelLayout = new javax.swing.GroupLayout(fieldsPanel);
        fieldsPanel.setLayout(fieldsPanelLayout);
        fieldsPanelLayout.setHorizontalGroup(
            fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fieldsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(infoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fieldsPanelLayout.createSequentialGroup()
                        .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recordNameLbl)
                            .addComponent(nameLbl)
                            .addComponent(latitudeLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameField)
                            .addComponent(latitudeField, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(recordNameField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(longitudeLbl)
                            .addComponent(zoomLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(zoomField, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(longitudeField))))
                .addContainerGap())
        );
        fieldsPanelLayout.setVerticalGroup(
            fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recordNameLbl)
                    .addComponent(recordNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zoomLbl)
                    .addComponent(zoomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(latitudeLbl)
                    .addComponent(latitudeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(longitudeLbl)
                    .addComponent(longitudeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        //  Getting selected continent form selected row
        row = table.getSelectedRow();
        //  Getting continent values
        Continent tempContinent = (Continent) table.getValueAt(row, ContinentTableModel.OBJECT_COL);
        //  Showing values in text fields
        populateContinentGui(tempContinent);
    }//GEN-LAST:event_tableMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            //  Getting values from text fields
            String name = nameField.getText();
            String recordName = recordNameField.getText();
            int latitude = Integer.parseInt(latitudeField.getText());
            int longitude = Integer.parseInt(longitudeField.getText());
            int zoom = Integer.parseInt(zoomField.getText());
            
            //  Adding continent to continents table
            continentController.addContinent(name, recordName, latitude, longitude, zoom);
            
            //  Showing new entry in table view
            refreshContinentsView();
            
            //  Clearing text fields;
            clearContinentFields();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"Error: latitude, longitude and zoom MUST be numbers!", "Not a number error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        try {
            //  Getting values from text fields
            if(nameField.getText().trim().isEmpty() || recordNameField.getText().trim().isEmpty()){
                throw new RuntimeException("adokoakm");
            }
            String name = nameField.getText();
            String recordName = recordNameField.getText();
            int latitude = Integer.parseInt(latitudeField.getText());
            int longitude = Integer.parseInt(longitudeField.getText());
            int zoom = Integer.parseInt(zoomField.getText());
            
            //  Getting selected continent form selected row 
            row = table.getSelectedRow();
            
            //  Getting id from selected continent
            int id = (int) table.getValueAt(row, ContinentTableModel.ID_COL);
            
            //  Updateing selected continent
            continentController.updateContinent(id, name, recordName, latitude, longitude, zoom);
            
            //  Showing updated entry in table view
            refreshContinentsView();
            
            //  Selecting updated continent
            table.setRowSelectionInterval(row, row);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this,"You need to select what to update!", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,"Error: SQL Error", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (RuntimeException e){
            JOptionPane.showMessageDialog(this,"Error: Name and Record Name can't be empty!", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            //  Getting id to erase from table continents
            row = table.getSelectedRow();
            int id = (int) table.getValueAt(row, ContinentTableModel.ID_COL);
            //  Deleting continent
            continentController.deleteContinent(id);
            //  Showing table view after change
            refreshContinentsView();
            //  Clearing text fields
            clearContinentFields();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"You need to select what to delete!", "Info", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void clearSelectionLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearSelectionLblMouseClicked
        //  Clearing text fields
        clearContinentFields();
        //  Clearing selected row
        table.clearSelection();
    }//GEN-LAST:event_clearSelectionLblMouseClicked

    private void zoomFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zoomFieldKeyTyped
        char e = evt.getKeyChar();
        if(!(Character.isDigit(e))){
            infoLbl.setText("Numbers only!");
            getToolkit().beep();
            evt.consume();
        }
        if(zoomField.getText().length() > 2){
            infoLbl.setText("Max number is 999");
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_zoomFieldKeyTyped

    private void addBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseEntered
        if(nameField.getText().trim().isEmpty() 
                || recordNameField.getText().trim().isEmpty()
                || latitudeField.getText().trim().isEmpty()
                || longitudeField.getText().trim().isEmpty()
                || zoomField.getText().trim().isEmpty()
            ){
            addBtn.setEnabled(false);
            infoLbl.setText("Fields can't be empty!");
        }
    }//GEN-LAST:event_addBtnMouseEntered

    private void addBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseExited
        addBtn.setEnabled(true);
    }//GEN-LAST:event_addBtnMouseExited

    private void updateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseEntered
        row = table.getSelectedRow();
        if(nameField.getText().trim().isEmpty() 
                || recordNameField.getText().trim().isEmpty()
                || latitudeField.getText().trim().isEmpty()
                || longitudeField.getText().trim().isEmpty()
                || zoomField.getText().trim().isEmpty()
            ){
            updateBtn.setEnabled(false);
            infoLbl.setText("Fields can't be empty!");
        }
        
        if(row == -1){
            updateBtn.setEnabled(false);
            infoLbl.setText("Select what to update!");
        }
        
        if(row > -1){
            updateBtn.setEnabled(true);
            infoLbl.setText("");
        }
    }//GEN-LAST:event_updateBtnMouseEntered

    private void updateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseExited
        updateBtn.setEnabled(true);
    }//GEN-LAST:event_updateBtnMouseExited

    private void deleteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseEntered
        row = table.getSelectedRow();
        if(row==-1){
            deleteBtn.setEnabled(false);
            infoLbl.setText("Select what to delete!");
        }
        if(row > -1){
            deleteBtn.setEnabled(true);
            infoLbl.setText("");
        }
    }//GEN-LAST:event_deleteBtnMouseEntered

    private void deleteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseExited
        deleteBtn.setEnabled(true);
    }//GEN-LAST:event_deleteBtnMouseExited

    private void latitudeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_latitudeFieldKeyTyped
        char e = evt.getKeyChar();
        if(!(Character.isDigit(e))){
            infoLbl.setText("Numbers only!");
            getToolkit().beep();
            evt.consume();
        }
        if(latitudeField.getText().length() > 8){
            infoLbl.setText("You can't input more than 9 numbers!");
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_latitudeFieldKeyTyped

    private void longitudeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_longitudeFieldKeyTyped
        char e = evt.getKeyChar();
        if(!(Character.isDigit(e))){
            infoLbl.setText("Numbers only!");
            getToolkit().beep();
            evt.consume();
        }
        if(latitudeField.getText().length() > 8){
            infoLbl.setText("You can't input more than 9 numbers!");
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_longitudeFieldKeyTyped

    private void nameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyTyped
        if(nameField.getText().length() > 49){
            infoLbl.setText("Limit is 50 characters!");
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nameFieldKeyTyped

    private void recordNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recordNameFieldKeyTyped
        char e = evt.getKeyChar();
                
        if(nameField.getText().length() > 2){
            infoLbl.setText("Limit is 3 characters!");
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_recordNameFieldKeyTyped

    
    //  HELPER METHODS
    //  -Showing data in table view afrer change
    private void refreshContinentsView(){
        try {
            List<Continent> continents = continentController.getAllContinents();
            ContinentTableModel model = new ContinentTableModel(continents);
            table.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //  -Clearing text fields
    private void clearContinentFields(){
        for (Component components : fieldsPanel.getComponents()) {
            if (components instanceof JTextField) {
                ((JTextField) components).setText("");
            }
        }
        infoLbl.setText("");
    }
    
    //  -Showing data in text fields
    private void populateContinentGui(Continent tempContinent) {
        nameField.setText(tempContinent.getName());
        recordNameField.setText(tempContinent.getRecordName());
        longitudeField.setText(tempContinent.toString(tempContinent.getLongitude()));
        latitudeField.setText(tempContinent.toString(tempContinent.getLatitude()));
        zoomField.setText(tempContinent.toString(tempContinent.getZoom()));
    }
    //  END HELPER METHODS
    
    
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
            java.util.logging.Logger.getLogger(ContinentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContinentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContinentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContinentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContinentsForm().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel clearSelectionLbl;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JPanel fieldsPanel;
    private javax.swing.JLabel infoLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField latitudeField;
    private javax.swing.JLabel latitudeLbl;
    private javax.swing.JTextField longitudeField;
    private javax.swing.JLabel longitudeLbl;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField recordNameField;
    private javax.swing.JLabel recordNameLbl;
    private javax.swing.JTable table;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField zoomField;
    private javax.swing.JLabel zoomLbl;
    // End of variables declaration//GEN-END:variables
}
