import java.util.Random;

/**
 * Заполнить два целочисленных массива A[10] и B[10].
 * Сформировать третий массив X[20], элементы которого будут взяты из A и B в порядке:
 * а) чередования (a0, b0, a1, b1, a2, b2, …, a9, b9);
 * б) следования (a0, a1, a2,…, a9, b0, b1, b2,…, b9)
 */

public class ArrayFormation {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;
        int[] A = new int[size];
        int[] B = new int[size];

        System.out.println("Массив A:");
        for (int i = 0; i < size; ++i) {
            A[i] = random.nextInt(100);
            System.out.print(A[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Массив B:");
        for (int i = 0; i < size; ++i) {
            B[i] = random.nextInt(100);
            System.out.print(B[i] + " ");
        }
        System.out.println("\n");

        int[] X1 = new int[size * 2];
        for (int i = 0; i < size; ++i) {
            X1[2 * i] = A[i];
            X1[2 * i + 1] = B[i];
        }

        System.out.println("Массив X в порядке чередования:");
        for (int x : X1) {
            System.out.print(x + " ");
        }
        System.out.println("\n");

        int[] X2 = new int[size * 2];
        for (int i = 0; i < size; ++i) {
            X2[i] = A[i];
            X2[i + size] = B[i];
        }

        System.out.println("Массив X в порядке следования:");
        for (int x : X2) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
