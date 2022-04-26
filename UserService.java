
package dao.UserService;

import dao.User.User;
import dao.UserDao.UserDao;
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
    public void addUser(User user){
        userDao.addUser(user);
    }
    public void deleteUser(int id){
        userDao.deleteUser(id);
    }
    public User getUserById(int id){
        return userDao.getUserById(id);
    }
    public User getUserByUserName(String userName){
        return userDao.getUserByUserName(userName);
    }
    public void updateUser(User user){
        userDao.updateUser(user);
    }
} 
