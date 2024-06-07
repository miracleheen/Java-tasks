import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры число, необходимо
 * показать на экран сумму его цифр.
 * Примечание. Например, пользователь ввел число
 * 12345. На экране должно появиться сообщение о том, что сумма цифр числа 15.
 */

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int sum = 0;
        int digit;

        if (number < 0) {
            number *= -1;
        }

        while (number > 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Сумма цифр числа равна: " + sum);
    }
}
