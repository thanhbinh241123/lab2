import java.util.Scanner;

public class MenuChucNang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do {
            // Hiển thị menu
            System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
            System.out.println("++ ----------------------------------------- ++");
            System.out.println("| 1. Giải phương trình bậc nhất              |");
            System.out.println("| 2. Giải phương trình bậc hai               |");
            System.out.println("| 3. Tính số tiền điện                       |");
            System.out.println("| 4. Kết thúc                                |");
            System.out.println("++ ----------------------------------------- ++");
            System.out.print("Nhập lựa chọn của bạn: ");

            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    // Gọi hàm giải phương trình bậc nhất
                    giaiPhuongTrinhBacNhat(sc);
                    break;
                case 2:
                    // Gọi hàm giải phương trình bậc hai
                    giaiPhuongTrinhBacHai(sc);
                    break;
                case 3:
                    // Gọi hàm tính tiền điện
                    tinhTienDien(sc);
                    break;
                case 4:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }

        } while (luaChon != 4); // Chương trình kết thúc khi lựa chọn là 4

        sc.close(); // Đóng Scanner
    }

    // Hàm giải phương trình bậc nhất ax + b = 0
    public static void giaiPhuongTrinhBacNhat(Scanner sc) {
        System.out.print("Nhập hệ số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập hệ số b: ");
        int b = sc.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = (double) -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }

    // Hàm giải phương trình bậc hai ax^2 + bx + c = 0
    public static void giaiPhuongTrinhBacHai(Scanner sc) {
        System.out.print("Nhập hệ số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập hệ số b: ");
        int b = sc.nextInt();
        System.out.print("Nhập hệ số c: ");
        int c = sc.nextInt();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = (double) -c / b;
                System.out.println("Phương trình bậc nhất có nghiệm x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = (double) -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

    // Hàm tính tiền điện
    public static void tinhTienDien(Scanner sc) {
        System.out.print("Nhập số điện sử dụng: ");
        int soDien = sc.nextInt();

        int soTien;
        if (soDien <= 100) {
            soTien = soDien * 1000;
        } else {
            soTien = 100 * 1000 + (soDien - 100) * 1500;
        }

        System.out.println("Số tiền điện phải trả là: " + soTien + " VND");
    }
}
