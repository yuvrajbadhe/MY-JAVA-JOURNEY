/* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0]. */


// class Solution {
//     public int[] plusOne(int[] digits) {
//         int n = digits.length;

//         // Traverse backwards starting from the last digit
//         for (int i = n - 1; i >= 0; i--) {
//             if (digits[i] < 9) {
//                 digits[i]++;
//                 return digits; // Return early if no carry is needed
//             }
            
//             // Turn '9' into '0' and continue the loop to pass carry leftward
//             digits[i] = 0;
//         }

//         // If we reach here, ALL digits were 9! (e.g., [9] -> [0])
//         // We create a new array of size n + 1 (e.g., size 2 for [1, 0])
//         int[] result = new int[n + 1];
//         result[0] = 1; // Java automatically sets remaining indices (like result[1]) to 0!
        
//         return result;
//     }
// }


// class Solution{


        
    

//     public int[] plusOne(int[] digits) {

//        for(int i = digits.length - 1 ; i>0 ; i--){
//         if(digits[i]== 9 ){
//             digits[i]=0;
//             System.out.println(i);
//             return digits;
//         }else{
//             digits[i]++;
//             return digits ;
//         }
//        }

//        digits = new int[digits.length +1 ];
//        digits[0] = 1 ;
//        return digits ;
//     }
// }



class Solution {
    public int[] plusOne(int[] digits) {

       int i = digits.length - 1 ;

       if(digits[i] == 0 ){
          digits[i] = 1; 
            return digits;
       }else{
        while(i>0){

           if (digits[i] == 0){
            digits[i] = 1; 
            return digits;
        }

        if(digits[i]== 9 ){
            digits[i]=0;
        }else{
            digits[i]++;
            return digits ;
        }
        i--;

     }
     
           if(digits[i]!=9 &&   i ==0){
                digits[i]++;
                return digits ;
           }else{
               digits = new int[digits.length +1 ];
               digits[0] = 1 ;
           }
       }
       return digits ;
    }
}