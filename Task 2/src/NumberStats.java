import java.util.Scanner;

/**
 * Дано натуральное число а (a<100). Напишите про
 * грамму, выводящую на экран количество цифр в этом
 * числе и сумму этих цифр
 */
public class NumberStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.print("Введите натуральное число (меньше 100): ");
            number = scanner.nextInt();

            if (number >= 100) {
                System.out.println("Число должно быть меньше 100.");
            } else if (number <= 0) {
                System.out.println("Число должно быть больше нуля.");
            }
        } while (number >= 100 || number <= 0);

        int digitCount = String.valueOf(number).length();
        int sumOfDigits = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            sumOfDigits += tempNumber % 10;
            tempNumber /= 10;
        }

        System.out.println("Количество цифр в числе: " + digitCount);
        System.out.println("Сумма цифр числа: " + sumOfDigits);

        scanner.close();
    }
}
