import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter one value: ");
            int n = scanner.nextInt();
            if (n >= 1 && n <= 10) {
                int factorial = calculateFactorial(n);
                System.out.println("The factorial of " + n + " is: " + factorial);
            } else {
                System.out.println("Error, the value is out of range.");
            }
        }
    }

  
    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}