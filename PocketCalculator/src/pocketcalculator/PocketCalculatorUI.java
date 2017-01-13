/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

/**
 *This is going to be the primary output for the calculator class
 * 
 * @author Calibash
 */
public class PocketCalculatorUI extends javax.swing.JFrame {

    /**
     * Creates new form PocketCalculatorGUI
     */
    public PocketCalculatorUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        numberKeys = new javax.swing.ButtonGroup();
        jButtonNumeric1 = new javax.swing.JButton();
        jButtonNumeric2 = new javax.swing.JButton();
        jButtonNumeric3 = new javax.swing.JButton();
        jButtonNumeric4 = new javax.swing.JButton();
        jButtonNumeric5 = new javax.swing.JButton();
        jButtonNumeric6 = new javax.swing.JButton();
        jButtonNumeric7 = new javax.swing.JButton();
        jButtonNumeric8 = new javax.swing.JButton();
        jButtonNumeric9 = new javax.swing.JButton();
        jButtonNumeric0 = new javax.swing.JButton();
        jButtonDecimal = new javax.swing.JButton();
        jButtonMinusSign = new javax.swing.JButton();
        jButtonPlusSign = new javax.swing.JButton();
        jButtonMultiplicationSign = new javax.swing.JButton();
        jButtonDivisionSign = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButtonClear = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();
        jButtonSignChange = new javax.swing.JButton();
        jButtonBackSpace = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonNumeric1.setText("1");
        jButtonNumeric1.setActionCommand("");
        numberKeys.add(jButtonNumeric1);
        jButtonNumeric1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumeric1ActionPerformed(evt);
            }
        });

        jButtonNumeric2.setText("2");
        jButtonNumeric2.setActionCommand("");
        numberKeys.add(jButtonNumeric2);

        jButtonNumeric3.setText("3");
        jButtonNumeric3.setActionCommand("");
        numberKeys.add(jButtonNumeric3);

        jButtonNumeric4.setText("4");
        jButtonNumeric4.setActionCommand("");
        numberKeys.add(jButtonNumeric4);

        jButtonNumeric5.setText("5");
        jButtonNumeric5.setActionCommand("");
        numberKeys.add(jButtonNumeric5);

        jButtonNumeric6.setText("6");
        jButtonNumeric6.setActionCommand("");
        numberKeys.add(jButtonNumeric6);

        jButtonNumeric7.setText("7");
        jButtonNumeric7.setActionCommand("");
        numberKeys.add(jButtonNumeric7);

        jButtonNumeric8.setText("8");
        jButtonNumeric8.setActionCommand("");
        numberKeys.add(jButtonNumeric8);

        jButtonNumeric9.setText("9");
        jButtonNumeric9.setActionCommand("");
        numberKeys.add(jButtonNumeric9);

        jButtonNumeric0.setText("0");
        jButtonNumeric0.setActionCommand("");
        numberKeys.add(jButtonNumeric0);

        jButtonDecimal.setText(".");

        jButtonMinusSign.setText("-");

        jButtonPlusSign.setText("+");

        jButtonMultiplicationSign.setText("*");

        jButtonDivisionSign.setText("/");

        jButtonClear.setText("C");

        jButtonEquals.setText("=");

        jButtonSignChange.setText("±");

        jButtonBackSpace.setText("←");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSignChange))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonNumeric7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonNumeric8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonNumeric9))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonNumeric4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonNumeric5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonNumeric6))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButtonNumeric1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButtonNumeric2))
                                        .addComponent(jButtonNumeric0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonNumeric3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonPlusSign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonMinusSign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonMultiplicationSign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonDivisionSign, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonEquals)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumeric7)
                    .addComponent(jButtonNumeric8)
                    .addComponent(jButtonNumeric9)
                    .addComponent(jButtonMinusSign))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumeric4)
                    .addComponent(jButtonNumeric5)
                    .addComponent(jButtonNumeric6)
                    .addComponent(jButtonPlusSign))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumeric1)
                    .addComponent(jButtonNumeric2)
                    .addComponent(jButtonNumeric3)
                    .addComponent(jButtonMultiplicationSign))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumeric0)
                    .addComponent(jButtonDecimal)
                    .addComponent(jButtonDivisionSign))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonEquals)
                    .addComponent(jButtonSignChange)
                    .addComponent(jButtonBackSpace))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNumeric1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumeric1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNumeric1ActionPerformed

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
        } catch (ClassNotFoundException | 
                InstantiationException | 
                IllegalAccessException | 
                javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(
                    PocketCalculatorUI.class.getName()).log(
                            java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PocketCalculatorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButtonBackSpace;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDecimal;
    private javax.swing.JButton jButtonDivisionSign;
    private javax.swing.JButton jButtonEquals;
    private javax.swing.JButton jButtonMinusSign;
    private javax.swing.JButton jButtonMultiplicationSign;
    private javax.swing.JButton jButtonNumeric0;
    private javax.swing.JButton jButtonNumeric1;
    private javax.swing.JButton jButtonNumeric2;
    private javax.swing.JButton jButtonNumeric3;
    private javax.swing.JButton jButtonNumeric4;
    private javax.swing.JButton jButtonNumeric5;
    private javax.swing.JButton jButtonNumeric6;
    private javax.swing.JButton jButtonNumeric7;
    private javax.swing.JButton jButtonNumeric8;
    private javax.swing.JButton jButtonNumeric9;
    private javax.swing.JButton jButtonPlusSign;
    private javax.swing.JButton jButtonSignChange;
    private javax.swing.JTextField jTextField1;
    private javax.swing.ButtonGroup numberKeys;
    // End of variables declaration//GEN-END:variables
}
