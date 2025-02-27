import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("請輸入兩個數m、n（以空格分隔）：");
            int m = scanner.nextInt();
            if (m == 999) {
                break;
            }
            int n = scanner.nextInt();

            double result = calculatePower(m, n);
            System.out.println(m + " 的 " + n + " 次方為：" + result);
        }
    }

    
    public static double calculatePower(int m, int n) {
        return Math.pow(m, n);
    }
}