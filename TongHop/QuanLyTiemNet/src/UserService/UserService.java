
package UserService;

import User.DoanhThu;
import User.May;
import User.ThucPham;
import User.User;
import UserDao.UserDao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserService {
    private final UserDao userDao;
    public UserService(){
        userDao=new UserDao();
    }
    public List<User> getAllUser(){
        try {
            return userDao.getAllUser();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<User> searchUser(String s){
        try {
            return userDao.searchUser(s);
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public User getUserByUserName(String userName){
        return userDao.getUserByUserName(userName);
    }
    public void addUser(User user){
        userDao.addUser(user);
    }
    public void deleteUser(int id){
        userDao.deleteUser(id);
    }
    public User getUserById(int id){
        return userDao.getUserById(id);
    }
    public void updateUser(User user){
        userDao.updateUser(user);
    }
    public int getIDKHMax(){
        return userDao.getIDKHMax();
    }
    public void addMay(May may){
        userDao.addMay(may);
    }
    public void deleteMay(String id){
        userDao.deleteMay(id);
    }
     public List<May> getAllMay(){
        try {
            return userDao.getAllMay();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
      public List<May> getAllMayByIdKH(int id){
        try {
            return userDao.getAllMayByIdKH(id);
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
      public List<ThucPham> getAllTP(){
        try {
            return userDao.getAllTP();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
      public List<ThucPham> searchTP(String s){
        try {
            return userDao.searchTP(s);
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
      public List<ThucPham> searchTP1(String s){
        try {
            return userDao.searchTP1(s);
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
      public void addTP(ThucPham user){
        userDao.addTP(user);
    }
    public void deleteTP(int id){
        userDao.deleteTP(id);
    }
    public void updateTP(ThucPham user){
        userDao.updateTP(user);
    }
    public int getIDTPMax(){
        return userDao.getIDTPMax();
    }
    public ThucPham getTPById(int id){
        return userDao.getTPById(id);
    }
    public List<DoanhThu> getAllDT(){
        try {
            return userDao.getAllDT();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void addDT(DoanhThu dt){
        userDao.addDT(dt);
    }
    public List<DoanhThu> getDTByDate(String thang,String nam){
        try {
            return userDao.getDTByDate(thang,nam);
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
