/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package superpos;

import java.awt.print.PrinterException;
import javax.swing.table.TableModel;

/**
 *
 * @author Stephen
 */
public class print extends javax.swing.JFrame {

    /**
     * Creates new form print
     */
    public print() {
        initComponents();
    }
    
    String lsub;
    String lpay;
    String lbal;
    
    public print(String sub,String pay,String bal,TableModel tableModel) throws PrinterException {
        initComponents();
        
        this.lsub = sub;
        this.lpay = pay;
        this.lbal = bal;
        
        
        txtprint.setText(txtprint.getText()+ "***************************************\n");
        txtprint.setText(txtprint.getText()+ "**********cakes By Brenda**************\n");
        txtprint.setText(txtprint.getText()+ "\n");
        txtprint.setText(txtprint.getText()+ "Product"+"\t"+"Price"+"\t"+"Total"+"\n");
        
        for(int i=0; i<tableModel.getRowCount();i++)
        {
            String product = (String) tableModel.getValueAt(i, 1);
            String price = (String) tableModel.getValueAt(i, 2);
            int total = (int) tableModel.getValueAt(i, 4);
            
            txtprint.setText(txtprint.getText()+ product+"\t"+price+"\t"+total);
        }
        txtprint.setText(txtprint.getText()+ "\n");
        txtprint.setText(txtprint.getText()+ "\n");
        
        
        
        txtprint.setText(txtprint.getText()+ "       "   + "SubTotal : "  + sub +      "\n");
        txtprint.setText(txtprint.getText()+ "       "   + "Pay : "       + pay +      "\n");
        txtprint.setText(txtprint.getText()+ "       "   + "Balance : "  +  bal +      "\n");
        
        txtprint.setText(txtprint.getText()+ "*****************************************\n");
        txtprint.setText(txtprint.getText()+ "*****************************************\n");
        txtprint.setText(txtprint.getText()+ "Thank you come again.....................\n");

        txtprint.print();
        
        
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtprint = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(411, 355));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(411, 355));

        txtprint.setColumns(20);
        txtprint.setRows(5);
        txtprint.setPreferredSize(new java.awt.Dimension(411, 355));
        jScrollPane1.setViewportView(txtprint);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new print().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtprint;
    // End of variables declaration//GEN-END:variables
}
