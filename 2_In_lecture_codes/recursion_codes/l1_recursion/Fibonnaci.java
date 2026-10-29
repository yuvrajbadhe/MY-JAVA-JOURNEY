public class Fibonnaci {
    static void main() {
        int n = 2 ;
        System.out.println(fibo(n));
        int[] arr = {} ;
        System.out.println(arr);
        
    }
    static int fibo(int n){
        if(n < 2){
            return n ;
        }
        return fibo( n-1) + fibo (n-2);
    }
}
