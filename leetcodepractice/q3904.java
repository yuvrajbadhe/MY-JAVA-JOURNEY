public class q3904 {
    public static void main(String[] args) {
        int arr[] = { 5,0,1,4};
        int k = 3 ;
        int ans = firstStable(arr, k) ;
        System.out.println(ans);
    }

        static int firstStable(int[] nums, int k) {
            int n = nums.length ;
            int max = 0 ;
         
            for(int i = 0 ;  i< n ; i++){
                if(nums[i] > max){
                    max = nums[i];
                }
                 int min = nums[i];
            for (int j = i; j < n ; j++) {
                 min = Math.min(min, nums[j]);
            }

                
                    if(max - min <= k){
                       
                        return i;
                    }
            }
            return -1 ;
        }

}

