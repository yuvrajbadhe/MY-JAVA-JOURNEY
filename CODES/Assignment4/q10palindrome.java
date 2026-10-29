import java.util.Scanner;

public class q10palindrome {
    public static void main(String[] args) {
        
     Scanner in = new Scanner(System.in); 
       System.out.print("give number: ");      
        int x= in.nextInt();
       
       Palindrome(x);
        
}     
    static void Palindrome(int x){
         int count = 0;
        int n = x;
        while(n>0){
            int rem = n% 10;
            
                // count++;
                // System.out.print(rem); 
            
            n=n/10;
            count = count * 10 +rem;

        }
         System.out.println("The reversed number is : "+count);
        
        if(x== count ){
            System.out.println("the number is palindrome");
        }else{
            System.out.println("the number is not  palindrome");
        }
    }
    
}