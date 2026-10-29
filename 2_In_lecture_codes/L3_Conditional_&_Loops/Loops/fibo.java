import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value n : ");
        int n = in.nextInt();
//         int a =0;
//         int b =1;
//         int count = 2;
//         while(count<=n){
//             int c = b;
//             // System.out.println("temp is : "+c);
//             b =b +a ;
//             // System.out.println("b is : "+b);
//             a =c ;
//             // System.out.println( " a is : "+a);
//             count++;
//         }
// System.out.println("the nth number is " +b);
      boolean ans = threeFibonacciSum(n);
      System.out.println(ans);
    }
     static boolean threeFibonacciSum(int n) {
        int a = 0 ;
        int b= 1 ;
        int[] arr = new int[n];
        int count = 2 ;
        arr[0] = 0;
        arr[1]=1 ;
        int x = 2 ;
        if(n>12){
         while(count< n/4 ){
            int c =b ;
            b = b +a ;
            a= c ;
            count ++ ;
            arr[x] = b ;
            x++;
        }
        }else{
        while(count <= n ){
            int c =b ;
            b = b +a ;
            a= c ;
            count ++ ;
            arr[x] = b ;
            if(x < n-1){
            x++;
            }
        }
        }
        for(int i = 0 ; i< arr.length - 2 ; i++){
            if(arr[i] + arr[i+1] + arr[i+2] == n){
                return true ;
            }
        }
        return false ;
    }

    
}
