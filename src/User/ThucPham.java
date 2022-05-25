package User;
public class ThucPham {
    private int id, soLuong;
    private String ten;
    private long gia;
    public ThucPham(){}
    public ThucPham(int id, int soLuong, String ten, long gia) {
        this.id = id;
        this.soLuong = soLuong;
        this.ten = ten;
        this.gia = gia;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public long getGia() {
        return gia;
    }
    public void setGia(long gia) {
        this.gia = gia;
    }
    
    
}
