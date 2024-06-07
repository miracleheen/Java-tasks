import java.util.Random;

/**
 * В массиве хранится информация о количестве жильцов
 * каждой квартиры пятиэтажного дома (4 подъезда, на
 * каждом этаже по 2 квартиры).
 * а) по выбранному номеру квартиры определить количество жильцов, а также их соседей проживающих
 * на одном этаже;
 * б) определить суммарное количество жильцов для
 * каждого подъезда;
 * в) определить номера квартир, где живут многодетные
 * семьи. Условно будем считать таковыми, у которых
 * количество членов семьи превышает пять человек.
 */

public class ApartmentInfo {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] apartments = new int[4][10];

        System.out.println("Количество жильцов в каждой квартире:");
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 10; ++j) {
                apartments[i][j] = random.nextInt(10) + 1;
                System.out.printf("Подъезд %d, Квартира %d: %d жильцов%n", i + 1, j + 1, apartments[i][j]);
            }
        }

        int apartmentNumber = random.nextInt(40) + 1;
        System.out.printf("%nВыбрана квартира № %d для демонстрации методов:%n%n", apartmentNumber);

        findResidentsAndNeighbors(apartmentNumber, apartments);

        calculateEntranceResidents(apartments);

        findLargeFamilies(apartments);
    }

    public static void findResidentsAndNeighbors(int apartmentNumber, int[][] apartments) {
        int entrance = (apartmentNumber - 1) / 10;
        int floor = ((apartmentNumber - 1) % 10) / 2;
        int position = (apartmentNumber - 1) % 2;

        System.out.println("Квартира № " + apartmentNumber + " находится в подъезде " + (entrance + 1) + " на " + (floor + 1) + " этаже.");
        System.out.println("Количество жильцов в выбранной квартире: " + apartments[entrance][floor * 2 + position]);

        System.out.println("Соседи на этом же этаже:");
        if (position == 0) {
            System.out.println("Квартира № " + (apartmentNumber + 1) + ": " + apartments[entrance][floor * 2 + 1] + " жильцов");
        } else {
            System.out.println("Квартира № " + (apartmentNumber - 1) + ": " + apartments[entrance][floor * 2] + " жильцов");
        }
    }

    public static void calculateEntranceResidents(int[][] apartments) {
        for (int entrance = 0; entrance < 4; ++entrance) {
            int totalResidents = 0;
            for (int i = 0; i < 10; ++i) {
                totalResidents += apartments[entrance][i];
            }
            System.out.println("Общее количество жильцов в подъезде " + (entrance + 1) + ": " + totalResidents);
        }
    }

    public static void findLargeFamilies(int[][] apartments) {
        System.out.println("Номера квартир, где живут многодетные семьи:");
        for (int entrance = 0; entrance < 4; ++entrance) {
            for (int i = 0; i < 10; ++i) {
                if (apartments[entrance][i] > 5) {
                    int apartmentNumber = entrance * 10 + i + 1;
                    System.out.println("Квартира № " + apartmentNumber + " с " + apartments[entrance][i] + " жильцами");
                }
            }
        }
    }
}