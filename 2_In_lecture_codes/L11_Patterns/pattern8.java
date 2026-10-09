public class pattern8{
    public static void main(String[] args){
        pat1(9);

    }
    static void pat1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
            row++ ;
        }
    }
}