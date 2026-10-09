public class pattern17 {
    static void main() {
      pat17(4);
    }
    static void pat17(int n){
        for(int row = 1 ; row <=n ; row++){

            for (int col = 0; col <= n - row; col++) {
                System.out.print(" ");
            }
            for(int col = 1 ; col <= 2 * row - 1 ; col ++){
                int result = Math.abs(row - col) +1 ;
                System.out.print(result);
            }
            System.out.println();
        }
    }
}
