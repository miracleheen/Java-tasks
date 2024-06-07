import java.util.Random;

/**
 * В массиве хранится информация о стоимости 10 марок
 * автомобилей. Определить сумму наиболее дорогого
 * автомобиля и узнать его номер. Если таких автомобилей несколько, определить:
 * а) номер первого такого автомобиля;
 * б) номер последнего такого автомобиля.
 */

public class CarPriceAnalysis {
    public static void main(String[] args) {
        Random random = new Random();
        int numCars = 10;
        int[] carPrices = new int[numCars];

        System.out.println("Стоимость автомобилей:");
        for (int i = 0; i < numCars; ++i) {
            carPrices[i] = random.nextInt(50000) + 123456;
            System.out.printf("Автомобиль %d: %d%n", i + 1, carPrices[i]);
        }

        int maxPrice = carPrices[0];
        for (int price : carPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }

        int firstMaxIndex = -1;
        int lastMaxIndex = -1;
        for (int i = 0; i < numCars; ++i) {
            if (carPrices[i] == maxPrice) {
                if (firstMaxIndex == -1) {
                    firstMaxIndex = i;
                }
                lastMaxIndex = i;
            }
        }

        System.out.printf("%nНаибольшая стоимость автомобиля: %d%n", maxPrice);
        System.out.printf("Номер первого автомобиля с максимальной стоимостью: %d%n", firstMaxIndex + 1);
        System.out.printf("Номер последнего автомобиля с максимальной стоимостью: %d%n", lastMaxIndex + 1);
    }
}
