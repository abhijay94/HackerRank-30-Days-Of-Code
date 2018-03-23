import java.util.Scanner;

public class Day02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        long totalCost;
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        totalCost = calculateTotalMealCost(meal_cost,tip_percent,tax_percent);
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }

    private static long calculateTotalMealCost(double meal_cost, int tip_percent, int tax_percent) {
        return Math.round(meal_cost*(1 + (tip_percent/100.0) + (tax_percent/100.0)));
    }
}
