import java.util.Scanner;

public class q3areaisotriangle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println(" enter base : ");
        int base =  in.nextInt();

         System.out.println(" enter height : ");
        int height =  in.nextInt();

        float A = base * height * 1/2f;
        System.out.println("Area of isosceles triangle is : " +A);
    }
    
}
    
