import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("請輸入兩個數m、n（以斷行分隔）：");
            int m = scanner.nextInt();
            if (m == 999) {
                break;
            }
            int n = scanner.nextInt();

            int gcd = calculateGCD(m, n);
            System.out.println("最大公因數：" + gcd);
        }
    }

    
    public static int calculateGCD(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }
}