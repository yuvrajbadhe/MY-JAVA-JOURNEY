



public class OddEven {

    public static void main(String[] args) {
    
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int a = sc.nextInt();
        // System.out.println(isOdd(n,a));

        boolean ans = true ;
        boolean que = false ;
        System.out.println(ans & que);
    }

    private static int isOdd(int n , int a) {
        return (n | a) ;
    }
}
