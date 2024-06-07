import java.util.Scanner;

/**
 * Дано натуральное число n. Написать программу, которая вычисляет факториал неотрицательных целых
 * чисел n (т.е. число целое и больше 0). Формула вычисления факториала приведена ниже.
 */

public class FactorialCalculator {
    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для вычисления факториала: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Ошибка: Число должно быть неотрицательным.");
            return;
        }

        long factorial = calculateFactorial(n);

        System.out.println("Факториал числа " + n + " равен " + factorial);
    }
}
