/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import User.May;
import User.User;
import UserService.UserService;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MY LAPTOP
 */
public class KhachHang extends javax.swing.JPanel {

    /**
     * Creates new form KhachHang
     */
    UserService userService;
    User user,user1;
    DefaultTableModel defaultTableModel,defaultTableModel1,defaultTableModel2;
    public KhachHang() {
        initComponents();
        userService = new UserService();
         defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        mayTable.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("ID máy");
        defaultTableModel.addColumn("ID khách");
        defaultTableModel.addColumn("Tên khách");
        defaultTableModel.addColumn("Thời gian bắt đầu thuê");
        defaultTableModel.addColumn("Đơn giá thuê");
        
        jComboBox2.removeAllItems();
        jComboBox1.removeAllItems();
        for (int i = 1;i<=9;i++)
        {
            jComboBox1.addItem("May"+i);
        }
        
        List<May> mayss = userService.getAllMay();
        for (May may: mayss){
            jComboBox1.removeItem(String.valueOf(may.getIdMay()));
        }
        List<User> users = userService.getAllUser();
        for (User user: users){
            jComboBox2.addItem(String.valueOf(user.getId()));
        }
        defaultTableModel.setRowCount(0);
        List<May> mays = userService.getAllMay();
        for (May may1: mays){
            defaultTableModel.addRow(new Object[]{ may1.getIdMay(),may1.getIdKhach(),may1.getTenKhach(),may1.getBD(),may1.getDonGia()});
            String tm = may1.getIdMay();
            switch (tm){
                case "May1":
                    May1.setBackground(Color.red);
                    break;
                case "May2":
                    May2.setBackground(Color.red);
                    break;
                case "May3":
                    May3.setBackground(Color.red);
                    break;
                case "May4":
                    May4.setBackground(Color.red);
                    break;
                case "May5":
                    May5.setBackground(Color.red);
                    break;
                case "May6":
                    May6.setBackground(Color.red);
                    break;
                case "May7":
                    May7.setBackground(Color.red);
                    break;
                case "May8":
                    May8.setBackground(Color.red);
                    break;
                case "May9":
                    May9.setBackground(Color.red);
                    break;
                default:
                    break;
            }
        }
        
    }
    
    public KhachHang(User user1) {
        initComponents();
        this.user1=user1;
        userService = new UserService();
         defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        mayTable.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("ID máy");
        defaultTableModel.addColumn("ID khách");
        defaultTableModel.addColumn("Tên khách");
        defaultTableModel.addColumn("Thời gian bắt đầu thuê");
        defaultTableModel.addColumn("Đơn giá thuê");
        
        jComboBox2.removeAllItems();
        List<May> mayss = userService.getAllMay();
        for (May may: mayss){
            jComboBox1.removeItem(String.valueOf(may.getIdMay()));
        }
            jComboBox2.addItem(String.valueOf(user1.getId()));
        defaultTableModel.setRowCount(0);
        List<May> mays = userService.getAllMayByIdKH(user1.getId());
        List<May> mays1 = userService.getAllMay();
        for (May may1: mays1){
            String tm = may1.getIdMay();
            switch (tm){
                case "May1":
                    May1.setBackground(Color.red);
                    break;
                case "May2":
                    May2.setBackground(Color.red);
                    break;
                case "May3":
                    May3.setBackground(Color.red);
                    break;
                case "May4":
                    May4.setBackground(Color.red);
                    break;
                case "May5":
                    May5.setBackground(Color.red);
                    break;
                case "May6":
                    May6.setBackground(Color.red);
                    break;
                case "May7":
                    May7.setBackground(Color.red);
                    break;
                case "May8":
                    May8.setBackground(Color.red);
                    break;
                case "May9":
                    May9.setBackground(Color.red);
                    break;
                default:
                    break;
            }
        }
        for (May may1: mays){
            defaultTableModel.addRow(new Object[]{ may1.getIdMay(),may1.getIdKhach(),may1.getTenKhach(),may1.getBD(),may1.getDonGia()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        May1 = new javax.swing.JButton();
        May2 = new javax.swing.JButton();
        May3 = new javax.swing.JButton();
        May4 = new javax.swing.JButton();
        May5 = new javax.swing.JButton();
        May6 = new javax.swing.JButton();
        May7 = new javax.swing.JButton();
        May8 = new javax.swing.JButton();
        May9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mayTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()), "Sơ đồ"));

        jPanel5.setLayout(new java.awt.GridLayout(3, 4, 10, 10));

        May1.setText("Máy 1");
        jPanel5.add(May1);

        May2.setText("Máy 2");
        jPanel5.add(May2);

        May3.setText("Máy 3");
        jPanel5.add(May3);

        May4.setText("Máy 4");
        jPanel5.add(May4);

        May5.setText("Máy 5");
        jPanel5.add(May5);

        May6.setText("Máy 6");
        jPanel5.add(May6);

        May7.setText("Máy 7");
        jPanel5.add(May7);

        May8.setText("Máy 8");
        jPanel5.add(May8);

        May9.setText("Máy 9");
        jPanel5.add(May9);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
        );

        jButton10.setText("Thuê máy");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel2.setText("ID khách hàng");

        jLabel3.setText("ID máy");

        jButton1.setText("Gọi đồ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Tên khách hàng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, 123, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        mayTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(mayTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton11.setText("Trả máy");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(25, 25, 25))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton11)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        May may = new May();
        may.setIdMay(String.valueOf(jComboBox1.getSelectedItem()));
        may.setIdKhach(Integer.valueOf(String.valueOf(jComboBox2.getSelectedItem()).replaceAll(" ","")));
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = current.format(formatter);
        int i=0;
              
        may.setBD(formatted);
        may.setDonGia(5000);
        userService.addMay(may);
        String nameBT= String.valueOf(jComboBox2.getSelectedItem()).replaceAll(" ","");
        defaultTableModel.setRowCount(0);
        List<May> mays = userService.getAllMay();
        for (May may1: mays){
            defaultTableModel.addRow(new Object[]{ may1.getIdMay(),may1.getIdKhach(),may1.getTenKhach(),may1.getBD(),may1.getDonGia()});
            String tm = may1.getIdMay();
            switch (tm){
                case "May1":
                    May1.setBackground(Color.red);
                    break;
                case "May2":
                    May2.setBackground(Color.red);
                    break;
                case "May3":
                    May3.setBackground(Color.red);
                    break;
                case "May4":
                    May4.setBackground(Color.red);
                    break;
                case "May5":
                    May5.setBackground(Color.red);
                    break;
                case "May6":
                    May6.setBackground(Color.red);
                    break;
                case "May7":
                    May7.setBackground(Color.red);
                    break;
                case "May8":
                    May8.setBackground(Color.red);
                    break;
                case "May9":
                    May9.setBackground(Color.red);
                    break;
                default:
                    break;
            }
        }
        jComboBox1.removeItem(jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        int row=mayTable.getSelectedRow();
        if (row==-1){
            JOptionPane.showMessageDialog(KhachHang.this,"Vui long chon may truoc","Loi",JOptionPane.ERROR_MESSAGE);

        }else{
            int confirm =JOptionPane.showConfirmDialog(KhachHang.this,"Ban chac chan muon tra may khong?");
            if (confirm==JOptionPane.YES_OPTION){
                String userId= String.valueOf(mayTable.getValueAt(row,0));

                userService.deleteMay(userId);
                jComboBox1.removeAllItems();
            for (int i = 1;i<=9;i++)
            {
                jComboBox1.addItem("May"+i);
            }

            List<May> mayss = userService.getAllMay();
            for (May may: mayss){
                jComboBox1.removeItem(String.valueOf(may.getIdMay()));
            }
                LocalDateTime current = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String formatted = current.format(formatter); 
                
            switch (userId){
                case "May1":
                    May1.setBackground(new Color(240,240,240));
                    break;
                case "May2":
                    May2.setBackground(new Color(240,240,240));
                    break;
                case "May3":
                    May3.setBackground(new Color(240,240,240));
                    break;
                case "May4":
                    May4.setBackground(new Color(240,240,240));
                    break;
                case "May5":
                    May5.setBackground(new Color(240,240,240));
                    break;
                case "May6":
                    May6.setBackground(new Color(240,240,240));
                    break;
                case "May7":
                    May7.setBackground(new Color(240,240,240));
                    break;
                case "May8":
                    May8.setBackground(new Color(240,240,240));
                    break;
                case "May9":
                    May9.setBackground(new Color(240,240,240));
                    break;
                default:
                    break;
            }
                
        defaultTableModel.setRowCount(0);
        List<May> mays = userService.getAllMay();
        for (May may1: mays){
            defaultTableModel.addRow(new Object[]{ may1.getIdMay(),may1.getIdKhach(),may1.getTenKhach(),may1.getBD(),may1.getDonGia()});
        }
        }}
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        User user2 = new User();
        user2 = userService.getUserById(Integer.valueOf(String.valueOf(jComboBox2.getSelectedItem())));
        jLabel4.setText(user2.getTen());
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int id= Integer.valueOf(String.valueOf(jComboBox2.getSelectedItem()));
        User user = new User();
        user=userService.getUserById(id);
        System.out.print(user.getTen());
        new Oder(user).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton May1;
    private javax.swing.JButton May2;
    private javax.swing.JButton May3;
    private javax.swing.JButton May4;
    private javax.swing.JButton May5;
    private javax.swing.JButton May6;
    private javax.swing.JButton May7;
    private javax.swing.JButton May8;
    private javax.swing.JButton May9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mayTable;
    // End of variables declaration//GEN-END:variables
}
