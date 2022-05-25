/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author GIAOADMIN
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
