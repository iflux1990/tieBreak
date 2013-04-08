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
    private MemberTableModel memberModel;

    /**
     * Creates new form TBGUI
     */
    public TBGUIMenu()
    {
        initComponents();

        try
        {
            mm = new MemberManager();
            mm.setNewSeason();
            memberModel = new MemberTableModel(mm.showAll());
            tblShowAll.setModel(memberModel);
            
        }
        catch (Exception ex)
        {
//            JOptionPane.showMessageDialog(this, "Impossible to create member", "Error 38", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
//        updateTxtArea();

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

        jFrame1 = new javax.swing.JFrame();
        btnCreate = new javax.swing.JButton();
        lblMemberList = new javax.swing.JLabel();
        btnShowAll = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnUpdateCon = new javax.swing.JButton();
        btnUpdateMem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblShowAll = new javax.swing.JTable();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");

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

        btnRemove.setText("Remove Member");
        btnRemove.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRemoveActionPerformed(evt);
            }
        });

        btnUpdateCon.setText("Update Contigent");
        btnUpdateCon.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUpdateConActionPerformed(evt);
            }
        });

        btnUpdateMem.setText("Update Member");
        btnUpdateMem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUpdateMemActionPerformed(evt);
            }
        });

        tblShowAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {

            }
        ));
        jScrollPane2.setViewportView(tblShowAll);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMemberList)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnShowAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateMem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMemberList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(btnUpdateCon)
                    .addComponent(btnCreate)
                    .addComponent(btnShowAll)
                    .addComponent(btnUpdateMem))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCreateActionPerformed
    {//GEN-HEADEREND:event_btnCreateActionPerformed
        new AddMember().setVisible(true);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnShowAllActionPerformed
    {//GEN-HEADEREND:event_btnShowAllActionPerformed
        try
        {
            memberModel.setCollection(mm.showAll());
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRemoveActionPerformed
    {//GEN-HEADEREND:event_btnRemoveActionPerformed
       new RemoveMember().setVisible(true);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnUpdateConActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUpdateConActionPerformed
    {//GEN-HEADEREND:event_btnUpdateConActionPerformed
        new UpdateContigent().setVisible(true);
    }//GEN-LAST:event_btnUpdateConActionPerformed

    private void btnUpdateMemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUpdateMemActionPerformed
    {//GEN-HEADEREND:event_btnUpdateMemActionPerformed
         new UpdateMember().setVisible(true);
    }//GEN-LAST:event_btnUpdateMemActionPerformed

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
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton btnUpdateCon;
    private javax.swing.JButton btnUpdateMem;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMemberList;
    private javax.swing.JTable tblShowAll;
    // End of variables declaration//GEN-END:variables


}
