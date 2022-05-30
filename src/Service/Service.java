package Service;

import Model.DoanhThu;
import Model.May;
import Model.PC;
import Model.TBao;
import Model.ThucPham;
import Model.User;
import Dao.ThietBiDao;
import Dao.ThucPhamDao;
import Dao.UserDao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MY LAPTOP
 */
public class Service {
    private final UserDao userDao;
    private final ThucPhamDao thucPhamDao;
    private final ThietBiDao thietBiDao;
    public Service(){
        userDao=new UserDao();
        thucPhamDao = new ThucPhamDao();
        thietBiDao = new ThietBiDao();
    }
    public List<User> getAllUser(){
        try {
            return userDao.getAllUser();
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<User> searchUser(String s){
        try {
            return userDao.searchUser(s);
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
      public List<May> getAllMayByIdKH(int id){
        try {
            return userDao.getAllMayByIdKH(id);
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<ThucPham> getAllThucPham(){
        return thucPhamDao.getAllThucPham();
    }
    public void addThucPham(ThucPham tp){
        thucPhamDao.addThucPham(tp);
    }
    public void updateThucPham(ThucPham tp){
        thucPhamDao.updateThucPham(tp);
    }
    public void deleteThucPham(int id){
        thucPhamDao.deleteThucPham(id);
    }
    public List<ThucPham> searchThucPham(String s){
        return thucPhamDao.searchThucPham(s);
    }
    public ThucPham getThucPhamById(int id){
        return thucPhamDao.getThucPhamById(id);
    }  

    
    public List<DoanhThu> getAllDT(){
        try {
            return userDao.getAllDT();
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<ThucPham> getAllTP(){
        try {
            return userDao.getAllTP();
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<ThucPham> searchTP1(String s){
        try {
            return userDao.searchTP1(s);
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void updateTP(ThucPham user){
        userDao.updateTP(user);
    }
    
    public int demUser(){
        return userDao.demUser();
    }
    public int demMay(){
        return userDao.demMay();
    }
    public int demTB(){
        return userDao.demTB();
    }
    public List<TBao> getAllTB(){
        try {
            return userDao.getAllTB();
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void addTB(TBao tb){
        userDao.addTB(tb);
    }
    public void deleteTB(int id){
        userDao.deleteTB(id);
    }
    public TBao getTBById(int id){
        return userDao.getTBById(id);
    }
    public List<PC> getAllPC(){
        try {
            return userDao.getAllPC();
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<PC> getAllPC1() {
        try {
            return thietBiDao.getAllPC1();
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     public int demPC(){
        return userDao.demPC();
    }
     public void addPC(PC tp){
        thietBiDao.addPC(tp);
    }
    public void updatePC(PC tp){
        thietBiDao.updatePC(tp);
    }
    public void deletePC(String id){
        thietBiDao.deletePC(id);
    }
    public List<PC> searchPC(String s){
        return thietBiDao.searchPC(s);
    }
    public PC getPCById(String id){
        return thietBiDao.getPCById(id);
    }
}
