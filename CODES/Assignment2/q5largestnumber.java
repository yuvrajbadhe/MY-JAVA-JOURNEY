//Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class q5largestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter the num2 : ");
        int num2 = input.nextInt();
         if( num1>num2){
            System.out.println("The greater number is "+num1);
         }
         else if (num1==num2){
            System.out.println("Both are equal");
         }
        else{
             System.out.println("The greater number is "+num2);
        } 
    }
}
