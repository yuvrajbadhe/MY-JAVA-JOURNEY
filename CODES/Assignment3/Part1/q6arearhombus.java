import java.util.Scanner;

public class q6arearhombus {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println(" enter diagonal d1 : ");
        int d1 =  in.nextInt();

         System.out.println(" enter diagonal d2 : ");
        int d2 =  in.nextInt();

        float A = d1 * d2  * 1/2f;
        System.out.println("Area of rhombus is : " +A);
    }
    
}