import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập giá trị a, b, c từ bàn phím
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        System.out.print("Nhập số nguyên c: ");
        int c = sc.nextInt();

        // Kiểm tra nếu a = 0 thì phương trình trở thành phương trình bậc nhất
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                // Giải phương trình bậc nhất: bx + c = 0 => x = -c/b
                double x = (double) -c / b;
                System.out.println("Phương trình bậc nhất có nghiệm x = " + x);
            }
        } else {
            // Phương trình bậc hai: ax^2 + bx + c = 0
            double delta = b * b - 4 * a * c; // Tính delta

            // Kiểm tra giá trị của delta
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = (double) -b / (2 * a); // Nghiệm kép
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                // Phương trình có 2 nghiệm phân biệt
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        sc.close(); // Đóng đối tượng Scanner
    }
}
