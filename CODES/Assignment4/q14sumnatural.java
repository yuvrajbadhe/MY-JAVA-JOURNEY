
import java.util.Scanner;

public class q14sumnatural {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          System.out.print("enter n'th : ");
          int n = in.nextInt();
         

          Sum(n);


    }
    static void Sum(int n){
        int x =0 ;
        for(int i =1 ; i<=n ; i++){
            x =x +i ;
        }
        System.out.println("the sum of "+ n+ " natural numbers is " +x);
    }
    
}