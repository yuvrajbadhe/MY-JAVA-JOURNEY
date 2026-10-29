import java.util.Arrays;

public class Q278{
    public static void main(String[] args) {
        int[][] arr = {
            {1,5,9},
            {10,15,16},
            {12,18,19}
        };
        // System.out.println(kthSmallest(arr,8));
        kthSmallest(arr,8) ;
    }
    static void kthSmallest(int[][] matrix, int k) {
        int r = matrix.length ;
        int count = 0;
        int[] arr = new int[r *r];
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j< r ; j++){
                // if(count== k-1){
                //    return matrix[i][j];
                // }
                // count++ ;
                arr[count] = matrix[i][j] ;
                count++ ;
            }
        }
        System.out.println(Arrays.toString(arr) + "   not sorted");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr) + "    sorted");
        // return arr[k-1] ;
    }
}