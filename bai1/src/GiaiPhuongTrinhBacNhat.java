import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập giá trị a và b từ bàn phím
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        // Sử dụng câu điều kiện if để kiểm tra các trường hợp của phương trình
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            // a != 0, tính nghiệm của phương trình
            double x = (double) -b / a; // ép kiểu về double để tính toán chính xác hơn
            System.out.println("Phương trình có nghiệm x = " + x);
        }

        // Sử dụng switch case để xử lý trường hợp của a
        System.out.println("\nSử dụng switch để kiểm tra a:");
        switch (a) {
            case 0:
                System.out.println("Hệ số a = 0");
                break;
            default:
                System.out.println("Hệ số a = " + a);
                break;
        }

        sc.close(); // Đóng đối tượng Scanner
    }
}
