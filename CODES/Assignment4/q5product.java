
import java.util.Scanner;

public class q5product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          System.out.print("enter num 1 : ");
          int n1 = in.nextInt();
          System.out.print("enter num 2 : ");
          int n2 =in.nextInt();

          Product(n1 , n2);


    }
    static void Product(int n1 , int n2){
        int s = n1 * n2 ;
        System.out.println("the product of n1 and n2 is "+s);
    }
    
}