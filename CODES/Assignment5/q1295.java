import java.util.Scanner;

public class q1295 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] nums = new int[7];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int evencount =0 ;

        for (int z = 0 ; z <nums.length ; z++){
        int x = nums[z];
        // int y =1;
        int count = 0 ;
        
        while(x > 0){
            x = x/10 ;
            count ++ ;
        }
       System.out.println(z +"   sathi  " + count);
         if(count % 2 == 0){
           evencount ++ ;
        }
       
      }
      System.out.println(evencount);

    }
    
}
