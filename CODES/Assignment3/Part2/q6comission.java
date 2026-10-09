import java.util.Scanner;
public class q6comission{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Total sales : ");
        float t = in.nextFloat();
        System.out.print("Enter money earned by salesperson : ");
        float m = in.nextFloat();
        
        float x = (m/t)*100 ;
        System.out.println("Comission Earned in percentage "+x);
      
    }
}