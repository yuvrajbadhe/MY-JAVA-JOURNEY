public class pattern14{
    public static void main(String[] args) {
        pat1(9);

    }

    static void pat1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }
            if (row == 1) {
                for (int col = 1; col <= n; col++) {
                    System.out.print("* ");
                }
            }else {
                for (int col = 1; col <= n - row + 1; col++) {
                    if (col == 1) {
                        System.out.print("*");
                    } else if (col == n-row+1) {
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