import java.util.ArrayList;
import java.util.List;

public class qofleet {
    public static void main(String[] args) {
        int[] arr = {9,8,5,4,5,6,2,4,3,} ;
        System.out.println(findDisappearedNumbers(arr));
    }
     static List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0 ;
        while(i<nums.length){
            int correct =  nums[i]-1 ;
            if(nums[i] != nums[correct]){
                swap(nums , i ,correct);
            }else{
                i++ ;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != j + 1 ){
                ans.add(nums[j]) ;
            }
        }
        
        
        return ans ;
    }
    static void swap(int[] nums , int first , int second){
        int temp = nums[first] ;
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
