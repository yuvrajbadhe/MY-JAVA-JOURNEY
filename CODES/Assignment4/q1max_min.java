import java.util.Scanner;
public class q1max_min{
        public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = max(a,b,c);
        System.out.println(max);
        int min = min(a,b,c);
        System.out.println(min);
          
    }
         static int max(int a, int b ,int c){
         int max = a;
         if (b >max){
            max = b;
         }
         if(c>max){
            max = c;
         }
        // System.out.println("Max value is : "+max);
        return max;
      }
    
        static int min(int a, int b ,int c){
         int min = a;
         if (b <min){
            min = b;
         }
         if(c<min){
            min = c;
         }
        // System.out.println("Min value is : "+min);
         return min;

      }
      

}