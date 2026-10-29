// public class Q2028 {
//     public static void main(String[] args) {
        
//     }
//     static int[] missingRolls(int[] rolls, int mean, int n) {
//         int sum1 = 0 ;
//         int sum2 = 0 ;
//         int len = rolls.length + n ;
//         for(int i = 0 ; i< rolls.length ; i++){
//              sum1 = sum1 + rolls[i];
//         }
//         sum2 = (mean * len) - sum1 ;
        
//     // return diceroll("" , 4);
//     }
//     static void diceroll(String p ,int target ) {
//         if(target == 0){
//             System.out.println(p);
//             return ;
//         }
//         for (int i = 1; i <= 6 && i<=target; i++) {
//             diceroll(p+i , target-i);
//         }
//     }
// }


