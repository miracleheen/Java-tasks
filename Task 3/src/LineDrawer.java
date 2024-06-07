import java.util.Scanner;

/**
 * Разработать программу, которая выводит на экран горизонтальную линию из символов. Число символов, какой
 * использовать символ, и какая будет линия — вертикальная, или горизонтальная — указывает пользователь
 */

public class LineDrawer {
    public static void drawHorizontalLine(int length, char symbol) {
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    public static void drawVerticalLine(int length, char symbol) {
        for (int i = 0; i < length; i++) {
            System.out.println(symbol);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество символов: ");
        int length = scanner.nextInt();

        System.out.print("Введите символ для отображения: ");
        char symbol = scanner.next().charAt(0);

        System.out.println("Выберите тип линии:");
        System.out.println("1. Горизонтальная");
        System.out.println("2. Вертикальная");
        System.out.print("Ваш выбор: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                drawHorizontalLine(length, symbol);
                break;
            case 2:
                drawVerticalLine(length, symbol);
                break;
            default:
                System.out.println("Некорректный выбор. Программа завершена");
        }
    }
}