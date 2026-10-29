import java.util.*;
public class Q189 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3 ;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] nums, int k) {
        reverse(nums,0,nums.length-1) ;
                System.out.println(Arrays.toString(nums));
        int count = 0 ;
        while(count < 1){
            reverse(nums , 0 ,k-1);
            reverse(nums , k ,nums.length-1);
            count++ ;
        }
    }
    static void reverse(int[] nums, int s ,int e){
        while(s<e){
            swap(nums,s,e);
            s++;
            e--;
        }
    }
    static void swap(int[] nums, int s ,int e){
            int temp = nums[s] ;
            nums[s] = nums[e] ;
            nums[e] = temp ;
    }
}
