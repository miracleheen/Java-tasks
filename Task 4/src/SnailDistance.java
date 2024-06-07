import java.util.Scanner;

/**
 * В первый день улитка проползла 15 см. Каждый следующий день она проползала на 2 см дальше. Определить
 * какое общее расстояние проползет улитка через N дней.
 * Примечание: Например, пользователь ввел число 4. Следовательно, улитка ползла 4 дня, поэтому
 * суммарный путь составит 72 см.
 */

public class SnailDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество дней: ");
        int days = scanner.nextInt();

        int totalDistance = 0;

        for (int day = 1; day <= days; ++day) {
            int distance = 15 + (2 * (day - 1));
            totalDistance += distance;
        }

        System.out.println("Общее расстояние, пройденное улиткой за " + days + " дней: " + totalDistance + " см");
    }
}
