import java.util.Scanner;

/**
 * Известно, что 1 дюйм равен 2.54 см. Разработать при
 * ложение, переводящие дюймы в сантиметры и наоборот.
 * Диалог с пользователем реализовать через систему меню.
 */
public class InchConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Меню:");
            System.out.println("1. Перевести дюймы в сантиметры");
            System.out.println("2. Перевести сантиметры в дюймы");
            System.out.println("3. Выйти из программы");
            System.out.print("Выберите опцию: ");

            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    convertInchesToCentimeters();
                    break;
                case 2:
                    convertCentimetersToInches();
                    break;
                case 3:
                    System.out.println("Выход из программы...");
                    break;
                default:
                    System.out.println("Некорректный ввод. Попробуйте снова.");
            }
            System.out.println();
        } while (choice != 3);

        scanner.close();
    }

    public static void convertInchesToCentimeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите количество дюймов: ");
        double inches = scanner.nextDouble();
        double centimeters = inches * 2.54;
        System.out.println(inches + " дюймов = " + centimeters + " сантиметров");
    }

    public static void convertCentimetersToInches() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите количество сантиметров: ");
        double centimeters = scanner.nextDouble();
        double inches = centimeters / 2.54;
        System.out.println(centimeters + " сантиметров = " + inches + " дюйм");
    }
}
