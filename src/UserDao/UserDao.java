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
                user.setCMND(rs.getString("CMND"));
                user.setDiaChi(rs.getString("DiaChi"));
                
                
                users.add(user);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return users;
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
                user.setCMND(rs.getString("CMND"));
                user.setDiaChi(rs.getString("DiaChi"));
                
                
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
                user.setCMND(rs.getString("CMND"));
                user.setDiaChi(rs.getString("DiaChi"));
                return user;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public void addUser(User user){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql="insert into khachhang(ten,hesotien,naptien,tienno,taikhoan,matkhau,quyen,CMND,DiaChi) VALUES (?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1,user.getTen());
            preparedStatement.setInt(2,user.getHeSoTien());
            preparedStatement.setLong(3,user.getNapTien());
            preparedStatement.setLong(4,user.getTienNo());
            preparedStatement.setString(5,user.getTaiKhoan());
            preparedStatement.setString(6,user.getMatKhau());
            preparedStatement.setString(7,user.getQuyen());
            preparedStatement.setString(8,user.getCMND());
            preparedStatement.setString(9,user.getDiaChi());
            
            int rs= preparedStatement.executeUpdate();
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void updateUser(User user){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql="UPDATE KhachHang SET ten= ?,hesotien= ?,naptien= ?,tienno= ?,taikhoan= ?,matkhau= ?,quyen= ?,CMND=?,DiaChi=? WHERE id= ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1,user.getTen());
            preparedStatement.setInt(2,user.getHeSoTien());
            preparedStatement.setLong(3,user.getNapTien());
            preparedStatement.setLong(4,user.getTienNo());
            preparedStatement.setString(5,user.getTaiKhoan());
            preparedStatement.setString(6,user.getMatKhau());
            preparedStatement.setString(7,user.getQuyen());
            preparedStatement.setString(8,user.getCMND());
            preparedStatement.setString(9,user.getDiaChi());
            preparedStatement.setInt(10,user.getId());
            
            
            int rs= preparedStatement.executeUpdate();
            
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
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    //Nhã 
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
                may.setBD(rs.getString("nbd"));
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
                may.setBD(rs.getString("NBD"));
                
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
        String sql="insert into may(id,idKhach,dongia,NBD) VALUES (?,?,?,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1,may.getIdMay());
            preparedStatement.setInt(2,may.getIdKhach());
            preparedStatement.setLong(3,may.getDonGia());
            preparedStatement.setString(4,may.getBD());
            
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
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
