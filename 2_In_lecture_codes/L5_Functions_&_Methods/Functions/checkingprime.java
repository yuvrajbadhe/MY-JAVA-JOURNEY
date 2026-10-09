import java.util.Scanner;
public class checkingprime{
public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number : ");
            int n = in.nextInt();
            boolean ans = prime(n);
            System.out.println(ans);
            
}
     static boolean prime(int n){
        if(n<=1){
            return false;
        }
        int c= 2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return (c*c>n);
     }
}
