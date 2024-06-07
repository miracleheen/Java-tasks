import java.util.Scanner;

/**
 * В конце мая фирма формирует отчет по заработной плате 12 сотрудников за весенний квартал.
 * Написать программу, которая будет запрашивать сумму заработной платы каждого сотрудника за
 * Март, Апрель и Май. Необходимо определить:
 * ■ выплату по каждому сотруднику за квартал;
 * ■ общую выплату по всем сотрудникам за квартал.
 */

public class SalaryReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeesCount = 12;

        double totalPayment = 0;

        for (int i = 1; i <= employeesCount; ++i) {
            System.out.println("Введите заработную плату сотрудника " + i + " за Март:");
            double salaryMarch = scanner.nextDouble();

            System.out.println("Введите заработную плату сотрудника " + i + " за Апрель:");
            double salaryApril = scanner.nextDouble();

            System.out.println("Введите заработную плату сотрудника " + i + " за Май:");
            double salaryMay = scanner.nextDouble();

            double quarterlyPayment = salaryMarch + salaryApril + salaryMay;
            System.out.println("Выплата по сотруднику " + i + " за квартал: " + quarterlyPayment);

            totalPayment += quarterlyPayment;
        }

        System.out.println("Общая выплата по всем сотрудникам за квартал: " + totalPayment);
    }
}
