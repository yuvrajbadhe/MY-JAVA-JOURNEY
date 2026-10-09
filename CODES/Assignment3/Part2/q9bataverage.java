import java.util.Scanner;
public class q9bataverage{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("No. of innings : ");
        float i = in.nextFloat();
        System.out.print("Total runs scored : ");
        float r = in.nextFloat();
        System.out.print("Number of times remain Not Out : ");
        float no = in.nextFloat();
        
        float x = i - no ;
       
        float a = r/x ;
        System.out.println("Batting average of a player is  "+a);
    }
}