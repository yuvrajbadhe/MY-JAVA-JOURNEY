//Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)


import java.util.Scanner;
public class q4operatorif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First number is : ");
        int num1 = input.nextInt();
        System.out.print("Second number is : ");
        int num2 = input.nextInt();
         System.out.print("Operator is : ");
        char operator = input.next().charAt(0);
       
       

        if(operator =='*'){
            int c = num1*num2;
            System.out.println("expression is : " +c);
        }
        else if (operator == '/'){
            int c= num1/num2;
            System.out.println("expression is : " +c);
        }
        else if (operator == '+'){
            int c = num1+num2;
            System.out.println("expression is : " +c);
        }
        else if (operator=='-'){
            int c = num1-num2;
            System.out.println("expression is : " +c);
        }
        else{
            System.out.println("Invalid operator " );
        }
    }
}
