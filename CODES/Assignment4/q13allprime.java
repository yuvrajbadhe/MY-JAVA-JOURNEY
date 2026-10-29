
import java.util.Scanner;

public class q13allprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          System.out.print("enter the smaller number : ");
          int n = in.nextInt();
           System.out.print("enter the greater number : ");
          int m = in.nextInt();

       
           Prime(n,m);

    }
    static void Prime(int n ,int m){
          
        while(n<=m){
        if (n<= 1){
            break;
          }
          int c = 2;
           while(c*c <= n){
            if( n%c == 0){
               break;
            }
            c++;
        }
          if(c *c > n){
            System.out.println("the number is prime : " +n);
          }
          n++;
        }
        
    }
    
}