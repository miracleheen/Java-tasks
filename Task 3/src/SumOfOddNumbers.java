import java.util.Scanner;

/**
 *  Написать программу, которая находит сумму всех
 *  целых нечетных чисел в диапазоне, указанном пользователем.
 */
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начало диапазона: ");
        int start = scanner.nextInt();

        System.out.print("Введите конец диапазона: ");
        int end = scanner.nextInt();

        int sum = 0;

        for (int number = start; number <= end; number++) {
            if (number % 2 != 0) {
                sum += number;
            }
        }

        System.out.println("Сумма всех нечетных чисел в диапазоне от " + start + " до " + end + " равна " + sum);
    }
}
