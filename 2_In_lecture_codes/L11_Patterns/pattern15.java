public class pattern15 {
    public static void main(String[] args) {
        pat1(9);

    }

    static void pat1(int n) {
        for (int row = 1; row < 2*n; row++) {
            if(row <= n) {
                for (int col = 1; col <= n - row; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= row; col++) {
                    if (col == 1) {
                        System.out.print("*");
                    } else if (col == row) {
                        System.out.print(" *");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
                row++ ;
            }else{
            for (int col = 1; col <= row - n; col++) {
                System.out.print(" ");
            }
                for (int col = 1; col < 2*n-row+1; col++) {
                    if (col == 1) {
                        System.out.print("*");
                    } else if (col == 2*n - row ) {
                        System.out.print(" *");
                    } else {
                        System.out.print("  ");
                    }

                }
                System.out.println();
                row ++;
            }
    }
}}
