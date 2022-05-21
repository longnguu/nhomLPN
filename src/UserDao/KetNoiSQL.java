/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author MY LAPTOP
 */
public class KetNoiSQL {
    private Connection con = null;
    public static Connection getJDBCConnection() {
        final String url = "jdbc:jtds:sqlserver://LAPTOP-NS4H03L1:1433/QuanLyTiemNet;";
        final String user = "sa";
        final String password="123456";
        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KetNoiSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(KetNoiSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return null;
    }
}
