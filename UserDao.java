
package dao.UserDao;

import dao.User.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> getAllUser() throws SQLException{
        List<User> users = new ArrayList<>();
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql= "SELECT * FROM TaiKhoan";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                User user = new User();
                user.setId(rs.getInt("Id"));
                user.setTen(rs.getString("Ten"));
                user.setDienThoai(rs.getString("dienThoai"));
                user.setTenDangNhap(rs.getString("tenDangNhap"));
                user.setMatKhau(rs.getString("matKhau"));
                user.setQuyen(rs.getString("quyen"));
                
                users.add(user);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return users;
    }
    public User getUserById(int Id) {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql= "SELECT * FROM TaiKhoan where id= ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, Id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                User user = new User();
                
                user.setId(rs.getInt("Id"));
                user.setTen(rs.getString("Ten"));
                user.setDienThoai(rs.getString("dienThoai"));
                user.setTenDangNhap(rs.getString("tenDangNhap"));
                user.setMatKhau(rs.getString("matKhau"));
                user.setQuyen(rs.getString("quyen"));
                
                return user;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public User getUserByUserName(String userName) {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql= "SELECT * FROM TaiKhoan where tenDangNhap = ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                User user = new User();
                
               user.setId(rs.getInt("Id"));
                user.setTen(rs.getString("Ten"));
                user.setDienThoai(rs.getString("dienThoai"));
                user.setTenDangNhap(rs.getString("tenDangNhap"));
                user.setMatKhau(rs.getString("matKhau"));
                user.setQuyen(rs.getString("quyen"));
                
                return user;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public void addUser(User user){
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql="INSERT INTO TaiKhoan(ten,dienThoai,tenDangNhap,matKhau,quyen) VALUES (?,?,?,?,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1,user.getTen());
            preparedStatement.setString(2,user.getDienThoai());
            preparedStatement.setString(3,user.getTenDangNhap());
            preparedStatement.setString(4,user.getMatKhau());
            preparedStatement.setString(5,user.getQuyen());
            
            int rs= preparedStatement.executeUpdate();
            System.out.println(rs);
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }        
    public void updateUser(User user){
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql="UPDATE TaiKhoan SET ten = ?,dienThoai = ?,tenDangNhap = ?,matKhau= ?,quyen = ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1,user.getTen());
            preparedStatement.setString(2,user.getDienThoai());
            preparedStatement.setString(3,user.getTenDangNhap());
            preparedStatement.setString(4,user.getMatKhau());
            preparedStatement.setString(5,user.getQuyen());
            preparedStatement.setInt(8,user.getId());
            
            
            int rs= preparedStatement.executeUpdate();
            System.out.println(rs);
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void deleteUser(int id){
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql="delete from TaiKhoan where id= ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1,id);
               int rs= preparedStatement.executeUpdate();
            System.out.println(rs);
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}