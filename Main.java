import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyThiSinh ql = new QuanLyThiSinh();

        while (true) {
            System.out.println("\n===== QUẢN LÝ THÍ SINH =====");
            System.out.println("1. Thêm mới thí sinh");
            System.out.println("2. Hiển thị thông tin thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            switch (sc.nextLine().trim()) {
                case "1" -> ql.themThiSinh(sc);
                case "2" -> ql.hienThiDanhSach();
                case "3" -> ql.timKiem(sc);
                case "4" -> {
                    System.out.println("Tạm biệt!");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}