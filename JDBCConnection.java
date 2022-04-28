/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.UserDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JDBCConnection {
    public static Connection getJDBCConnection() {
//        final String url = "jtds:jdbc:sqlserver://DESKTOP-836R118:1433/QuanLiTaiChinh?autoReconnect=true&useSSL=false";
//        final String user = "root";
//        final String password = "";
        try{
//            Class.forName("com.mysql.jdbc.Driver");
               Class.forName("net.sourceforge.jtds.jdbc.Driver");
            return DriverManager.getConnection("jdbc:jtds:sqlserver://DESKTOP-836R118:1433/QuanLiTaiChinh");
        } catch (ClassNotFoundException | SQLException ex) {        
            return null;

        }
    }
    public static void main(String[] args){
        Connection con = new JDBCConnection().getJDBCConnection();
        if(con==null)
            System.out.print("ko");
        else
            System.out.print("co");
    }
}
