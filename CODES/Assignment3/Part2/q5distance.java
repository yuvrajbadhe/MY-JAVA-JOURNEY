import java.util.Scanner;
public class q5distance{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the x1 coordinate: ");
        float x1= in.nextFloat();

         System.out.print("Enter the y1 coordinate: ");
        float y1= in.nextFloat();

         System.out.print("Enter the x2 coordinate: ");
        float x2= in.nextFloat();

         System.out.print("Enter the y2 coordinate: ");
        float y2= in.nextFloat();
        
        float x = (x2 - x1) * (x2 - x1) ;
        float y =  (y2 - y1) * (y2 - y1);

        float d = x + y;
        double result = Math.sqrt(d);

        System.out.println("Distance between two poiny is "+result);
    }
}