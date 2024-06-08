import java.util.Scanner;

/**
 * Написать программу-калькулятор. Пользователь вводит
 * два числа и выбирает арифметическое действие (+, -,
 * *, /, максимум, минимум). Вывести на экран результат
 * действия.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculations = true;

        while (continueCalculations) {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.println("Выберите арифметическое действие:");
            System.out.println("1: Сложение (+)");
            System.out.println("2: Вычитание (-)");
            System.out.println("3: Умножение (*)");
            System.out.println("4: Деление (/)");
            System.out.println("5: Максимум (max)");
            System.out.println("6: Минимум (min)");
            System.out.print("Введите номер действия: ");
            int action = scanner.nextInt();

            double result = 0;
            boolean validAction = true;

            switch (action) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    if (Double.isNaN(result)) {
                        validAction = false;
                    }
                    break;
                case 5:
                    result = Math.max(num1, num2);
                    break;
                case 6:
                    result = Math.min(num1, num2);
                    break;
                default:
                    System.out.println("Некорректный выбор действия.");
                    validAction = false;
                    break;
            }

            if (validAction) {
                System.out.println("Результат: " + result);
            }

            System.out.print("Хотите выполнить еще одну операцию? (1 - да, 0 - нет): ");
            int continueInput = scanner.nextInt();
            continueCalculations = continueInput == 1;
            System.out.println();
        }
        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Ошибка: деление на ноль.");
            return Double.NaN;
        }
    }
}
