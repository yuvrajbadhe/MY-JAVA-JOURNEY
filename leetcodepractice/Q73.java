import java.util.* ;
public class Q73 {
    public static void main(String[] args) {
        int[][] arr = {
                       {3,2,1,4},
                       {1,0,3,5},
                       {7,1,2,6}
        };
        // int ans = richest(arr);
        // System.out.println(ans);
        richest(arr);
    }
    static void richest(int[][] matrix){
        int column = -1;
        boolean isFirst = true;
        int[][] list = new int[matrix.length][matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
          for (int col = 0; col < matrix[row].length; col++) {
              list[row][col] = matrix[row][col];
              if (matrix[row][col] == 0) {
                  // for (int i = row; i <= row; i++) {
                  for (int i = row; i <= row; i++) {
                      for (int j = 0; j < matrix[row].length; j++) {
                          list[row][col] = 0;

//                          column = col ;
//                          if(col>= 0){
                          if (isFirst) {
                              column = col;
                              isFirst = false;
                          }
                          for (int x = column; x<= column; x++) {
                              for (int y = 0; y < matrix.length; y++) {
                                  list[row][col] = 0;
                              }
                          }
                          }
                      }
                  }
              }
          }
        System.out.println(Arrays.deepToString(list));
        }
    }
