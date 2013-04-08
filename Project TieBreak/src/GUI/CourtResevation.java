/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author MikeZJ
 */
public class CourtResevation extends javax.swing.JFrame
{

    /**
     * Creates new form CourtResevation
     */
    public CourtResevation()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        chkCourt1 = new javax.swing.JCheckBox();
        chkCourt2 = new javax.swing.JCheckBox();
        chkCourt3 = new javax.swing.JCheckBox();
        lblChoose = new javax.swing.JLabel();
        txtChoose = new javax.swing.JTextField();
        lblAvailable = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        rbtn0709 = new javax.swing.JRadioButton();
        rbtn0911 = new javax.swing.JRadioButton();
        rbtn1113 = new javax.swing.JRadioButton();
        rbtn1517 = new javax.swing.JRadioButton();
        rbtn1719 = new javax.swing.JRadioButton();
        rbtn1315 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblID.setText("ID of member:");

        chkCourt1.setText("Court 1");

        chkCourt2.setText("Court 2");

        chkCourt3.setText("Court 3");

        lblChoose.setText("Choose available court:");

        lblAvailable.setText("Available courts:");

        lblDate.setText("Desired date:");

        rbtn0709.setText("07:00-09:00");

        rbtn0911.setText("09:00-11:00");

        rbtn1113.setText("11:00-13:00");
        rbtn1113.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbtn1113ActionPerformed(evt);
            }
        });

        rbtn1517.setText("15:00-17:00");

        rbtn1719.setText("17:00-19:00");

        rbtn1315.setText("13:00-15:00");
        rbtn1315.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbtn1315ActionPerformed(evt);
            }
        });

        jRadioButton8.setText("21:00-22:00");

        jRadioButton10.setText("19:00-21:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblChoose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtChoose))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addComponent(lblDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chkCourt3)
                            .addComponent(chkCourt2)
                            .addComponent(chkCourt1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtn1315)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtn1113)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtn0911)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtn1719))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtn0709)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtn1517))
                            .addComponent(txtID)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblAvailable))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtn0709)
                            .addComponent(rbtn1517))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtn0911)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtn1113)
                            .addComponent(jRadioButton10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(rbtn1719)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn1315)
                    .addComponent(jRadioButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAvailable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkCourt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkCourt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkCourt3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChoose)
                    .addComponent(txtChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn1315ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbtn1315ActionPerformed
    {//GEN-HEADEREND:event_rbtn1315ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn1315ActionPerformed

    private void rbtn1113ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbtn1113ActionPerformed
    {//GEN-HEADEREND:event_rbtn1113ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn1113ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(CourtResevation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(CourtResevation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(CourtResevation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(CourtResevation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new CourtResevation().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkCourt1;
    private javax.swing.JCheckBox chkCourt2;
    private javax.swing.JCheckBox chkCourt3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblChoose;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblID;
    private javax.swing.JRadioButton rbtn0709;
    private javax.swing.JRadioButton rbtn0911;
    private javax.swing.JRadioButton rbtn1113;
    private javax.swing.JRadioButton rbtn1315;
    private javax.swing.JRadioButton rbtn1517;
    private javax.swing.JRadioButton rbtn1719;
    private javax.swing.JTextField txtChoose;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}