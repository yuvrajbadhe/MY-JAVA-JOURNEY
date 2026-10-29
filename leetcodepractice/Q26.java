import java.util.*;
public class Q26 {
    public static void main(String[] args) {
        int[] arr ={1,1,2};
        // System.out.println(removeDuplicates(arr));
        removeDuplicates(arr);
    }
    static void removeDuplicates(int[] nums) {
        int count = 0 ;
        // int[] arr = nums ;
        for(int i = 0 ; i<nums.length-1 ; i++){
            if(nums[i] != nums[i+1]){
                nums[count] = nums[i];
                count++ ;
            }
        }
        nums[count] = nums[nums.length -1];
        System.out.println(Arrays.toString(nums) + " this is array");
        System.out.println(count +1);

        // return count+1;
    }
}
