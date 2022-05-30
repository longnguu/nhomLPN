/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.PC;
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
public class ThietBiDao {
     public List<PC> getAllPC() throws SQLException{
        List<PC> users = new ArrayList<>();
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM PC where tthai like '%bt%'";
        
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
     public List<PC> getAllPC1() throws SQLException{
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
     public void addPC(PC pc){
        Connection con = KetNoiSQL.getJDBCConnection();
        try {
            PreparedStatement ps = con.prepareStatement("Insert into PC(id,ten,tthai) values (?,?,?)");
            ps.setString(1, pc.getIdPC());
            ps.setString(2, pc.getTenPC());
            ps.setString(3, pc.getTthai());
            int rs = ps.executeUpdate();
            if(rs == 1)
                System.out.println("Insert successful");
            else
                System.out.println("Error");
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deletePC(String id){
        Connection con = KetNoiSQL.getJDBCConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("Delete from PC where id = ?");
            ps.setString(1, id);
            int rs = ps.executeUpdate();
            if (rs ==1)
                System.out.println("Delete successful");
            else
                System.out.println("Error");
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updatePC(PC pc){
        Connection con = KetNoiSQL.getJDBCConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("Update PC set ten = ?, tthai = ? where id = ?");
            ps.setString(1, pc.getTenPC());
            ps.setString(2, pc.getTthai());
            ps.setString(3,pc.getIdPC());
            int rs = ps.executeUpdate();
            if(rs ==1)
                System.out.println("Update successful");
            else
                System.out.println("Error");
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<PC> searchPC(String s){
        List<PC> users = new ArrayList<>();
        Connection connection = KetNoiSQL.getJDBCConnection();
        String sql= "SELECT * FROM PC where ten like '%"+s+"%'";
        
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
    public PC getPCById(String id){
        Connection con = KetNoiSQL.getJDBCConnection();
        PreparedStatement ps;
        PC pc = new PC();
        try {
            ps = con.prepareStatement("Select * from PC where id = ?");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                pc.setIdPC(rs.getString("ID"));
                pc.setTenPC(rs.getString("ten"));
                pc.setTthai(rs.getString("tthai"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pc;
    }
}
