
import java.util.Scanner;

public class q9Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        
        Factorial(n);

    } 
      static void Factorial(int n){

        if(n<0){
            System.out.println(" Factorial is undefined for negative numbers");
        }
        int x = 1;
        if(n>0){
        for(int i =1 ; i<=n ; i++){
            x =x *i ;

        }
        System.out.println(" the factorial is : "+x);
    }
      }
    
}
