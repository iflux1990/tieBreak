/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.MemberManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author MikeZJ
 */
public class TBGUIMenu extends javax.swing.JFrame
{

    private MemberManager mm;

    /**
     * Creates new form TBGUI
     */
    public TBGUIMenu()
    {
        initComponents();
        try
        {
            mm = new MemberManager();
        }
        catch (Exception ex)
        {
//            JOptionPane.showMessageDialog(this, "Impossible to create member", "Error 38", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        updateTxtArea();

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

        btnCreate = new javax.swing.JButton();
        lblMemberList = new javax.swing.JLabel();
        btnShowAll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaShowAll = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCreate.setText("Create Member");
        btnCreate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCreateActionPerformed(evt);
            }
        });

        lblMemberList.setText("Member List");

        btnShowAll.setText("Show All");
        btnShowAll.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnShowAllActionPerformed(evt);
            }
        });

        txtAreaShowAll.setEditable(false);
        txtAreaShowAll.setColumns(20);
        txtAreaShowAll.setRows(5);
        jScrollPane1.setViewportView(txtAreaShowAll);

        jButton1.setText("Remove Member");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMemberList)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnShowAll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 354, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMemberList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnShowAll)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCreateActionPerformed
    {//GEN-HEADEREND:event_btnCreateActionPerformed
        new AddMember().setVisible(true);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnShowAllActionPerformed
    {//GEN-HEADEREND:event_btnShowAllActionPerformed
        updateTxtArea();


        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
       new RemoveMember().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(TBGUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TBGUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TBGUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TBGUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TBGUIMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMemberList;
    private javax.swing.JTextArea txtAreaShowAll;
    // End of variables declaration//GEN-END:variables

    private void updateTxtArea()
    {
        txtAreaShowAll.setText("");
        txtAreaShowAll.append(String.format("%-7s %-20s %-35s %-15s %-29s \n", "ID", "Name", "Address", "PhoneNr", "E-mail"));
        try
        {
            for (int i = 0; i < mm.showAll().size(); i++)
            {
                txtAreaShowAll.append(mm.showAll().get(i) + "\n");

            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, "Impossible to show members - " + ex.getMessage(), "Error 45", JOptionPane.ERROR_MESSAGE);
        }
    }
}
