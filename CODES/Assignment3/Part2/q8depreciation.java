import java.util.Scanner;
public class q8depreciation{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter initial purchage Product : ");
        float i = in.nextFloat();
        System.out.print("Enter istimated scrap value : ");
        float s = in.nextFloat();
         System.out.print("Enter expected years: ");
        float y = in.nextFloat();
        
        float x = (i-s)/y ;
        System.out.println("Depreciation value of product in "+y+ " years will be " +x);
     
    }
}
