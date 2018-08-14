/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durokovic.ljetnizadatak.view;

import durokovic.ljetnizadatak.controller.EventController;
import durokovic.ljetnizadatak.model.Event;
import durokovic.ljetnizadatak.tablemodel.EventTableModel;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mata
 */
public class EventsForm extends javax.swing.JFrame {
    private EventController eventController;
    private int row;
    
    /**
     * Creates new form EventsForm
     */
    public EventsForm() {
        try {
            eventController = new EventController();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        initComponents();
        refreshEventView();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        clearSelectionLbl = new javax.swing.JLabel();
        fieldsPanel = new javax.swing.JPanel();
        nameLbl = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        formatLbl = new javax.swing.JLabel();
        formatField = new javax.swing.JTextField();
        cellNameLbl = new javax.swing.JLabel();
        cellNameField = new javax.swing.JTextField();
        rankLbl = new javax.swing.JLabel();
        rankField = new javax.swing.JTextField();
        infoLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Events");
        setResizable(false);

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
                .addGap(18, 18, 18)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addComponent(clearSelectionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(17, 17, 17)
                .addComponent(clearSelectionLbl))
        );

        nameLbl.setText("Name: ");

        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameFieldKeyTyped(evt);
            }
        });

        formatLbl.setText("Format: ");

        formatField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formatFieldKeyTyped(evt);
            }
        });

        cellNameLbl.setText("Cell Name: ");

        cellNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cellNameFieldKeyTyped(evt);
            }
        });

        rankLbl.setText("Rank: ");

        rankField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rankFieldKeyTyped(evt);
            }
        });

        infoLbl.setForeground(new java.awt.Color(255, 51, 51));
        infoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLbl.setBorder(javax.swing.BorderFactory.createTitledBorder("Info Panel"));

        javax.swing.GroupLayout fieldsPanelLayout = new javax.swing.GroupLayout(fieldsPanel);
        fieldsPanel.setLayout(fieldsPanelLayout);
        fieldsPanelLayout.setHorizontalGroup(
            fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fieldsPanelLayout.createSequentialGroup()
                        .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(formatLbl)
                            .addComponent(nameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formatField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(nameField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rankLbl)
                            .addComponent(cellNameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cellNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(rankField)))
                    .addComponent(infoLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        fieldsPanelLayout.setVerticalGroup(
            fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankLbl)
                    .addComponent(rankField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatLbl)
                    .addComponent(cellNameLbl)
                    .addComponent(cellNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        row = table.getSelectedRow();
        Event tempEvent = (Event) table.getValueAt(row, EventTableModel.OBJECT_COL);
        populateEventGui(tempEvent);
    }//GEN-LAST:event_tableMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            String name = nameField.getText();
            int rank = Integer.parseInt(rankField.getText());
            String format = formatField.getText();
            String cellName = cellNameField.getText();
            
            eventController.addEvent(name, rank, format, cellName);
            refreshEventView();
            clearEventFields();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        try {
            String name = nameField.getText();
            int rank = Integer.parseInt(rankField.getText());
            String format = formatField.getText();
            String cellName = cellNameField.getText();
            
            row = table.getSelectedRow();
            int id = (int) table.getValueAt(row, EventTableModel.ID_COL);
            
            eventController.updateEvent(id, name, rank, format, cellName);
            refreshEventView();
            table.setRowSelectionInterval(row, row);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"You need to select what to update!", "Info", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            row = table.getSelectedRow();
            int id = (int) table.getValueAt(row, EventTableModel.ID_COL);
            eventController.deleteEvent(id);
            refreshEventView();
            clearEventFields();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"You need to select what to delete!", "Info", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void clearSelectionLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearSelectionLblMouseClicked
        clearEventFields();
         table.clearSelection();
    }//GEN-LAST:event_clearSelectionLblMouseClicked

    private void nameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyTyped
        if(nameField.getText().length() > 49){
            infoLbl.setText("Limit is 50 characters!");
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nameFieldKeyTyped

    private void formatFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formatFieldKeyTyped
        char e = evt.getKeyChar();
        if(formatField.getText().length() > 9){
            infoLbl.setText("Limit is 10 characters!");
            getToolkit().beep();
            evt.consume();
        }
        
        
    }//GEN-LAST:event_formatFieldKeyTyped

    private void rankFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rankFieldKeyTyped
        char e = evt.getKeyChar();
        if(!(Character.isDigit(e))){
            infoLbl.setText("Numbers only!");
            getToolkit().beep();
            evt.consume();
        }
        
        if(rankField.getText().length() > 9){
            infoLbl.setText("Limit is 10 numbers!");
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_rankFieldKeyTyped

    private void cellNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cellNameFieldKeyTyped
        if(cellNameField.getText().length() > 49){
            infoLbl.setText("Limit is 50 characters!");
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_cellNameFieldKeyTyped

    private void addBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseEntered
        if(nameField.getText().trim().isEmpty() 
                || rankField.getText().trim().isEmpty()
                || formatField.getText().trim().isEmpty()
                || cellNameField.getText().trim().isEmpty()
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
                || rankField.getText().trim().isEmpty()
                || formatField.getText().trim().isEmpty()
                || cellNameField.getText().trim().isEmpty()
            ){
            updateBtn.setEnabled(false);
            infoLbl.setText("Fields can't be empty!");
        }
        
        if(row == -1){
            updateBtn.setEnabled(false);
            infoLbl.setText("Select what to update!");
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
    }//GEN-LAST:event_deleteBtnMouseEntered

    private void deleteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseExited
        deleteBtn.setEnabled(true);
    }//GEN-LAST:event_deleteBtnMouseExited

    //  HELPER METHODS
    private void refreshEventView(){
        try {
            List<Event> events = eventController.getAllEvents();
            EventTableModel model = new EventTableModel(events);
            table.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void clearEventFields(){
        for(Component components : fieldsPanel.getComponents()){
            if(components instanceof JTextField){
                ((JTextField) components).setText("");
            }
        }
        infoLbl.setText("");
    }
    
    public void populateEventGui(Event tempEvent){
        nameField.setText(tempEvent.getName());
        rankField.setText(tempEvent.toString(tempEvent.getRank()));
        formatField.setText(tempEvent.getFormat());
        cellNameField.setText(tempEvent.getCellName());
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
            java.util.logging.Logger.getLogger(EventsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JTextField cellNameField;
    private javax.swing.JLabel cellNameLbl;
    private javax.swing.JLabel clearSelectionLbl;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JPanel fieldsPanel;
    private javax.swing.JTextField formatField;
    private javax.swing.JLabel formatLbl;
    private javax.swing.JLabel infoLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField rankField;
    private javax.swing.JLabel rankLbl;
    private javax.swing.JTable table;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
