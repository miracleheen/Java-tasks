import java.util.Scanner;

/**
 * Написать программу, которая для чисел в диапазоне
 * от A до B определяла количество их делителей. К примеру, A = 10, B = 15.
 * Делители для числа 10 — 1 2 5 10;
 * Делители для числа 11 — 1 11;
 * Делители для числа 12 — 1 2 3 4 6 12;
 * Делители для числа 13 — 1 13;
 * Делители для числа 14 — 1 2 7 14;
 * Делители для числа 15 — 1 3 5 15
 */
public class DivisorsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начало диапазона (A): ");
        int A = scanner.nextInt();

        System.out.print("Введите конец диапазона (B): ");
        int B = scanner.nextInt();
        System.out.println();

        for (int number = A; number <= B; ++number) {
            System.out.print("Делители для числа " + number + " — ");

            for (int divisor = 1; divisor <= number; ++divisor) {
                if (number % divisor == 0) {
                    System.out.print(divisor + " ");
                }
            }

            System.out.println();
        }
    }
}