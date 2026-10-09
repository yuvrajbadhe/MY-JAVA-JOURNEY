public class pattern5{
    public static void main(String[] args){
    pat1(7);

    }
    static void pat1(int n){
        for (int row = 1; row < 2*n; row++) {
            if(row<=n){
                for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
             System.out.println();
            }
            else{
            //    for (int col = 1; col <= row - c; col++) {
            for (int col = 1; col < 2*n-row+1; col++) {
                System.out.print("* ");
                //  c = c+2 ;

               }
               System.out.println();

            }

            // for (int col = 1; col <= row; col++) {
            //     System.out.print("* ");
            // }
            // System.out.println();
       
        }
}
}