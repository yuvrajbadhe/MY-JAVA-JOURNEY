import java.util.Scanner;

public class q5areaparallelogram {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println(" enter base : ");
        int base =  in.nextInt();

         System.out.println(" enter height : ");
        int height =  in.nextInt();

        int A = base * height ;
        System.out.println("Area of parallelogram is : " +A);
    }
    
}