
import java.util.Scanner;

public class q7prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          System.out.print("enter the number : ");
          int n = in.nextInt();
       
          boolean ans = Prime(n);
          System.out.println(ans);


    }
    static boolean Prime(int n){
          if (n<= 1){
            return false;
          }
          int c = 2;
           while(c*c <= n){
            if( n%c == 0){
                return false;
            }
            c++;
        }
          return (c *c > n);

    }
    
}