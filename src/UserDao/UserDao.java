
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserDao;

import User.DoanhThu;
import User.May;
import User.ThucPham;
import User.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public List<ThucPham> getAllThucPham(){
        List<ThucPham> thucPhams = new ArrayList<>();
        Connection con = KetNoiSQL.getJDBCConnection();
        try {
            PreparedStatement ps = con.prepareStatement("Select * from ThucPham");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ThucPham thucPham = new ThucPham();
                thucPham.setId(rs.getInt("ID"));
                thucPham.setTen(rs.getString("ten"));
                thucPham.setGia(rs.getLong("gia"));
                thucPham.setSoLuong(rs.getInt("soLuong"));
                thucPhams.add(thucPham);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return thucPhams;
    }
    public void addThucPham(ThucPham tp){
        Connection con = KetNoiSQL.getJDBCConnection();
        try {
            PreparedStatement ps = con.prepareStatement("Insert into ThucPham(ten, gia, soLuong) values (?,?,?)");
            ps.setString(1, tp.getTen());
            ps.setLong(2, tp.getGia());
            ps.setInt(3, tp.getSoLuong());
            int rs = ps.executeUpdate();
            if(rs == 1)
                System.out.println("Insert successful");
            else
                System.out.println("Error");
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteThucPham(int id){
        Connection con = KetNoiSQL.getJDBCConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("Delete from ThucPham where id = ?");
            ps.setInt(1, id);
            int rs = ps.executeUpdate();
            if (rs ==1)
                System.out.println("Delete successful");
            else
                System.out.println("Error");
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateThucPham(ThucPham tp){
        Connection con = KetNoiSQL.getJDBCConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("Update ThucPham set ten = ?, gia = ?, soLuong = ? where id = ?");
            ps.setString(1, tp.getTen());
            ps.setLong(2, tp.getGia());
            ps.setInt(3,tp.getSoLuong());
            ps.setInt(4, tp.getId());
            int rs = ps.executeUpdate();
            if(rs ==1)
                System.out.println("Update successful");
            else
                System.out.println("Error");
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<ThucPham> searchThucPham(String s){
        List<ThucPham> thucPhams = new ArrayList<>();
        Connection con = KetNoiSQL.getJDBCConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("Select * from ThucPham where ten like '%"+s+"%' ");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ThucPham thucPham = new ThucPham();
                thucPham.setId(rs.getInt("ID"));
                thucPham.setTen(rs.getString("ten"));
                thucPham.setGia(rs.getLong("gia"));
                thucPham.setSoLuong(rs.getInt("soLuong"));
                thucPhams.add(thucPham);
            }
            return thucPhams;
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ThucPham getThucPhamById(int id){
        Connection con = KetNoiSQL.getJDBCConnection();
        PreparedStatement ps;
        ThucPham thucPham = new ThucPham();
        try {
            ps = con.prepareStatement("Select * from ThucPham where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                thucPham.setId(rs.getInt("ID"));
                thucPham.setTen(rs.getString("ten"));
                thucPham.setGia(rs.getLong("gia"));
                thucPham.setSoLuong(rs.getInt("soLuong"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return thucPham;
    }
    
    public List<DoanhThu> getAllDT() throws SQLException{
        List<DoanhThu> dts = new ArrayList<>();
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM DoanhThu";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                DoanhThu dt = new DoanhThu();
                
                dt.setId(rs.getInt("id"));
                dt.setNgay(rs.getString("Ngay"));
                dt.setDoanhThu(rs.getInt("doanhthu"));
                dt.setGhiChu(rs.getString("ghichu"));
                
                
                
                dts.add(dt);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return dts;
    }
    public void addDT(DoanhThu dt){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql="insert into doanhthu(ngay,doanhthu,ghichu) VALUES (?,?,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1,dt.getNgay());
            preparedStatement.setLong(2,dt.getDoanhThu());
            preparedStatement.setString(3,dt.getGhiChu());
            
            int rs= preparedStatement.executeUpdate();
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public List<DoanhThu> getDTByDate(String thang, String nam) throws SQLException{
        List<DoanhThu> dts = new ArrayList<>();
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM DoanhThu where month(Ngay) = ? and year(Ngay)= ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,thang);
            preparedStatement.setString(2,nam);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                DoanhThu dt = new DoanhThu();
                
                dt.setId(rs.getInt("id"));
                dt.setNgay(rs.getString("Ngay"));
                dt.setDoanhThu(rs.getInt("doanhthu"));
                dt.setGhiChu(rs.getString("ghichu"));
                
                
                
                dts.add(dt);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return dts;
    }
}
