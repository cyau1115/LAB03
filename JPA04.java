import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCost = 0;
        int mealCount = 0;

        System.out.println("Please enter mealdollars or enter -1 to stop");

        
        while (true) {
            double cost = scanner.nextDouble();
            if (cost == -1) {
                break;
            }
            totalCost += cost;
            mealCount++;
            System.out.println("Please enter mealdollars or enter -1 to stop");
        }


        double averageCost = totalCost / mealCount;

        System.out.println("餐点数量：" + mealCount);
        System.out.printf("所有餐点的总费用：%.2f\n", totalCost);
        System.out.printf("平均负担费用：%.2f\n", averageCost);
    }
}