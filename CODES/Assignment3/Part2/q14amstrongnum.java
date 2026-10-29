import java.util.Scanner;
public class q14amstrongnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the small number : ");
        int q = in.nextInt();
        System.out.print("Enter the large number : ");
        int r = in.nextInt();


        while(q<=r){
            System.out.println("chota num : "+q);
                int t =q ;
                int y =0;
            while(t>0){
              
                int x =t%10;
                int p =x*x*x;
                
                t= t/10;
                y = y + p;
            }
             if (y ==q ){
            System.out.println(q+ " Amstrong number.");
            }
        
           q++;
        }
       
        
    }
}
