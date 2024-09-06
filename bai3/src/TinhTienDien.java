import java.util.Scanner;

public class TinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số điện từ bàn phím
        System.out.print("Nhập số điện sử dụng: ");
        int soDien = sc.nextInt();

        // Khai báo biến lưu số tiền
        int soTien;

        // Kiểm tra và tính số tiền điện dựa trên số điện sử dụng
        if (soDien <= 100) {
            // Nếu số điện <= 100, giá mỗi số là 1000
            soTien = soDien * 1000;
        } else {
            // Nếu số điện > 100, tính 100 số đầu với giá 1000, phần còn lại với giá 1500
            soTien = 100 * 1000 + (soDien - 100) * 1500;
        }

        // In ra số tiền điện phải trả
        System.out.println("Số tiền điện phải trả là: " + soTien + " VND");

        sc.close(); // Đóng đối tượng Scanner
    }
}

