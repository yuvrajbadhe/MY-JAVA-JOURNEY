public class pattern16{
    public static void main(String[] args){
        pat1(10);

    }
    static void pat1(int n){
        int[][] arr = new int[n][];

        for (int row = 0; row < n; row++) {
            arr[row] = new int[row + 1];
            if(row < 2) {
                for (int col = 0; col <= row; col++) {
                    arr[row][col] = 1 ;
//                    System.out.print("1 ");
                }
            }
            if(row > 1) {

                for (int col = 0; col <= row; col++) {
                   if(col == 0 || col == row){
                       arr[row][col] = 1 ;
                   }else{
                       arr[row][col] = arr[row-1][col-1] + arr[row-1][col];
                   }
                }
            }
        }
        for(int row = 0 ; row < n ; row++){

            for (int col = 0; col <= n - row; col++) {
                System.out.print(" ");
            }
            for(int col = 0 ; col <= row ; col++){
                System.out.print(arr[row][col] +" ");
            }
            System.out.println();
        }
    }
}