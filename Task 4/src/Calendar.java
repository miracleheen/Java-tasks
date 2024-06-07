import java.util.Scanner;

/**
 * Вывести на дисплей календарь на выбранный месяц  с учетом указанного номера дня недели для начала месяца.
 * Подсказка. Программу условно разбить на две части.
 * Первый цикл будет выводить нужное количество пустых клеток.
 * Второй же цикл начнет выводить календарь с первого дня по последний день в заданном месяце.
 * Переход на новую строку считать кратный семи с указанным смещением номера дня недели.
 *
 * Бонусное задание: определить количество выходных в заданном месяце.
 */

public class Calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер дня недели для начала месяца (0 - Понедельник, 1 - Вторник, ..., 6 - Воскресенье):");
        int startDay = scanner.nextInt();

        System.out.println("Введите номер месяца (1 - Январь, 2 - Февраль, ..., 12 - Декабрь):");
        int month = scanner.nextInt();

        int daysInMonth = switch (month) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };

        int weekends = 0;

        System.out.println("Пн Вт Ср Чт Пт Сб Вс");

        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((startDay + day) % 7 == 0 || day == daysInMonth) {
                System.out.println();
            }
            if ((startDay + day) % 7 == 6 || (startDay + day) % 7 == 0) {
                weekends++;
            }
        }

        System.out.println("Количество выходных дней в месяце: " + weekends);
    }
}
