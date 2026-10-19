public abstract class ThiSinh {
    private final String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private int mucUuTien;

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSoBaoDanh() { return soBaoDanh; }
    public String getHoTen() { return hoTen; }
    public String getDiaChi() { return diaChi; }
    public int getMucUuTien() { return mucUuTien; }

    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }
    public void setMucUuTien(int mucUuTien) { this.mucUuTien = mucUuTien; }

    // Mỗi khối tự định nghĩa tên khối và các môn thi
    public abstract String getKhoiThi();
    public abstract String[] getMonThi();

    @Override
    public String toString() {
        return String.format("SBD: %s | Họ tên: %s | Địa chỉ: %s | Ưu tiên: %d | Khối: %s | Môn thi: %s",
                soBaoDanh, hoTen, diaChi, mucUuTien, getKhoiThi(), String.join(", ", getMonThi()));
    }
}