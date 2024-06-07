import java.util.Scanner;

/**
 *  Написать программу, которая выводит на экран —
 * следующую фигуру:
 *
 *  *    *    *
 *    *  *  *
 *      ***
 *    *******
 *      ***
 *    *  *  *
 *  *    *    *
 *
 * Ширина и высота фигуры запрашивается у пользователя как положительное нечетное число.
 */
public class StarFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите высоту фигуры:");
        int n = scanner.nextInt();

        System.out.println("Введите ширину фигуры:");
        int m = scanner.nextInt();

        while (n % 2 == 0 || m % 2 == 0) {
            System.out.println("\nВысота и ширина должны быть нечетными числами.");
            System.out.println("Введите высоту фигуры:");
            n = scanner.nextInt();
            System.out.println("Введите ширину фигуры:");
            m = scanner.nextInt();
        }

        // верхняя часть фигуры
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print("  ");
            }
            for (int j = 0; j < m - 2 * i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // середина фигуры
        for (int i = 0; i < n + m - 1; ++i) {
            System.out.print("*");
        }
        System.out.println();

        // нижняя часть фигуры
        for (int i = n / 2 - 1; i >= 0; --i) {
            for (int j = 0; j < i; ++j) {
                System.out.print("  ");
            }
            for (int j = 0; j < m - 2 * i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
