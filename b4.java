import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cạnh 1: ");
        int a = sc.nextInt();
        System.out.print("Cạnh 2: ");
        int b = sc.nextInt();
        System.out.print("Cạnh 3: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            }
            else if (a == b || b == c || a == c) {
                System.out.println("Đây là tam giác cân.");
            }
            else if (tamgiac(a, b, c)) {
                System.out.println("Đây là tam giác vuông.");
            }
            else {
                System.out.println("Đây là tam giác thường.");
            }
        } else {
            System.out.println("Ba cạnh không tạo thành tam giác.");
        }

        sc.close();
    }
    public static boolean tamgiac(int a, int b, int c) {
        return (a * a == b * b + c * c) ||
                (b * b == a * a + c * c) ||
                (c * c == a * a + b * b);
    }
}