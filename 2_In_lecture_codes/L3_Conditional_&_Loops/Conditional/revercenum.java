import java.util.Scanner;
public class revercenum {
   
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in); 
       System.out.print("give number: ");      
        int n= in.nextInt();
       
        int count = 0;
        while(n>0){
            int rem = n% 10;
            
                // count++;
                // System.out.print(rem); 
            
            n=n/10;
            count = count * 10 +rem;

        }
        System.out.println(count);
        
}
}

    

