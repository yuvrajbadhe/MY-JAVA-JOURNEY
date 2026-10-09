//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;
public class q2inputname {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the name : ");
    String name = input.nextLine();
  System.out.println("Hi " + name + " , I hope this message finds you well. I am reaching out regarding...");
}    
}
