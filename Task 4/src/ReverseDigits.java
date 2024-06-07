import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры число больше нуля,
 * необходимо вывести все его цифры, начиная с конца.
 * Примечание. Например, пользователь ввел число
 * 12345. На экране должно появиться число наоборот — 54321.
 */

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.print("Введите число больше нуля: ");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Число должно быть больше нуля.");
            }
        } while (number <= 0);

        System.out.println("Цифры числа в обратном порядке:");
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }
    }
}