/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.User;
import Service.Service;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author phien
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Service userService_46;
    User user_46;
    public Login() {
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

        jLabel1_46 = new javax.swing.JLabel();
        jLabel2_46 = new javax.swing.JLabel();
        tkTF_46 = new javax.swing.JTextField();
        mkTF_46 = new javax.swing.JPasswordField();
        jButton1_46 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1_46.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1_46.setText("Tài khoản");
        getContentPane().add(jLabel1_46, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        jLabel2_46.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2_46.setText("Mật khẩu");
        getContentPane().add(jLabel2_46, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));
        getContentPane().add(tkTF_46, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 98, -1));
        getContentPane().add(mkTF_46, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 98, -1));

        jButton1_46.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton1_46.setText("Đăng nhập");
        jButton1_46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_46ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_46, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LNP.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_46ActionPerformed
        // TODO add your handling code here:
        String userName= tkTF_46.getText().replaceAll(" ","");
        String password= String.valueOf(mkTF_46.getPassword());
            
        userService_46=new Service();
        user_46=userService_46.getUserByUserName(userName);
            
            if (this.user_46 == null)
            {
                JOptionPane.showMessageDialog(Login.this,"Sai thong tin tai khoan","Loi",JOptionPane.ERROR_MESSAGE);
            }
                else {
                String pass=user_46.getMatKhau();
                pass=pass.replace(" ","");
                if(pass.equals(password)==false){
                    JOptionPane.showMessageDialog(Login.this,"Sai thong tin mat khau","Loi",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(Login.this,"Dang nhap thanh cong","Chao mung",JOptionPane.INFORMATION_MESSAGE);
                    if (user_46.getQuyen().equals("admin"))
                    {
                        try {
                            new Home().setVisible(true);
                        } catch (IOException ex) {
                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        this.dispose();
                   }else{
                        try {
                            new KhachHangView(user_46).setVisible(true);
                        } catch (IOException ex) {
                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        this.dispose();
                    }
            }}
    }//GEN-LAST:event_jButton1_46ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_46;
    private javax.swing.JLabel jLabel1_46;
    private javax.swing.JLabel jLabel2_46;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField mkTF_46;
    private javax.swing.JTextField tkTF_46;
    // End of variables declaration//GEN-END:variables
}
