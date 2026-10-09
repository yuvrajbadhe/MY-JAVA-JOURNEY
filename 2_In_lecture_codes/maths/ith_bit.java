public class ith_bit {
    public static void main(String[] args) {
        int n = 0b10101;
        int i = 2 ;
        // int x = n & (1<< (i-1));
        int x = (n >> (i-1)) & 1 ;
        System.out.println((n >> (i-1)));
        System.out.println(x); 
    }
    
}
