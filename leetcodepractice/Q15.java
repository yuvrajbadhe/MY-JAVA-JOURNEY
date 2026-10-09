import java.util.ArrayList;
import java.util.List;

public class Q15 {
    static void main() {
       int[] arr = {-1,0,1,2,-1,4};
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }
        static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            for(int i = 0 ; i < nums.length ; i++){
                for(int j = i+1 ; j <nums.length -1 ; j++){
                    for(int k = j+1 ; k< nums.length ; k++){
                        if(nums[i] + nums[j] + nums[k] == 0){
                            List<Integer> sublist = new ArrayList<>();
                            sublist.add(nums[i]);
                            sublist.add(nums[j]);
                            sublist.add(nums[k]);
                            result.add(sublist);
                        }
                    }
                }
            }
            return result ;
        }
}
