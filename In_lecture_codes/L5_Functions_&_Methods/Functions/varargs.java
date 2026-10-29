import java.util.Arrays;
import java.util.Scanner;

public class varargs {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
        // multiple(2,4,"yuvraj","adiii");
        fun(8,7,8,5,5,5,5);
    }
    
    static void fun(int... v){
        System.out.println(Arrays.toString(v));
        
    }
    
    // static void fun(int v ,int x){
    //     // System.out.println(Arrays.toString(v));
    //     System.out.println(v + " " + x);
    // }
    static void multiple(int a , int b , String ...v){
        System.out.println(a + " " + b +" " + Arrays.toString(v));}
}
