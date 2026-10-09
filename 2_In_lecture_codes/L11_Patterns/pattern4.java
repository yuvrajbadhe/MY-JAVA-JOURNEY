public class pattern4{
    public static void main(String[] args){
    pat1(5);

    }
    static void pat1(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(1 + col +" ");
            }
            System.out.println();
        }
    }
}