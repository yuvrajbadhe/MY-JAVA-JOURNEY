public class Q202 {
    static void main() {
        System.out.println(isHappy(18));
    }
         static boolean isHappy(int n) {
            int slow = n;
            int fast = getNext(n);
            int count =0;

            while (fast != 1 && slow != fast) {
                slow = getNext(slow);
                fast = getNext(getNext(fast));
                count++ ;
            }
//             return count ;
            return fast == 1;
        }

         static int getNext(int n) {
            int totalSum = 0;
            while (n > 0) {
                int d = n % 10;
                n = n / 10;
                totalSum += d * d;

            }
            return totalSum;
        }

}
