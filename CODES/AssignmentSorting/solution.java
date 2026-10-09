
public class solution {
    public static void main(String[] args) {
        int[] nums = {3,6,1,0};
        // dominantIndex(nums);
        // System.out.println(Arrays.toString(nums));
        int arr = dominantIndex(nums);
        System.out.print(arr);
    }
    static int dominantIndex(int[] nums) {
        int index =0 ;
        int max = nums[0];
        int i ;
        for( i = 0 ; i<nums.length ; i++){
            if(nums[i]> max){
                max = nums[i];
                index = i ;
            }
        }
        for(int j = 0 ; j< nums.length ; j++){
            if(nums[j] != max){
                int x = (2)*(nums[j]) ;
            if(max < x ){
                return  -1 ;
            }
            }
        }
        return index ;
    }
}

