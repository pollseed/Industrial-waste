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
        if (m == 0 || m < n)
            throw new IllegalArgumentException();
        if (n == 0)
            return m;
        int remain = m % n;
        if (remain == 0)
            return n;
        return euclidDivision(n, remain);
    }
    
    /**
     * Whether prime
     * @param n
     * @return
     */
    public static boolean primalityTest(int n) {
        if (n < 2)
            return false;
        else if (n % 2 == 0)
            return true;
        for (int i = 3; i <= n / i; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
