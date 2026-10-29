import java.util.Scanner;
public class q1Areacircle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println(" enter radius r : ");
        int r =  in.nextInt();
        float A = r*r*22/7f;
        System.out.println("Area of circle is : " +A);
    }
    
}
