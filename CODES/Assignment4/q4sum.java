
import java.util.Scanner;

public class q4sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          System.out.print("enter num 1 : ");
          int n1 = in.nextInt();
          System.out.print("enter num 2 : ");
          int n2 =in.nextInt();

          Sum(n1 , n2);


    }
    static void Sum(int n1 , int n2){
        int s = n1 + n2 ;
        System.out.println("the sum of n1 and n2 is "+s);
    }
    
}
