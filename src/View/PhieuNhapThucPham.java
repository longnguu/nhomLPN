package View;

import User.ThucPham;
import Service.Service;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author minhl
 */
public class PhieuNhapThucPham extends javax.swing.JFrame {
    DefaultTableModel model;
    Service userService;
    public PhieuNhapThucPham() {
        initComponents();
        model = new DefaultTableModel();
        tableTP26.setModel(model);
        model.addColumn("ID");
        model.addColumn("Tên");
        model.addColumn("Giá");
        model.addColumn("Số lượng");
        userService = new Service();
        List<ThucPham> thucPhams = new ArrayList<>();
        thucPhams = userService.getAllThucPham();
        for(ThucPham tp : thucPhams)
            model.addRow(new Object[] { tp.getId(),tp.getTen(),tp.getGia(),tp.getSoLuong()});
        idTF26.setEditable(false);
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
        jLabel4_26 = new javax.swing.JLabel();
        jLabel5_26 = new javax.swing.JLabel();
        idTF26 = new javax.swing.JTextField();
        tenTF26 = new javax.swing.JTextField();
        giaTF26 = new javax.swing.JTextField();
        soLuongTF26 = new javax.swing.JTextField();
        insertBT26 = new javax.swing.JButton();
        refreshBT26 = new javax.swing.JButton();
        jPanel4_26 = new javax.swing.JPanel();
        deleteBT26 = new javax.swing.JButton();
        editBT26 = new javax.swing.JButton();
        searchTF26 = new javax.swing.JTextField();
        searchBT26 = new javax.swing.JButton();
        jPanel5_26 = new javax.swing.JPanel();
        jScrollPane1_26 = new javax.swing.JScrollPane();
        tableTP26 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1_26.setBackground(new java.awt.Color(51, 153, 255));

        jPanel2_26.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1_26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1_26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_26.setText("PHIẾU NHẬP THỰC PHẨM");

        javax.swing.GroupLayout jPanel2_26Layout = new javax.swing.GroupLayout(jPanel2_26);
        jPanel2_26.setLayout(jPanel2_26Layout);
        jPanel2_26Layout.setHorizontalGroup(
            jPanel2_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2_26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1_26)
                .addGap(223, 223, 223))
        );
        jPanel2_26Layout.setVerticalGroup(
            jPanel2_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3_26.setBorder(javax.swing.BorderFactory.createTitledBorder("Thêm thực phẩm"));

        jLabel2_26.setText("ID Thực phẩm");

        jLabel3_26.setText("Tên thực phẩm");

        jLabel4_26.setText("Giá");

        jLabel5_26.setText("Số lương nhập");

        insertBT26.setBackground(new java.awt.Color(51, 255, 51));
        insertBT26.setText("Thêm");
        insertBT26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBT26ActionPerformed(evt);
            }
        });

        refreshBT26.setBackground(new java.awt.Color(51, 153, 255));
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
                            .addComponent(jLabel2_26)
                            .addComponent(jLabel3_26)
                            .addComponent(jLabel4_26)
                            .addComponent(jLabel5_26))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(soLuongTF26, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(giaTF26)
                            .addComponent(tenTF26)
                            .addComponent(idTF26)))
                    .addGroup(jPanel3_26Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(insertBT26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshBT26)
                        .addGap(52, 52, 52)))
                .addGap(35, 35, 35))
        );
        jPanel3_26Layout.setVerticalGroup(
            jPanel3_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_26Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_26)
                    .addComponent(idTF26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3_26)
                    .addComponent(tenTF26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4_26)
                    .addComponent(giaTF26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5_26)
                    .addComponent(soLuongTF26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel3_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertBT26)
                    .addComponent(refreshBT26))
                .addGap(35, 35, 35))
        );

        deleteBT26.setBackground(new java.awt.Color(255, 51, 51));
        deleteBT26.setText("Xóa");
        deleteBT26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBT26ActionPerformed(evt);
            }
        });

        editBT26.setBackground(new java.awt.Color(51, 255, 51));
        editBT26.setText("Sửa");
        editBT26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBT26ActionPerformed(evt);
            }
        });

        searchBT26.setBackground(new java.awt.Color(51, 153, 255));
        searchBT26.setText("Tìm");
        searchBT26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBT26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4_26Layout = new javax.swing.GroupLayout(jPanel4_26);
        jPanel4_26.setLayout(jPanel4_26Layout);
        jPanel4_26Layout.setHorizontalGroup(
            jPanel4_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteBT26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBT26, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchTF26, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBT26)
                .addContainerGap())
        );
        jPanel4_26Layout.setVerticalGroup(
            jPanel4_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_26Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBT26)
                    .addComponent(editBT26)
                    .addComponent(searchTF26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBT26))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jScrollPane1_26.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách thực phẩm"));

        tableTP26.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1_26.setViewportView(tableTP26);

        javax.swing.GroupLayout jPanel5_26Layout = new javax.swing.GroupLayout(jPanel5_26);
        jPanel5_26.setLayout(jPanel5_26Layout);
        jPanel5_26Layout.setHorizontalGroup(
            jPanel5_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1_26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel5_26Layout.setVerticalGroup(
            jPanel5_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1_26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                        .addComponent(jPanel3_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addGroup(jPanel1_26Layout.createSequentialGroup()
                        .addComponent(jPanel4_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5_26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3_26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBT26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBT26ActionPerformed
        if(searchTF26.getText().equals("")){
            List<ThucPham> thucPhams = new ArrayList<>();
            thucPhams = userService.getAllThucPham();
            model.setRowCount(0);
            for(ThucPham tp : thucPhams)
                model.addRow(new Object[]{tp.getId(),tp.getTen(),tp.getGia(),tp.getSoLuong()});
        }
        else{
            List<ThucPham> thucPhams = new ArrayList<>();
            thucPhams = userService.searchThucPham(searchTF26.getText());
            model.setRowCount(0);
            for(ThucPham tp : thucPhams)
                model.addRow(new Object[]{tp.getId(),tp.getTen(),tp.getGia(),tp.getSoLuong()});
        }
        
    }//GEN-LAST:event_searchBT26ActionPerformed

    private void deleteBT26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBT26ActionPerformed
        // TODO add your handling code here:
        int row = tableTP26.getSelectedRow();
        if(row == -1)
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn đối tượng", "Lỗi", JOptionPane.ERROR_MESSAGE);
        else{
            int id = Integer.parseInt(String.valueOf(tableTP26.getValueAt(row, 0)));
            userService.deleteThucPham(id);
            model.setRowCount(0);
            List<ThucPham> thucPhams = new ArrayList<>();
            thucPhams = userService.getAllThucPham();
            for(ThucPham tp : thucPhams)
                model.addRow(new Object[]{tp.getId(),tp.getTen(),tp.getGia(),tp.getSoLuong()});
        }
    }//GEN-LAST:event_deleteBT26ActionPerformed

    private void refreshBT26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBT26ActionPerformed
        // TODO add your handling code here:
        idTF26.setText("");
        tenTF26.setText("");
        giaTF26.setText("");
        soLuongTF26.setText("");
    }//GEN-LAST:event_refreshBT26ActionPerformed

    private void insertBT26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBT26ActionPerformed
        // TODO add your handling code here:
        ThucPham thucPham = new ThucPham();
        thucPham.setTen(tenTF26.getText());
        thucPham.setGia(Long.parseLong(giaTF26.getText()));
        thucPham.setSoLuong(Integer.parseInt(soLuongTF26.getText()));
        if(idTF26.getText().equals(""))
            userService.addThucPham(thucPham);
        else{
            thucPham.setId(Integer.parseInt(idTF26.getText()));
            userService.updateThucPham(thucPham);
        }
        model.setRowCount(0);
        List<ThucPham> thucPhams = new ArrayList<>();
        thucPhams = userService.getAllThucPham();
        for(ThucPham tp: thucPhams)
            model.addRow(new Object[]{tp.getId(),tp.getTen(),tp.getGia(),tp.getSoLuong()});
    }//GEN-LAST:event_insertBT26ActionPerformed

    private void editBT26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBT26ActionPerformed
        // TODO add your handling code here:
        int row = tableTP26.getSelectedRow();
        if(row == -1)
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn đối tượng", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        else{
            int id = Integer.parseInt(String.valueOf(tableTP26.getValueAt(row, 0)));
            ThucPham tp = new ThucPham();
            tp = userService.getThucPhamById(id);
            idTF26.setText(String.valueOf(tp.getId()));
            tenTF26.setText(String.valueOf(tp.getTen()));
            giaTF26.setText(String.valueOf(tp.getGia()));
            soLuongTF26.setText(String.valueOf(tp.getSoLuong()));
        }
    }//GEN-LAST:event_editBT26ActionPerformed

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
            java.util.logging.Logger.getLogger(PhieuNhapThucPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhieuNhapThucPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhieuNhapThucPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieuNhapThucPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhieuNhapThucPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBT26;
    private javax.swing.JButton editBT26;
    private javax.swing.JTextField giaTF26;
    private javax.swing.JTextField idTF26;
    private javax.swing.JButton insertBT26;
    private javax.swing.JLabel jLabel1_26;
    private javax.swing.JLabel jLabel2_26;
    private javax.swing.JLabel jLabel3_26;
    private javax.swing.JLabel jLabel4_26;
    private javax.swing.JLabel jLabel5_26;
    private javax.swing.JPanel jPanel1_26;
    private javax.swing.JPanel jPanel2_26;
    private javax.swing.JPanel jPanel3_26;
    private javax.swing.JPanel jPanel4_26;
    private javax.swing.JPanel jPanel5_26;
    private javax.swing.JScrollPane jScrollPane1_26;
    private javax.swing.JButton refreshBT26;
    private javax.swing.JButton searchBT26;
    private javax.swing.JTextField searchTF26;
    private javax.swing.JTextField soLuongTF26;
    private javax.swing.JTable tableTP26;
    private javax.swing.JTextField tenTF26;
    // End of variables declaration//GEN-END:variables
}
