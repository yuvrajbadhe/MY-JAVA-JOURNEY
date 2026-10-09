import java.util.Scanner;
public class q13sumonNnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the the n'th number : ");
        int n =in.nextInt();
        int Sum =0 ;
       /*  
        int Sum = n*(n+1)/2 ;
        System.out.println("sum of n numbers is : "+Sum);
 */
        for(int i =1; i<=n; i++){
           
           Sum = Sum + i;
        }
        System.out.println("sum of n numbers is : "+Sum);
    }
}
