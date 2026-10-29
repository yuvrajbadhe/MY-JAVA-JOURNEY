//Write a program to input principal, time, and rate (P, T, R) from the user and
//find Simple Interest.

import java.util.Scanner;
public class q3simpleinterst {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the value of principle P : ");
        float P = input.nextInt();
         System.out.print("Enter the value of Rate R : ");
        float R = input.nextInt();
         System.out.print("Enter the value of Time T : ");
        float T = input.nextInt();
        float SI = (P*R*T)/100;
         System.out.print("Simple interest is : " +SI);
    }
}
