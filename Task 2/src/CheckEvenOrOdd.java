import java.util.Scanner;

/**
 * Напишите программу, проверяющую число, введенное с клавиатуры на четность.
 */
public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " четное.");
        } else {
            System.out.println("Число " + number + " нечетное.");
        }

        scanner.close();
    }
}