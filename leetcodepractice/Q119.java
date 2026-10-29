import java.util.* ;
public class Q119{
    public static void main(String[] args){
    //    List<Integer> answer = pat1(5);
    //    System.out.println(answer);
       List<Integer> answer = getRow(3);
       System.out.println(answer);
    }
    // static void pat1(int n){
//     static List<Integer> pat1(int n){
//         int[][] arr = new int[n][];

//         for (int row = 0; row < n; row++) {
//             arr[row] = new int[row + 1];
//             if(row < 2) {
//                 for (int col = 0; col <= row; col++) {
//                     arr[row][col] = 1 ;
// //                    System.out.print("1 ");
//                 }
//             }
//             if(row > 1) {

//                 for (int col = 0; col <= row; col++) {
//                    if(col == 0 || col == row){
//                        arr[row][col] = 1 ;
//                    }else{
//                        arr[row][col] = arr[row-1][col-1] + arr[row-1][col];
//                    }
//                 }
//             }
//         }
//            List<List<Integer>> ans = new ArrayList<>() ;
//         for(int row = 0 ; row < n ; row++){
//         List<Integer> list = new ArrayList<>() ;
//             for(int col = 0 ; col <= row ; col++){
//                 list.add(arr[row][col]);
//             }
//               ans.add(list);
//         }
     
      
//     return ans.get(n-1);
//     }


    static List<Integer> getRow(int rowIndex) {
        int n = rowIndex;

        List<Integer> row = new ArrayList <>();
        row.add(1);
        
        long ans =1;

        for(int i = 1; i <= n; i++){
            ans = ans * (n - i + 1);
            ans = ans/i;

            row.add((int) ans);

        }
        
    
    return row;
    }

}