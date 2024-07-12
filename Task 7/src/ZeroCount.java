import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Дан двухмерный массив размерностью 3×4.
 * Необходимо найти количество элементов значение которых
 * равно нулю.
 */
public class ZeroCount {
    public static int countZeros(List<List<Integer>> arr) {
        int count = 0;
        for (List<Integer> row : arr) {
            for (Integer elem : row) {
                if (elem == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(10, 28, 0, 13)),
                new ArrayList<>(Arrays.asList(0, 35, 81, 0)),
                new ArrayList<>(Arrays.asList(0, 9, 0, 0))
        ));

        int zeroCount = countZeros(arr);
        System.out.println(zeroCount);
    }
}




