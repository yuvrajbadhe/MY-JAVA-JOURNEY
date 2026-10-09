import java.util.Scanner;
public class q1Factorial{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        int a = 1 ;
        while(num>0){
            a=a*num;
            System.out.println(" aaaaaa : " +a);
            num--;
        }
        System.out.println(a);
    }
}