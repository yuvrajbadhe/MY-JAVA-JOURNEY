import java.util.Scanner;
public class q17volsphere {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println(" enter radius r : ");
        int r =  in.nextInt();
        float A = r*r*r *22/7f * 4/3f;
        System.out.println("Volume of sphere is : " +A);
    }
    
}
