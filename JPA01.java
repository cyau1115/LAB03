import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int N = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("1+...+" + N + " = " + sum);
    }
}