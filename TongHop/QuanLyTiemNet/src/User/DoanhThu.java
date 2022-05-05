/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author MY LAPTOP
 */
public class DoanhThu {
    private int id;
    private String ngay,ghiChu;
    private long doanhThu;

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public DoanhThu() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public void setDoanhThu(long doanhThu) {
        this.doanhThu = doanhThu;
    }

    public int getId() {
        return id;
    }

    public String getNgay() {
        return ngay;
    }

    public long getDoanhThu() {
        return doanhThu;
    }
}
