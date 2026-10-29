public class Q1782379816 {
    public static void main(String[] args) {
        int[] nums = {102,90,14};
        int k = 2;
        System.out.println(maximizeSum(nums,k));
    }
    static long maximizeSum(int[] nums, int k) {
        int count = 0 ;
        long sum = 0 ;
       
        for(int i= 0 ; i<nums.length ;i++){
            int num = nums[i];
            int right = nums[i] % 10 ;
            int left = nums[i];
            while(left>= 10){
                left = left / 10 ;
            }
            int Newnum = 0 ;
            if(right> left){
                while(num>0 && count < k ){
                    int n = num % 10 ;
                    Newnum = (Newnum * 10) + n ;
                    num = num / 10 ;
                }
                  count++ ;
            }
            if(nums[i]>Newnum){
                Newnum = nums[i];
            }
            sum = Newnum + sum ;
        }
        return sum ;
    }
}
