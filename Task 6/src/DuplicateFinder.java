import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Написать программу, которая находит в массиве значения, повторяющиеся два и более раз, и показывает
 * их на экран.
 */
public class DuplicateFinder {
    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = 20;
        int[] numbers = new int[arraySize];

        System.out.println("Массив чисел:");
        for (int i = 0; i < arraySize; ++i) {
            numbers[i] = random.nextInt(10) + 5;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        findAndPrintDuplicates(numbers);
    }

    public static void findAndPrintDuplicates(int[] numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int number : numbers) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        System.out.println("Повторяющиеся значения:");
        boolean hasDuplicates = false;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " повторяется " + entry.getValue() + " раз(а)");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("Нет повторяющихся значений.");
        }
    }
}
