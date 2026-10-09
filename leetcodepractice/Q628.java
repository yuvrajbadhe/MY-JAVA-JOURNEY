import java.util.Arrays;

public class Q628 {
    static void main() {
        int [] arr = {1,2,-3};
        int ans= maximumProduct(arr);
        System.out.println(ans);
    }
    static  int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int x=1;
        int i=0;
        int j=nums.length-1;
        int count = 0 ;
        if(nums[i]<0 && nums[j]<0 && count == 0) {
            x = nums[i] * nums[i + 1] * nums[i + 2];
            return x;
        }
        while(nums.length>=3){
            while(i<j){
                while(count <3){
                    if(nums[0] == 0){
                        return 0 ;
                    }
//                    if(nums[i]<0 && nums[j]<0){
//                        x=nums[i]*nums[i+1] * nums[i+2];
//                        return x;
//                    }
                    if(nums[0]<0 && nums[j]>0){
                        if(-1 * nums[i]>nums[j]){
                            x=nums[i]*x;
                            i++;
                            count++ ;
                        }
                        else{
                            x=nums[j]*x;
                            j--;
                            count++ ;
                        }
                    }
                    if(nums[0] > 0){
                        x = nums[j] * nums[j-1] *nums[j-2];
                        return x ;
                    }
                }
                return x ;
            }
        }
        return 0;
    }
}
