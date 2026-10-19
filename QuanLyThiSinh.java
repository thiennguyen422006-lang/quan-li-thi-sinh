import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyThiSinh {
    private final List<ThiSinh> danhSach = new ArrayList<>();

    // Thêm mới thí sinh
    public void themThiSinh(Scanner sc) {
        System.out.print("Nhập số báo danh: ");
        String sbd = sc.nextLine().trim();
        if (timTheoSoBaoDanh(sbd) != null) {
            System.out.println("Số báo danh đã tồn tại!");
            return;
        }
        System.out.print("Nhập họ tên: ");
        String hoTen = sc.nextLine().trim();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = sc.nextLine().trim();
        int uuTien = nhapSoNguyen(sc, "Nhập mức ưu tiên: ");

        System.out.print("Chọn khối thi (A/B/C): ");
        String khoi = sc.nextLine().trim().toUpperCase();

        ThiSinh ts;
        switch (khoi) {
            case "A" -> ts = new ThiSinhKhoiA(sbd, hoTen, diaChi, uuTien);
            case "B" -> ts = new ThiSinhKhoiB(sbd, hoTen, diaChi, uuTien);
            case "C" -> ts = new ThiSinhKhoiC(sbd, hoTen, diaChi, uuTien);
            default -> {
                System.out.println("Khối thi không hợp lệ!");
                return;
            }
        }
        danhSach.add(ts);
        System.out.println("Thêm thí sinh thành công!");
    }

    // Hiển thị thông tin thí sinh và khối thi
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        for (ThiSinh ts : danhSach) {
            System.out.println(ts);
        }
    }

    // Tìm kiếm theo số báo danh
    public ThiSinh timTheoSoBaoDanh(String sbd) {
        for (ThiSinh ts : danhSach) {
            if (ts.getSoBaoDanh().equalsIgnoreCase(sbd)) {
                return ts;
            }
        }
        return null;
    }

    public void timKiem(Scanner sc) {
        System.out.print("Nhập số báo danh cần tìm: ");
        ThiSinh ts = timTheoSoBaoDanh(sc.nextLine().trim());
        System.out.println(ts != null ? ts : "Không tìm thấy thí sinh.");
    }

    private int nhapSoNguyen(Scanner sc, String thongBao) {
        while (true) {
            System.out.print(thongBao);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên!");
            }
        }
    }
}