public class Q263 {
    static void main() {
        System.out.println(isUgly(14));
    }
        static boolean isUgly(int n) {
            // Step 1: Base case check
            if (n <= 0) {
                return false;
            }

            // Step 2: Allowed prime factors
            int[] factors = {2, 3, 5};

            for (int i = 0; i < factors.length; i++) {
                int factor = factors[i]; // Get element at current index

                while (n % factor == 0) {
                    n /= factor;
                }
            }

            // Step 4: Final validation
            return n == 1;
        }
}
