import java.util.Random;
import java.util.Scanner;

/**
 * Дана температура воздуха за каждый день января.
 * Определить:
 * а) среднюю температуру за месяц;
 * б) сколько раз температура воздуха опускалась нижеуказанной метки.
 */

public class JanuaryTemperatureAnalysis {
    public static void main(String[] args) {
        Random random = new Random();
        int daysInJanuary = 31;
        int[] temperatures = new int[daysInJanuary];

        System.out.println("Температуры за каждый день января:");
        for (int day = 0; day < daysInJanuary; ++day) {
            temperatures[day] = random.nextInt(41) - 30;
            System.out.printf("День %d: %d°C%n", day + 1, temperatures[day]);
        }

        double averageTemperature = calculateAverageTemperature(temperatures);
        System.out.printf("%nСредняя температура за месяц: %.2f°C%n", averageTemperature);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите метку температуры: ");
        int threshold = scanner.nextInt();
        int belowThresholdCount = countDaysBelowThreshold(temperatures, threshold);
        System.out.printf("Количество дней с температурой ниже %d°C: %d%n", threshold, belowThresholdCount);
    }

    public static double calculateAverageTemperature(int[] temperatures) {
        int sum = 0;
        int length = temperatures.length;
        for (int temperature : temperatures) {
            sum += temperature;
        }
        return (double) sum / length;
    }

    public static int countDaysBelowThreshold(int[] temperatures, int threshold) {
        int count = 0;
        for (int temperature : temperatures) {
            if (temperature < threshold) {
                count++;
            }
        }
        return count;
    }
}
