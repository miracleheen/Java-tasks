public class ErrorDetection {
    public static void main(String[] args) {
        double[] arr = {-5.7, 6.0, 2, 0, -4.7, 6,
                8.1, -4, 0};

        double positive = 0.0D;
        double negative = 0.0D;

        for (double v : arr) {
            if (v > 0) {
                positive = v;
            } else if (v < 0 && v < negative) {
                negative = v;
            }
        }

        System.out.println("Last positive number: " + positive);
        System.out.println("First negative number:  " + negative);
    }
}