package UserService;

import User.May;
import User.ThucPham;
import User.User;
import UserDao.UserDao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MY LAPTOP
 */
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
    //Nhã
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
      
    public List<ThucPham> getAllThucPham(){
        return userDao.getAllThucPham();
    }
    public void addThucPham(ThucPham tp){
        userDao.addThucPham(tp);
    }
    public void updateThucPham(ThucPham tp){
        userDao.updateThucPham(tp);
    }
    public void deleteThucPham(int id){
        userDao.deleteThucPham(id);
    }
    public List<ThucPham> searchThucPham(String s){
        return userDao.searchThucPham(s);
    }
    public ThucPham getThucPhamById(int id){
        return userDao.getThucPhamById(id);
    }
}
