public class Q3270{
    public static void main(String[] args) {
        int ans = generateKey(169,711,12);
        System.out.println(ans);
    }

    static int generateKey(int num1, int num2, int num3) {
        // int key = 0;
        // int place = 1;

        // // Extract and compare digits right-to-left across 4 positions
        // for (int i = 0; i < 4; i++) {
        //     int d1 = num1 % 10;
        //     int d2 = num2 % 10;
        //     int d3 = num3 % 10;

        //     int minDigit = Math.min(d1, Math.min(d2, d3));
        //     key += minDigit * place;

        //     num1 /= 10;
        //     num2 /= 10;
        //     num3 /= 10;
        //     place *= 10;
        // }

        // return key;


        return Math.min(num1/1000, Math.min(num2/1000, num3/1000)) * 1000 + Math.min(num1/100 % 10, Math.min(num2/100 % 10, num3/100 % 10)) * 100 + Math.min(num1/10 % 10, Math.min(num2/10 % 10, num3/10 % 10)) * 10 + Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10));
    }
}
