/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserDao;

import User.May;
import User.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author MY LAPTOP
 */
public class UserDao {
    public List<User> getAllUser() throws SQLException{
        List<User> users = new ArrayList<>();
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM KhachHang";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                User user = new User();
                
                user.setId(rs.getInt("id"));
                user.setTen(rs.getString("ten"));
                user.setHeSoTien(rs.getInt("hesotien"));
                user.setNapTien(rs.getLong("naptien"));
                user.setTienNo(rs.getLong("tienno"));
                user.setTaiKhoan(rs.getString("TaiKhoan"));
                user.setMatKhau(rs.getString("MatKhau"));
                user.setQuyen(rs.getString("Quyen"));
                
                
                users.add(user);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return users;
    }
    public User getUserByUserName(String userName) {
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM khachhang where TaiKhoan = ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                User user = new User();
                
                user.setId(rs.getInt("id"));
                user.setTen(rs.getString("ten"));
                user.setHeSoTien(rs.getInt("hesotien"));
                user.setNapTien(rs.getLong("naptien"));
                user.setTienNo(rs.getLong("tienno"));
                user.setTaiKhoan(rs.getString("TaiKhoan"));
                user.setMatKhau(rs.getString("MatKhau"));
                user.setQuyen(rs.getString("Quyen"));
                
                return user;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public List<User> searchUser(String s) throws SQLException{
        List<User> users = new ArrayList<>();
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM KhachHang where ten like '%"+s+"%' or id like '%"+s+"%'";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                User user = new User();
                
                user.setId(rs.getInt("id"));
                user.setTen(rs.getString("ten"));
                user.setHeSoTien(rs.getInt("hesotien"));
                user.setNapTien(rs.getLong("naptien"));
                user.setTienNo(rs.getLong("tienno"));
                user.setTaiKhoan(rs.getString("TaiKhoan"));
                user.setMatKhau(rs.getString("MatKhau"));
                user.setQuyen(rs.getString("Quyen"));
                
                
                users.add(user);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return users;
    }
    public User getUserById(int Id) {
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM KhachHang where id= ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, Id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                User user = new User();
                
                user.setId(rs.getInt("id"));
                user.setTen(rs.getString("ten"));
                user.setHeSoTien(rs.getInt("hesotien"));
                user.setNapTien(rs.getLong("naptien"));
                user.setTienNo(rs.getLong("tienno"));
                user.setTaiKhoan(rs.getString("TaiKhoan"));
                user.setMatKhau(rs.getString("MatKhau"));
                user.setQuyen(rs.getString("Quyen"));
                
                return user;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public void addUser(User user){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql="insert into khachhang(ten,hesotien,naptien,tienno,taikhoan,matkhau,quyen) VALUES (?,?,?,?,?,?,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1,user.getTen());
            preparedStatement.setInt(2,user.getHeSoTien());
            preparedStatement.setLong(3,user.getNapTien());
            preparedStatement.setLong(4,user.getTienNo());
            preparedStatement.setString(5,user.getTaiKhoan());
            preparedStatement.setString(6,user.getMatKhau());
            preparedStatement.setString(7,user.getQuyen());
            
            int rs= preparedStatement.executeUpdate();
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void updateUser(User user){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql="UPDATE KhachHang SET ten= ?,hesotien= ?,naptien= ?,tienno= ?,taikhoan= ?,matkhau= ?,quyen= ? WHERE id= ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1,user.getTen());
            preparedStatement.setInt(2,user.getHeSoTien());
            preparedStatement.setLong(3,user.getNapTien());
            preparedStatement.setLong(4,user.getTienNo());
            preparedStatement.setString(5,user.getTaiKhoan());
            preparedStatement.setString(6,user.getMatKhau());
            preparedStatement.setString(7,user.getQuyen());
            preparedStatement.setInt(8,user.getId());
            
            
            int rs= preparedStatement.executeUpdate();
            System.out.println(rs);
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void deleteUser(int id){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql="delete from KhachHang where id= ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1,id);
               int rs= preparedStatement.executeUpdate();
            System.out.println(rs);
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public int getIDKHMax(){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql="select top 1 id from KhachHang order by id desc";
        int num = 0;
         try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                num = (rs.getInt(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return num;
    }
    public List<May> getAllMay() throws SQLException{
        List<May> users = new ArrayList<>();
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM May";
        User user=new User();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                May may = new May();
                
                may.setIdMay(rs.getString("id"));
                may.setIdKhach(rs.getInt("idKhach"));
                may.setDonGia(rs.getLong("DonGia"));
                
                user=getUserById(may.getIdKhach());
                may.setTenKhach(user.getTen()); 
                
                users.add(may);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return users;
    }
    public List<May> getAllMayByIdKH(int id) throws SQLException{
        List<May> users = new ArrayList<>();
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM May where idKhach = ? ";
        User user=new User();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()){
                May may = new May();
                
                may.setIdMay(rs.getString("id"));
                may.setIdKhach(rs.getInt("idKhach"));
                may.setDonGia(rs.getLong("DonGia"));
                
                user=getUserById(may.getIdKhach());
                may.setTenKhach(user.getTen()); 
                
                users.add(may);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return users;
    }
    public void addMay(May may){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql="insert into may VALUES (?,?,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1,may.getIdMay());
            preparedStatement.setInt(2,may.getIdKhach());
            preparedStatement.setLong(3,may.getDonGia());
            
            int rs= preparedStatement.executeUpdate();
            
        }catch (SQLException e){
            e.printStackTrace();
        }
        User user= new User();
        user = getUserById(may.getIdKhach());
        may.setTenKhach(user.getTen());
    }
    public void deleteMay(String id){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql="delete from May where id = ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1,id);
               int rs= preparedStatement.executeUpdate();
            System.out.println(rs);
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
