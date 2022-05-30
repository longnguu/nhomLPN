/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Service.Service;
import Model.PC;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author minhl
 */
public class PhieuNhapThietBi extends javax.swing.JFrame {
    DefaultTableModel model;
    Service thietBiService;
    public PhieuNhapThietBi() {
        initComponents();
        model = new DefaultTableModel();
        tableTB26.setModel(model);
        model.addColumn("ID");
        model.addColumn("Tên");
        model.addColumn("Trạng thái");
        thietBiService = new Service();
        List<PC> pcs = new ArrayList<>();
        pcs = thietBiService.getAllPC1();
        for(PC pc: pcs)
            model.addRow(new Object[] { pc.getIdPC(),pc.getTenPC(),pc.getTthai()});
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1_26 = new javax.swing.JPanel();
        jPanel2_26 = new javax.swing.JPanel();
        jLabel1_26 = new javax.swing.JLabel();
        jPanel3_26 = new javax.swing.JPanel();
        jLabel2_26 = new javax.swing.JLabel();
        jLabel3_26 = new javax.swing.JLabel();
        idTF26 = new javax.swing.JTextField();
        tenTF_26 = new javax.swing.JTextField();
        insertTB26 = new javax.swing.JButton();
        refreshBT26 = new javax.swing.JButton();
        jPanel4_26 = new javax.swing.JPanel();
        jScrollPane1_26 = new javax.swing.JScrollPane();
        tableTB26 = new javax.swing.JTable();
        jPanel5_26 = new javax.swing.JPanel();
        deleteBT26 = new javax.swing.JButton();
        searchTF26 = new javax.swing.JTextField();
        jLabel4_26 = new javax.swing.JLabel();
        reportBT26 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1_26.setBackground(new java.awt.Color(51, 102, 255));

        jPanel2_26.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1_26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1_26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/computer.png"))); // NOI18N
        jLabel1_26.setText("PHIẾU NHẬP THIẾT BỊ");

        javax.swing.GroupLayout jPanel2_26Layout = new javax.swing.GroupLayout(jPanel2_26);
        jPanel2_26.setLayout(jPanel2_26Layout);
        jPanel2_26Layout.setHorizontalGroup(
            jPanel2_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_26Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel1_26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2_26Layout.setVerticalGroup(
            jPanel2_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_26)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel2_26.setText("ID thiết bị:");

        jLabel3_26.setText("Tên thiết bị:");

        insertTB26.setBackground(new java.awt.Color(51, 255, 51));
        insertTB26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/add.png"))); // NOI18N
        insertTB26.setText("Thêm");
        insertTB26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertTB26ActionPerformed(evt);
            }
        });

        refreshBT26.setBackground(new java.awt.Color(51, 153, 255));
        refreshBT26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/refresh.png"))); // NOI18N
        refreshBT26.setText("Tải lại");
        refreshBT26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBT26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3_26Layout = new javax.swing.GroupLayout(jPanel3_26);
        jPanel3_26.setLayout(jPanel3_26Layout);
        jPanel3_26Layout.setHorizontalGroup(
            jPanel3_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_26Layout.createSequentialGroup()
                .addGroup(jPanel3_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3_26Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3_26)
                            .addComponent(jLabel2_26))
                        .addGroup(jPanel3_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3_26Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(tenTF_26, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3_26Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(idTF26))))
                    .addGroup(jPanel3_26Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(insertTB26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshBT26)
                        .addGap(31, 31, 31)))
                .addGap(44, 44, 44))
        );
        jPanel3_26Layout.setVerticalGroup(
            jPanel3_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_26Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_26)
                    .addComponent(idTF26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3_26)
                    .addComponent(tenTF_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel3_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertTB26)
                    .addComponent(refreshBT26))
                .addGap(41, 41, 41))
        );

        tableTB26.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1_26.setViewportView(tableTB26);

        javax.swing.GroupLayout jPanel4_26Layout = new javax.swing.GroupLayout(jPanel4_26);
        jPanel4_26.setLayout(jPanel4_26Layout);
        jPanel4_26Layout.setHorizontalGroup(
            jPanel4_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1_26)
        );
        jPanel4_26Layout.setVerticalGroup(
            jPanel4_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1_26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        deleteBT26.setBackground(new java.awt.Color(255, 51, 51));
        deleteBT26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/delete.png"))); // NOI18N
        deleteBT26.setText("Xóa");
        deleteBT26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBT26ActionPerformed(evt);
            }
        });

        searchTF26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTF26KeyReleased(evt);
            }
        });

        jLabel4_26.setBackground(new java.awt.Color(51, 153, 255));
        jLabel4_26.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4_26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/search.png"))); // NOI18N

        reportBT26.setBackground(new java.awt.Color(51, 255, 51));
        reportBT26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fix.png"))); // NOI18N
        reportBT26.setText("Báo cáo");
        reportBT26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBT26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5_26Layout = new javax.swing.GroupLayout(jPanel5_26);
        jPanel5_26.setLayout(jPanel5_26Layout);
        jPanel5_26Layout.setHorizontalGroup(
            jPanel5_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5_26Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(deleteBT26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportBT26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4_26)
                .addGap(18, 18, 18)
                .addComponent(searchTF26, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel5_26Layout.setVerticalGroup(
            jPanel5_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5_26Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchTF26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4_26, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteBT26)
                        .addComponent(reportBT26)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1_26Layout = new javax.swing.GroupLayout(jPanel1_26);
        jPanel1_26.setLayout(jPanel1_26Layout);
        jPanel1_26Layout.setHorizontalGroup(
            jPanel1_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2_26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1_26Layout.createSequentialGroup()
                        .addComponent(jPanel3_26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4_26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5_26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1_26Layout.setVerticalGroup(
            jPanel1_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3_26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1_26Layout.createSequentialGroup()
                        .addComponent(jPanel5_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4_26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertTB26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertTB26ActionPerformed
        // TODO add your handling code here:
        PC pc = new PC();
        pc.setIdPC(idTF26.getText());
        pc.setTenPC(tenTF_26.getText());
        pc.setTthai("bt");
        thietBiService.addPC(pc);
        model.setRowCount(0);
        List<PC> pcs = new ArrayList<>();
        pcs = thietBiService.getAllPC1();
        for(PC pc1: pcs)
            model.addRow(new Object[] { pc1.getIdPC(),pc1.getTenPC(),pc1.getTthai()});
    }//GEN-LAST:event_insertTB26ActionPerformed

    private void refreshBT26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBT26ActionPerformed
        // TODO add your handling code here:
        idTF26.setText("");
        tenTF_26.setText("");
    }//GEN-LAST:event_refreshBT26ActionPerformed

    private void deleteBT26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBT26ActionPerformed
        // TODO add your handling code here:
        int row = tableTB26.getSelectedRow();
        if(row == -1)
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn đối tượng", "Lỗi", JOptionPane.ERROR_MESSAGE);
        else{
            String id = String.valueOf(tableTB26.getValueAt(row, 0));
            thietBiService.deletePC(id);
            model.setRowCount(0);
            List<PC> pcs = new ArrayList<>();
            pcs = thietBiService.getAllPC1();
            for(PC pc: pcs)
                model.addRow(new Object[] { pc.getIdPC(),pc.getTenPC(),pc.getTthai()});
        }
    }//GEN-LAST:event_deleteBT26ActionPerformed

    private void searchTF26KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTF26KeyReleased
        // TODO add your handling code here:
        List<PC> pcs = new ArrayList<>();
        model.setRowCount(0);
        pcs = thietBiService.searchPC(searchTF26.getText());
        for(PC pc: pcs)
            model.addRow(new Object[] { pc.getIdPC(),pc.getTenPC(),pc.getTthai()});
        
    }//GEN-LAST:event_searchTF26KeyReleased

    private void reportBT26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBT26ActionPerformed
        // TODO add your handling code here:
        int row = tableTB26.getSelectedRow();
        if(row == -1)
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn đối tượng", "Lỗi", JOptionPane.ERROR_MESSAGE);
        else{
            String id = String.valueOf(tableTB26.getValueAt(row, 0));
            PC thietBi = new PC();
            thietBi = thietBiService.getPCById(id);
            if(thietBi.getTthai().equals("bt"))
                thietBi.setTthai("hong");
            else
                thietBi.setTthai("bt");
            thietBiService.updatePC(thietBi);
            model.setRowCount(0);
            List<PC> pcs = new ArrayList<>();
            pcs = thietBiService.getAllPC1();
            for(PC pc: pcs)
                model.addRow(new Object[] { pc.getIdPC(),pc.getTenPC(),pc.getTthai()});
        }
    }//GEN-LAST:event_reportBT26ActionPerformed

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
            java.util.logging.Logger.getLogger(PhieuNhapThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhieuNhapThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhieuNhapThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieuNhapThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhieuNhapThietBi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBT26;
    private javax.swing.JTextField idTF26;
    private javax.swing.JButton insertTB26;
    private javax.swing.JLabel jLabel1_26;
    private javax.swing.JLabel jLabel2_26;
    private javax.swing.JLabel jLabel3_26;
    private javax.swing.JLabel jLabel4_26;
    private javax.swing.JPanel jPanel1_26;
    private javax.swing.JPanel jPanel2_26;
    private javax.swing.JPanel jPanel3_26;
    private javax.swing.JPanel jPanel4_26;
    private javax.swing.JPanel jPanel5_26;
    private javax.swing.JScrollPane jScrollPane1_26;
    private javax.swing.JButton refreshBT26;
    private javax.swing.JButton reportBT26;
    private javax.swing.JTextField searchTF26;
    private javax.swing.JTable tableTB26;
    private javax.swing.JTextField tenTF_26;
    // End of variables declaration//GEN-END:variables
}
