package oops_2_code.staticExample;



public class leetco {
    public static void main(String[] args) {
        Solution solution = new Solution();
       boolean ans = solution.isUgly(13);
       System.out.println(ans);
    }
}
class Solution {
    public boolean isUgly(int n) {
      if (n <= 0) {
            return false;
        }

        int[] factors = {2, 3, 5};
          for (int i = 0; i < factors.length; i++) {
                int factor = factors[i];
                while (n % factor == 0) {
                    n /= factor;
                }
            }

        return n == 1;
    }
}