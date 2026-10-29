
import java.util.Scanner;

public class q6circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          System.out.print("enter radius of circle : ");
          int r = in.nextInt();
          

          Circle(r);


    }
    static void Circle(int r){
        float cir = (float)2 *r * 22/7 ;
        System.out.println("the circumference of circle is : " +cir);
         float area = (float) r *r * 22/7 ;
        System.out.println("the area of circle is : " +area);
    }
    
}