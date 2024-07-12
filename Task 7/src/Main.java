import java.util.Random;

/**
 * Дана квадратная матрица порядка n (n строк, n столбцов).
 * Найти наибольшее из значений элементов, расположенных в тёмно-синих частях матриц.
 */
public class Main {
    public static void main(String[] args) {
        final int N = 4;
        int[][] arr = new int[N][N];
        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = rand.nextInt(100);
            }
        }

        for (int[] matrix : arr) {
            for (int elem : matrix) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        int max = arr[0][0];

        for (int i = 0; i < N; ++i) {
            for (int j = i; j < N; ++j) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Maximum: " + max);
    }
}
