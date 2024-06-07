import java.util.Scanner;

/**
 * Дана диагональ телевизора в дюймах. Написать программу, определяющую эту же диагональ в сантиметрах
 * (1 дюйм = 2.54 сантиметров).
 */

public class DiagonalInches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double INCH_TO_CM = 2.54;

        System.out.print("Введите диагональ телевизора в дюймах: ");
        double diagonalInInches = scanner.nextDouble();


        double diagonalInCm = diagonalInInches * INCH_TO_CM;

        System.out.println("Диагональ телевизора в сантиметрах: " + diagonalInCm);
    }
}