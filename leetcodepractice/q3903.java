public class q3903 {
    static void main() {
        int arr[] = { 3,2,1};
        int k = 1 ;
        int ans = firstStableIndex(arr, k) ;
        System.out.println(ans);
    }

        static int firstStableIndex(int[] nums, int k) {
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
                    return i ;
                }
            }
            return -1 ;
        }
    }

