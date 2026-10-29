public class Q342{
    public static void main(String[] args) {
        int n = 16 ;
        System.out.println(power(n, 0));
    }
    static boolean isPowerOfFour(int n) {
        return power(n ,0);
    }
    static boolean power(int n , int x){
          if(n==Math.pow(4,x)){
              return true ;
          }
          if(Math.pow(4,x) < n){
          return power(n , ++x );
          }
          return false ;
    }
}