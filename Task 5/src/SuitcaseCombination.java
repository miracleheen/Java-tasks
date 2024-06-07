/**
 * На чемодане стоит трехзначный код. Он состоит из цифр, которые не повторяются.
 * Напишите программу, которая выведет все возможные такие комбинации цифр.
 * А также определите сколько времени понадобится для открытия чемодана в худшем случае,
 * если на один такой набор уходит 3 секунды.
 */

public class SuitcaseCombination {
    public static void main(String[] args) {
        int combinationsCount = 0;

        for (int i = 1; i <= 9; ++i) {
            for (int j = 0; j <= 9; ++j) {
                if (j != i) {
                    for (int k = 0; k <= 9; ++k) {
                        if (k != i && k != j) {
                            System.out.println("" + i + j + k);
                            ++combinationsCount;
                        }
                    }
                }
            }
        }

        int secondsRequired = combinationsCount * 3;

        System.out.println("Всего возможных комбинаций: " + combinationsCount);
        System.out.println("Время для открытия чемодана в худшем случае: " + secondsRequired + " секунд");
    }
}
