import java.util.Scanner; 

public class primenum { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        System.out.println("Please enter a number:"); 
        int n = in.nextInt(); 

        if (n <= 1) { 
            System.out.println("Neither prime nor composite"); 
            return; 
        } 

        int c = 2; 
        while (c * c <= n) { 
            if (n % c == 0) { 
                System.out.println("Not Prime"); 
                return; // Stop early if a factor is found
            } 
            c++; 
        } 

        // If the loop finishes without finding any factors, it MUST be prime!
        System.out.println("Prime"); 
    } 
}