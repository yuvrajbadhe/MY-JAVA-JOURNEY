import java.util.Scanner;
public class q2Electricitybill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter power in Watts : ");
        float P = in.nextFloat();
         System.out.print("Enter Hours used daily : ");
        float H = in.nextFloat();
         System.out.print("Enter Number of days : ");
        float D = in.nextFloat();

        float E = P*H*D/1000f;
         System.out.println("Energy Consumed : " +E);

        float fi = 10 ;
        float Tax = 4;
        float tr = E * 0.15f;
        float TEB = (E *tr )+ fi+Tax ;
    
        System.out.print("Total electricity bill : " +TEB);
    }
    
}
