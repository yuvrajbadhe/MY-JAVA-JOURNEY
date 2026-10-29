// richest custmer
public class Q1672 {
    public static void main(String[] args) {
        int[][] arr = {
                       {3,2,1},
                       {1,2,3},
                    //    {7,1,2}
        };
        int ans = richest(arr);
        System.out.println(ans);
    }
    static int richest(int[][] account){
        int max= 0 ;
        for (int i = 0; i < account.length; i++) {
          int x = 0 ;
          for (int j = 0; j < account[i].length; j++) {
            x= account[i][j] + x ;
             
          }
           if(x>max){
            max = x ;
           }
            
        }
        return max ;
    }
}