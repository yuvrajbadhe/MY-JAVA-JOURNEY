/* import java.util.Scanner;
public class primenum {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int num = in.nextInt();
     for(int i = 2 ; i< num ; i++){

        if(num % i == 0){
            System.out.println(num+ " it is not prime number .");
            break;
        }
    //    num % i == 0;
    //    System.out.println(num+ " it is not prime number .");
    //         break;
        }
    }
 }
    
 */


import java.util.Scanner; 
public class primenum { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        System.out.println("Please enter a number"); 
        int n = in.nextInt(); 
        if(n<=1){ 
            System.out.println("Nither prime nor composite"); 
            return; 
        } 
        int c=2; 
        // System.out.println(c + " case 1 c");
    /*      if(n==4){ 
            System.out.println("Not Prime"); 
        } 
        else{  
            // System.out.println(c + " case 2 c");
            while(c*c<n){ 
                // System.out.println(c + " case 3 c");
                if (n%c==0){ 
                    // System.out.println(c + " case x c");
                    // System.out.println(n + " case 1 for n");
                    System.out.println("Not Prime"); 
                    return; 
                } 
                c=c+1; 
                // System.out.println(c + " case 4 c");
                //     System.out.println(n + " case 2 for n");
            }
            if(c*c>n){ 
                // System.out.println(c + " case 5 c");
                //     System.out.println(n + " case 3 for n");
                System.out.println("Prime"); 
            }  */


             while(c*c<=n){ 
                // System.out.println(c + " case 3 c");
                if (n%c==0){ 
                    // System.out.println(c + " case x c");
                    // System.out.println(n + " case 1 for n");
                    System.out.println("Not Prime"); 
                    return; 
                } 
                c=c+1; 
                // System.out.println(c + " case 4 c");
                //     System.out.println(n + " case 2 for n");
            }
            /* if(c*c>n){ 
                // System.out.println(c + " case 5 c");
                //     System.out.println(n + " case 3 for n");
                System.out.println("Prime"); 
            }  */
              System.out.println("Prime"); 
        } 
    } 
 