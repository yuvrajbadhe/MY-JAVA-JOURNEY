import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, 4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }
    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < nums.length-2; i++){
            for(int j = i+1 ; j <nums.length -1 ; j++){
                for(int k = j+1 ; k< nums.length ; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> sublist = new ArrayList<>();
                        sublist.add(nums[i]);
                        sublist.add(nums[j]);
                        sublist.add(nums[k]);
                        int count = 0 ;
                        for(int x =0 ; x< result.size() ; x++){
                            if(result.contains(sublist)){
                                count++ ;
                            }
                        }
                        if(count == 0){
                            result.add(sublist);
                        }
                    }                        
                }
            }
        }
        return result ;
    }
}
