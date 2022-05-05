/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author MY LAPTOP
 */
public class ThucPham {
    private int id,soLuong;
    private long gia;
    private String ten;

    public ThucPham() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public long getGia() {
        return gia;
    }

    public String getTen() {
        return ten;
    }
}
