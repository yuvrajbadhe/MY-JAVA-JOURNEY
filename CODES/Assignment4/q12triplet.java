
import java.util.Scanner;

public class q12triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
              System.out.println("Enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        max(a, b, c);
        
        
          
    }
     static void max(int a, int b ,int c){
         int max = a;
         int max2 ;
         if (b >max){
            max = b;

         }
         if(c>max){
            max = c;
         }
        // System.out.println("Max value is : "+max);
        int min = a;
         if (b <min){
            min = b;
         }
         if(c<min){
            min = c;
         }

         max2 = a+b+c - max - min ;

        if(max * max == max2*max2 + min* min){
            System.out.println("this three numbers are pythagorean triplet");
        }else{
            System.out.println("No , I'm Sorry");
        }

        
      }
        
    }
    

