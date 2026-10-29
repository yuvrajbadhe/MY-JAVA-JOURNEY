import java.util.Scanner;

public class q9periequitriangle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println(" enter side 's' : ");
        int s =  in.nextInt();

      /*    System.out.println(" enter height : ");
        int height =  in.nextInt(); */

        float A = s*3;
        System.out.println("Perimeter of equilateral triangle is : " +A);
    }
    
}
