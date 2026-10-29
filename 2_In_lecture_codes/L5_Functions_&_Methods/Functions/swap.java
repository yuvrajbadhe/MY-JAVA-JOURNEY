public class swap {
    public static void main(String[] args) {
        int a = 10 ;
        int b=20 ;

   /*      int temp =a;
        a =b ;
        b = temp;
        System.out.println(a + " " + b);
 */
    //  swap(a,b);
     System.out.println(a + " " + b);
     int num = swap(a,b);
     System.out.println(num);
     
    }  
    static int swap(int a , int b) {
         int temp =a;
        a =b ;
        b = temp;
        int num  = a ;
        return num ;
        
    }
}
