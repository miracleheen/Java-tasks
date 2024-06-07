/**
 * Создать программу, которая выводит на экран простые
 * числа в диапазоне от 2 до 1000. (Число называется
 * простым, если оно делится только на 1 и на само себя
 * без остатка; причем число 1 простым не считается).
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        for (int number = 2; number <= 1000; ++number) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); ++i) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}
