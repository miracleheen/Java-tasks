import java.util.Scanner;

/**
 * Емкость аккумулятора смартфона составляет N мАч.
 * Написать программу, определяющую минимальную
 * емкость переносного зарядного устройства (powerbank),
 * если необходимо 3 полных заряда смартфона.
 */

public class PowerbankCapacityCalculator {
    public static int calculatePowerbankCapacity(int batteryCapacity) {
        return batteryCapacity * 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите емкость аккумулятора смартфона (мАч): ");

        if (scanner.hasNextInt()) {
            int batteryCapacity = scanner.nextInt();

            if (batteryCapacity > 0) {
                int requiredPowerbankCapacity = calculatePowerbankCapacity(batteryCapacity);

                System.out.println("Минимальная емкость powerbank для трёх полных зарядов: " + requiredPowerbankCapacity + " мАч");
            } else {
                System.out.println("Емкость аккумулятора должна быть положительным числом.");
            }
        } else {
            System.out.println("Пожалуйста, введите целое число.");
        }
    }
}
