import java.util.Scanner;
public class sqrt{
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      int x = in.nextInt();
      int ans = mySqrt(x);
      System.out.println(ans) ;
    }
   
    static int mySqrt(int x) {
    //  int count = 0 ;
    //  int y = x ;
    //  int i = 1 ;
    // //   int z = x ;
    //  while(y >0){
    //     y = y - i ;
    //     count ++ ;
    //     i = i+2 ;
        
    //  }
    //  return count ;

      if (x == 0) return 0;
        
        int left = 1;
        int right = x;
        
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int z =x/mid ;
            
            if (mid ==z) {
                return mid;
            } 
             else if (mid < z) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return right;
   
    }
}
 
