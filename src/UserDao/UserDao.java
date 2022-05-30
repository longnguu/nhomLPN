
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserDao;

import User.DoanhThu;
import User.May;
import User.PC;
import User.TBao;
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
    public List<ThucPham> getAllTP() throws SQLException{
        List<ThucPham> users = new ArrayList<>();
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM thucpham";
        User user=new User();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                ThucPham tp = new ThucPham();
                
                tp.setId(rs.getInt("id"));
                tp.setSoLuong(rs.getInt("soluong"));
                tp.setGia(rs.getLong("Gia"));
                tp.setTen(rs.getString("Ten"));
                 
                
                users.add(tp);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return users;
    }
    public List<ThucPham> searchTP1(String s) throws SQLException{
        List<ThucPham> users = new ArrayList<>();
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM ThucPham where ten =  ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,s);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                ThucPham tp = new ThucPham();
                
                tp.setId(rs.getInt("id"));
                tp.setSoLuong(rs.getInt("soluong"));
                tp.setGia(rs.getLong("Gia"));
                tp.setTen(rs.getString("Ten"));
                 
                
                users.add(tp);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return users;
    }
    public void updateTP(ThucPham tp){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql="UPDATE thucpham SET ten= ?,soluong= ?,gia= ? WHERE id= ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1,tp.getTen());
            preparedStatement.setInt(2,tp.getSoLuong());
            preparedStatement.setLong(3,tp.getGia());
            preparedStatement.setInt(4,tp.getId());
            
            
            int rs= preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public int demPC(){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM PC";
        int i=0;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                i++;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return i;
    }
     public int demUser(){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM khachhang";
        int i=0;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                i++;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return i;
    }
    public int demMay(){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM may";
        int i=0;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                i++;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return i;
    }
    public int demTB(){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM thongbao";
        int i=0;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                i++;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return i;
    }
    public List<TBao> getAllTB() throws SQLException{
        List<TBao> tbs = new ArrayList<>();
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM Thongbao";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                TBao tb = new TBao();
                
                tb.setId(rs.getInt("id"));
                tb.setNd(rs.getString("nd"));
                
                
                tbs.add(tb);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return tbs;
    }
    public void addTB(TBao tb){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql="insert into ThongBao(nd) VALUES (?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1,tb.getNd());
            
            int rs= preparedStatement.executeUpdate();
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void deleteTB(int id){
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql="delete from thongbao where id= ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1,id);
               int rs= preparedStatement.executeUpdate();
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public TBao getTBById(int id){
        Connection con = KetNoiSQL.getJDBCConnection();
        PreparedStatement ps;
        TBao tb = new TBao();
        try {
            ps = con.prepareStatement("Select * from thongbao where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                tb.setId(rs.getInt("ID"));
                tb.setNd(rs.getString("nd"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tb;
    }
    public List<PC> getAllPC() throws SQLException{
        List<PC> users = new ArrayList<>();
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM PC";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                PC user = new PC();
                
                user.setIdPC(rs.getString("id"));
                user.setTenPC(rs.getString("ten"));
                user.setTthai(rs.getString("tthai"));
                
                
                users.add(user);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return users;
    }
}
