import java.util.Scanner;
public class q4discount{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter price of Product : ");
        float price = in.nextFloat();
        System.out.print("Enter discount in percent : ");
        float discount = in.nextFloat();
        
        float x = price *discount/100 ;
        System.out.println("Discount is of "+x);
        float p = price - x ;
        System.out.println("Money you have to pay "+p);
    }
}