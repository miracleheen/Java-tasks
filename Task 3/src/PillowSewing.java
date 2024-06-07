import java.util.Scanner;

/**
 * У швеи имеется ткань длиной L. Ей необходимо пошить подушки длиной P. Условно договоримся, что
 * ширина ткани совпадает с шириной подушки. Определить сколько подушек сможет пошить швея, если
 * умножать и делить она не умеет
 */
public class PillowSewing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину ткани: ");
        int fabricLength = scanner.nextInt();

        System.out.print("Введите длину подушки: ");
        int pillowLength = scanner.nextInt();

        int pillowCount = 0;

        while (fabricLength >= pillowLength) {
            fabricLength -= pillowLength;
            pillowCount++;
        }

        System.out.println("Швея сможет пошить " + pillowCount + " подушек");
    }
}
