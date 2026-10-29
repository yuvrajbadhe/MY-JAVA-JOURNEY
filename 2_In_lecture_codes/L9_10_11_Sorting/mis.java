// import java.util.*;
// public class mis {
//     public static void main(String[] args) {
//         int [] nums = {8,7,3,5,3,6,1,4};
//         System.out.println(Arrays.toString(findErrorNums(nums)));
//     }
//      static int[] findErrorNums(int[] nums) {
//                 int i = 0;
//                 int[] ans = new int[2];
//         while (i < nums.length) {
            
//             if (nums[i] != i + 1) {
//                 int correct = nums[i] - 1;
//                 if (nums[i] != nums[correct]) {
//             swap(nums, i, correct);
//         } else {
//             i++;
//         }
//                 } 
//                 else{ 
//                    i++;
//                 }
//      }
    
//       for (int j = 0; j < nums.length; j++) {
//         if(nums[j] != j+1){
//             ans = new int[]{ nums[j] , j+1};
//         }
//         return ans ;
//     }
//     ans = new int[]{-1};
//         return  ans;
// }

//     static void swap(int[] nums, int first, int second) {
//         int temp = nums[first];
//         nums[first] = nums[second];
//         nums[second] = temp;
//     }
    
//     }



import java.util.*;

public class mis {

    public static void main(String[] args) {

        int[] nums = {8, 7, 3, 5, 3, 6, 1, 4};

        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {

        int i = 0;

        // Cyclic Sort
        while (i < nums.length) {

            if (nums[i] != i + 1) {

                int correct = nums[i] - 1;

                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } 
                else {
                    i++;
                }

            } 
            else {
                i++;
            }
        }

        // Find duplicate and missing number
        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != j + 1) {

                return new int[]{nums[j], j + 1};
            }
        }

        return new int[]{-1, -1};
    }

    static void swap(int[] nums, int first, int second) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}