/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author MY LAPTOP
 */
public class User {
    private int id,heSoTien;
    private long napTien, tienNo;
    private String ten,taiKhoan,matKhau,quyen,CMND,diaChi;

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getCMND() {
        return CMND;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public User() {
    }

    public User(int id, int heSoTien, long napTien, long tienNo, String ten, String taiKhoan, String matKhau, String quyen) {
        this.id = id;
        this.heSoTien = heSoTien;
        this.napTien = napTien;
        this.tienNo = tienNo;
        this.ten = ten;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.quyen = quyen;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHeSoTien(int heSoTien) {
        this.heSoTien = heSoTien;
    }

    public void setNapTien(long napTien) {
        this.napTien = napTien;
    }

    public void setTienNo(long tienNo) {
        this.tienNo = tienNo;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    public int getId() {
        return id;
    }

    public int getHeSoTien() {
        return heSoTien;
    }

    public long getNapTien() {
        return napTien;
    }

    public long getTienNo() {
        return tienNo;
    }

    public String getTen() {
        return ten;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getQuyen() {
        return quyen;
    }
}
