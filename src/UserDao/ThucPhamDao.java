/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserDao;

import User.ThucPham;
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
 * @author minhl
 */
public class ThucPhamDao {
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
}
