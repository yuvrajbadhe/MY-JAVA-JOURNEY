public class pattern13 {
    public static void main(String[] args) {
        pat1(9);

    }

    static void pat1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row ; col++) {
                System.out.print(" ");
            }
            if (row == n) {
                for (int col = 1; col <= n; col++) {
                    System.out.print("* ");
                }
            }else {
                for (int col = 1; col <= row; col++) {
                    if (col == 1) {
                        System.out.print("*");
                    } else if (col == row) {
                        System.out.print(" *");
                    } else {
                        System.out.print("  ");
                    }

                }
            }
                System.out.println();
                row++;

        }
    }
}