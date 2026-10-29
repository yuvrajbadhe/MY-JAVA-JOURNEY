
import java.util.Scanner;

public class q2even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num = in.nextInt();
        // int ans = checking(num);
        // System.out.println(checking);

        checking(num);
    }
    static void checking(int num){
        if (num%2 == 0){
            System.out.println("THE number is even.");
        }
        if (num%2 != 0){
              System.out.println("THE number is odd.");
        }
    }
    
}
