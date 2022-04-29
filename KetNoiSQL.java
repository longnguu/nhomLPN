package UserDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class KetNoiSQL {
    private Connection con = null;
    public static Connection getJDBCConnection() {
        final String url = "jdbc:jtds:sqlserver://DESKTOP-836R118:1433/QuanLyTiemNet;";
        final String user = "sa";
        final String password="123456";
        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            return DriverManager.getConnection(url);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KetNoiSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(KetNoiSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args){
        Connection con = getJDBCConnection();
        if(con!=null)
            System.out.println("Co");
        else
            System.out.println("Ko");
    }
}
