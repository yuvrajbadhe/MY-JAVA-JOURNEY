import java.util.Scanner;

public class q10periparallelogram {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println(" enter base : ");
        int base =  in.nextInt();

         System.out.println(" enter height : ");
        int height =  in.nextInt();

        int A =(base + height) *2 ;
        System.out.println("Perimeter of parallelogram is : " +A);
    }
    
}