public class Q504 {
    static void main() {
        int n = 49;
        String Ans = convertToBase7(n);
        System.out.println(Ans);
    }

        static String convertToBase7(int num) {
            int x = num ;
            if(num == 0 ){
                String str = String.valueOf(0);
                return str;
            }
            // if(num == -7){
            //     int m = -10 ;
            //      String str = String.valueOf(m);
            //     return str;
            // }
            if(num % 7 == 0){
                if(num<0){
                    x = -1 * num ;
                }
                int z = 0;
//                int count = 0 ;
                while (x > 0){
                    int y = x / 7 ;
                    z = z*10 + (x % 7) ;
                    x = y ;
//                    count ++ ;
                }
                int y = 0 ;
                while(z > 0){
                    y = y * 10 + (z % 10 );
                    z= z / 10 ;
                }
                if(num< 0){
                    y = -1 * y ;
                }
//                if(num / 10 < 1) {
//                    y = y * 10;
//                }
//                if(num /10 >= 1 & num / 10 <10){
//                    y = y *100 ;
//                }
                int n = num ;
                int s = 0;
                int e = n;
                int count = 0 ;



                while (s <= e) {
                    int m = s + (e - s) / 2;

                    if (m * m == n) {
                         count = m;
                    }

                    if (m * m > n) {
                        e = m - 1;
                    } else {
                        s = m + 1;

                    }
                }
                double result = Math.pow(7, count);
                if(result == num) {
                    for (int i = 1; i <= count; i++) {
                        y = y * 10;
                    }
                }else{
                    y = y * 10 ;
                }


                String str = String.valueOf(y);
                return str;
            }
            if(num<0){
                x = -1 * num ;
            }
            int z = 0;
            while (x > 0){
                int y = x / 7 ;
                z = z*10 + (x % 7) ;
                x = y ;
            }
            int y = 0 ;
            while(z > 0){
                y = y * 10 + (z % 10 );
                z= z / 10 ;
            }
            if(num< 0){
                y = -1 * y ;
            }
            String str = String.valueOf(y);
            return str;
        }
}