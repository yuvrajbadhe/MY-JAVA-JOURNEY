
import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPowerOfThree( n) ;
        System.out.println(ans );
    }
    
    static boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        } else if (n<2) {
            return false;
        }
        if(n%3==0){
        return isPowerOfThree(n/3);
        } else {
            return false;
        }


    //   int x =0 ;
    //  while(x<n){
    //     if(Math.pow(3,x) < n){
    //         x++ ;
    //     }
    //     if (Math.pow(3,x)> n){
    //         return false ;
    //     }
    //     if (Math.pow (3,x) == n){
    //         return true;
    //     }
    //  }
    //       return Math.pow(3,x) == n ;
    
    }
}

