import java.util.Scanner;
public class q10cgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;

        while (true) { 
            
            System.out.print("Do you want to add Subject ( yes or no) : ");
            char choice = in.next().trim().charAt(0);

            if(choice == 'y'){

                System.out.print("Enter number of subjects : ");
                int num = in.nextInt();

            while(num> 0){

               System.out.print("Enter the name of Subject : ");
               String sub = in.next();
               System.out.print("Enter the credit earn : ");
               int c = in.nextInt();
               System.out.print("Enter the grade points : ");
               int g = in.nextInt();
               System.out.println("For subject " +sub+ " your credit is " +c+ " and grade is " +g);

                a = a + (c * g);
                b = b + c; 
               
                num--;
            }  
               if(b>0){
               float ans =(float) a/b ;
               System.out.println("Your cgpa is : "+ans);
               }else{
               System.out.println("Sum of credits can not be zero .");
               }
            
            }else if ( choice == 'n'){
                System.out.println("Ghee khatam ! ");
                break;
            }else{
                System.out.println("Invalid Input");
                break;
            } 
        }
    }   
}
