import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("only operators like /,*,-,+,%, and you can over the programm by entering the value 'x'or 'X' . ");
        int ans = 0;
        while (true) {
            System.out.print("Enter the operator : ");
            char op = in.next().trim().charAt(0);
            
            if(op=='/' || op == '*' || op =='+' || op == '-' || op == '%'){
                System.out.print(" Enter two numbers : ");
                int a =in.nextInt();
                int b =in.nextInt();
                if(op == '*'){
                    ans = a*b;
                }
                 if(op == '-'){
                    ans = a- b;
                }
                 if(op == '+'){
                    ans = a+ b;
                }
                 if(op == '%'){
                    ans = a% b;
                }
                 if(op == '/'){
                    if(b!=0){
                        ans = a/ b;
                    }else{
                        System.out.println("Bhai zero se divide nahi hota , tuze pichla vala hi answer milega");
                        continue;                    }
               }

            } else if(op=='x' || op=='X'){
                    break;
                }
                else{
                      System.out.println("Invalid operator");
                }
              System.out.println(ans);
          
        }
    }
    }
    

