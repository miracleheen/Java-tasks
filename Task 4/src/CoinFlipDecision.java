import java.util.Random;

/**
 * Для принятия решения студент Д. подбрасывал монетку
 * 9 раз. Если в результате количество выпавших монеток
 * стороной «орел» было четным числом, принимал решение в положительную сторону, иначе в отрицательную.
 * Напишите программу, которая 9 раз запрашивает число 1 или 0 (орел/решка) и выдает соответствующий
 * результат решения проблемы студента Д.
 */

public class CoinFlipDecision {
    public static void main(String[] args) {
        Random random = new Random();
        int headsCount = 0;

        for (int i = 1; i <= 9; i++) {
            int result = random.nextInt(2);

            if (result == 1) {
                headsCount++;
            }
        }

        if (headsCount % 2 == 0) {
            System.out.println("Студент принимает решение в положительную сторону.");
        } else {
            System.out.println("Студент принимает решение в отрицательную сторону.");
        }
    }
}
