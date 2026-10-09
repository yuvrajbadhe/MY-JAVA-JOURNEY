import java.util.Scanner;
public class q19cursurareacyl {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println(" enter radius r : ");
        int r =  in.nextInt();
         System.out.println(" enter height h : ");
        int h =  in.nextInt();

        float A = 2*r*h *22/7f ;
        System.out.println("Curved Surface Area of cylinder is : " +A);
    }
    
}