import java.util.Scanner;

public class HamsterFoodCalculator {
    public static double calculateFood(int dailyFoodAmount) {
        final int DAYS = 30;
        final int GRAMS_IN_KILOGRAM = 1000;
        return (dailyFoodAmount * DAYS) / (double) GRAMS_IN_KILOGRAM;
    }

    private static int getDailyFoodAmount(Scanner scanner) {
        int dailyFoodAmount = -1;
        while (dailyFoodAmount <= 0) {
            System.out.print("Введите количество корма (грамм), съедаемого хомячком за один день: ");
            if (scanner.hasNextInt()) {
                dailyFoodAmount = scanner.nextInt();
                if (dailyFoodAmount <= 0) {
                    System.out.println("Количество корма должно быть положительным числом.");
                }
            } else {
                System.out.println("Пожалуйста, введите целое число.");
                scanner.next();
            }
        }
        return dailyFoodAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dailyFoodAmount = getDailyFoodAmount(scanner);

        // Вычисляем количество корма на 30 дней
        double totalFoodInKg = calculateFood(dailyFoodAmount);

        System.out.println("Количество корма, необходимого на 30 дней: " + totalFoodInKg + " кг");
    }
}
