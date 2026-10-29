public class Q121 {
    public static void main(String[] args) {
        int[] prices = {2,1,4};
        // System.out.println(maxProfit(prices));
    }

//     public int maxProfit(int[] prices) {
//         int max = 0 ;
//         for(int i = 0 ; i<prices.length - 1 ; i++){
//             for(int j = i+1 ; j<prices.length ; j++){
//             int sum = prices[j] - prices[i];
//             if(sum> max){
//                 max = sum ;
//             }
//             }
//         }
//         return max ;
//     }

//     static int maxProfit(int[] prices) {
//         int max = 0 ;
//         int i = 0 ;
//         int j = prices.length-1 ;
//         while(j>i){
//             if(prices[j] < prices[i]){
//                 i++ ;
//             }else{
//                 int sum = prices[j] - prices[i];
//                 if(sum> max){
//                    max = sum ;
//                 }
//                 j-- ;
//             }
//         }
//         return max ;
//     }
}

