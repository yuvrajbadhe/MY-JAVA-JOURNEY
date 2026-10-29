
public class Q215{
    public static void main(String[] args) {
        int[] arr = {-1,2,0};
        int k = 3 ;
        System.out.println(findKthLargest(arr,k));
    }
    // static int findKthLargest(int[] nums, int k) {
    //     Arrays.sort(nums);
    //     return nums[nums.length-k];
    // }

//     static int largest(int[] nums, int k , int count  ) {
//         if(k == 1 ){
//             return max(nums);
//         }
//         int num = 0; 
//         int index = 0;
//         int num2= -10001;
        
//         for (int i = 0; i < nums.length; i++) {
//             if(nums[i] > num ){
//                 num = nums[i];
//                 index = i ;
//             }
//             if(nums[i]> num2 && nums[i]<num){
//                 num2 = nums[i];
//                 index = i ;
//                 count++ ;
//             }         
//         }
//         if(nums[index] < 0 && count > 0){
//             nums[index] = nums[index] - (num2) ;
//         }
//         nums[index] = nums[index] - num ;
//         --k ;
//         return largest( nums, k ,count) ;
//     }

//     static int max(int[] nums) {
//         int num = -10001;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] > num){
//             num = nums[i];
//            }
//        }
//        return num ;
//     }

// }




static int findKthLargest(int[] nums, int k) {
        return largest(nums,k,0) ;
    }
    static int largest(int[] nums, int k , int count  ) {
        if(k == 1 ){
            return max(nums);
        }
        int num = 0; 
        int index = 0;
        int num2= -10001;
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= num ){
                num = nums[i];
                index = i ;
            }
            if(nums[i]> num2 && nums[i] < 0 && num <= 0){
                num2 = nums[i];
                index = i ;
                count++ ;
            }         
        }
        if(nums[index] < 0 && count > 0){
            nums[index] = nums[index] + (-10001) ;
        }else if(nums[index] == 0){
            nums[index] = nums[index] - 10001 ;
        }else{
            nums[index] = nums[index] - 10001 ;
        }
        --k ;
        return largest( nums, k ,count) ;
    }

    static int max(int[] nums) {
        int num = -10001;
       for (int i = 0; i < nums.length; i++) {
           if(nums[i] > num){
            num = nums[i];
           }
       }
       return num ;
    }

}