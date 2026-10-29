import java.util.Scanner;

public class q7areaequitriangle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println(" enter side 's' : ");
        int s =  in.nextInt();

      /*    System.out.println(" enter height : ");
        int height =  in.nextInt(); */

        float A = s*s *1.7320f / 4;
        System.out.println("Area of equilateral triangle is : " +A);
    }
    
}