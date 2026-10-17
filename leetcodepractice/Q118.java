import java.util.* ;
public class Q118{
    public static void main(String[] args){
       List<List<Integer>> answer = pat1(5);
       System.out.println(answer);
    }
    // static void pat1(int n){
    static List<List<Integer>> pat1(int n){
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
           List<List<Integer>> ans = new ArrayList<>() ;
        for(int row = 0 ; row < n ; row++){
        List<Integer> list = new ArrayList<>() ;
            for(int col = 0 ; col <= row ; col++){
                list.add(arr[row][col]);
            }
              ans.add(list);
        }
     
      
    return ans ;
    }
}