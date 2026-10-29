public class Q169 {
    public static void main(String[] args) {
        int [] arr = {1,0,0,2,0,0,3};
        System.out.println(majorityElement(arr));
    }
    // static int majorityElement(int[] nums) {
    //     for(int i = 0 ; i<nums.length - 1 ; i++){
    //         int count = 1;
    //         for(int j = i+1 ; j<nums.length ; j++){
    //             if(nums[i]== nums[j]){
    //                 count++;
    //             }
    //         } 
    //         if(count > nums.length/2){
    //             return nums[i];
    //         }
    //     }
    //     return nums[0];
    // }

    static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        // Standard index-based for loop (No enhanced for loop)
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}
