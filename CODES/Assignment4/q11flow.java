
import java.util.Scanner;

public class q11flow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the three numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // first
        System.out.println("Max value in "+a+"  " +b+ " " +c+ "  is : "+max(a,b,c));
         System.out.println("Min value in "+a+" " +b+ " " +c+ "  is : " +min(a,b,c));


       // second
             checking(a);

      // third

      Age(b);

      //fourth 
            Sum(a,b);
         
            //fifth
         boolean ans = Primea(a);
          System.out.println(a+" is prime number =>>> "+ans);



    }
// this is first
     static int max(int a, int b ,int c){
         int max = a;
         if (b >max){
            max = b;
         }
         if(c>max){
            max = c;
         }
       //  System.out.println("Max value is : "+max);
      return max ;
      }
    
        static int min(int a, int b ,int c){
         int min = a;
         if (b <min){
            min = b;
         }
         if(c<min){
            min = c;
         }
       //  System.out.println("Min value is : "+min);
         return min;
      }


      // second

           
    
    static void checking(int a){
        if (a%2 == 0){
            System.out.println("THE number "+a+" is even.");
        }
        if (a%2 != 0){
              System.out.println("THE number "+a+" is odd.");
        }
    }

    //third 

        static void Age(int b){
        if (b >= 18){
            System.out.println("the person of age " +b+" is eligible for voting .");
        }else{
            System.out.println("The person of age " +b+" is under age ");
        }
        
    }
      
    // fourth
  
    static void Sum(int a , int b){
        int s = a+b ;
        System.out.println("the sum of "+a+" and "+b+" is "+s);
    }


    //fifth
          


    
    static boolean Primea(int a){
          if (a<= 1){
            return false;
          }
          int x = 2;
           while(x*x <= a){
            if( a%x == 0){
                return false;
            }
            x++;
        }
          return (x*x> a);
    }


    
}
