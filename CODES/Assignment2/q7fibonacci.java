//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;
public class q7fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = input.nextInt();

        int a=0;
        int b=1;
      
        int count=0;
       while(count<n){
         System.out.print(a + " ");
         int c = a+b;
         a=b;
         b=c;
         count++;
       }
    }
}
