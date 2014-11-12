public class Algorithm {

    // test method
    private static void fizzBuzz() {
        for (int i = 0; i <= 100; i++) {
            if (i == 0)
                continue;
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FIZZBUZZ");
            else if (i % 3 == 0)
                System.out.println("FIZZ");
            else if (i % 5 == 0)
                System.out.println("BUZZ");
            else
                System.out.println(i);
        }
    }

    /**
     * Returns the greatest common divisor of the specified value
     * @param a
     * @param b
     * @return
     */
    public static int euclidDivision(int a, int b) {
        int remain = a % b;
        if (remain == 0) {
            return b;
        }
        return euclidDivision(b, remain);
    }
}
