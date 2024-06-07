import java.util.Scanner;

/**
 * На складе имеется определенное количество ящиков с яблоками (N>=0 — запрашивается у пользователя).
 * Необходимо освободить склад. Машины по очереди
 * подъезжают и забирают определенное количество ящиков. Определить сколько машин подъехало к складу.
 */
public class Warehouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество ящиков на складе: ");
        int numberOfBoxes = scanner.nextInt();

        int numberOfTrucks = 0;

        System.out.print("Введите количество ящиков, которые забирает одна машина: ");
        int boxesPerTruck = scanner.nextInt();

        while (numberOfBoxes > 0) {
            numberOfBoxes -= boxesPerTruck;
            numberOfTrucks++;
        }

        System.out.println("К складу подъехало " + numberOfTrucks + " машин(ы)");
    }
}
