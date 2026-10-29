
import java.util.Scanner;

public class q3vote {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
          System.out.println("Enter your age : ");
          int age =in.nextInt();

          Age(age);
    }

    static void Age(int age){
        if (age >= 18){
            System.out.println("the person is eligible for voting .");
        }else{
            System.out.println("The person is under age ");
        }
        
    }
    
}
