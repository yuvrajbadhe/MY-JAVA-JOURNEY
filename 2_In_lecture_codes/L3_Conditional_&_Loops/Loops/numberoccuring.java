import java.util.Scanner;
public class numberoccuring {
    public static void main(String[] args) {
      
      /*    int n= 552;
        int count = 0;
       while(n>0){
            int rem = n% 10;
            if(rem==5){
                count++;
                System.out.println(count); 
            }
            n=n/10;
        } */
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number : ");
       long n  = in.nextLong();
        System.out.print("Enter the number to count : ");
        int i  = in.nextInt(); 

         int count = 0;
        while(n>0){
            long rem =(long) n% 10;
            if(rem==i){
                count++;
                // System.out.println(count); 
            }
            n=n/10;
        }
        System.out.println("final : " +count);
    }
    
}
