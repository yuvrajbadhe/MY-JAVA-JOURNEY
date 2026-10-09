import java.util.Scanner;
public class q11compound{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter initial amount deposited or borrowed : ");
        float p = in.nextFloat();
        System.out.print("Enter annual interest  : ");
        float r = in.nextFloat();
         System.out.print("Enter Compounding Frequency (Annually = 1, Quarterly = 4, Monthly = 12, Daily = 365) : ");
        double n = in.nextFloat();
        System.out.print("Enter time in years : ");
        double t = in.nextFloat();

        double x  =  (1 + r/n) ;

        double y = Math.pow(x,n*t);
        double A = y *p ;

        System.out.println("Compound interest in "+t+ " years will be " +A);
     
    }
}
