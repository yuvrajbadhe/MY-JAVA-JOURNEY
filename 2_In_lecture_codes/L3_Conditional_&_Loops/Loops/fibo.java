import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value n : ");
        int n = in.nextInt();
        int a =0;
        int b =1;
        int count = 2;
        while(count<=n){
            int c = b;
            System.out.println("temp is : "+c);
            b =b +a ;
            System.out.println("b is : "+b);
            a =c ;
            System.out.println( " a is : "+a);
            count++;
        }
System.out.println("the nth number is " +b);
    }
    
}
