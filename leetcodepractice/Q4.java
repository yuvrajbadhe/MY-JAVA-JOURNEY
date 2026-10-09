import java.util.Arrays;

public class Q4 {
    static void main() {
       int[] nums1 = {1,2};
       int[] nums2 = {3,4};
       double ans = findMedianSortedArrays(nums1,nums2);
        System.out.println(ans);
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int a = nums1.length ;
            int b = nums2.length ;

            int[] arr = new int[ a +b ];
            for(int i =0 ; i < a ; i++){
                arr[i] = nums1[i];
            }
            for(int j = 0 ; j < b ; j++){
                arr[a + j] = nums2[j];
            }
            Arrays.sort(arr);

            if(arr.length % 2 == 0){
                int i = ((arr.length -1 ) +0 ) / 2 ;
                double x = ((arr[i] + arr[i+1])/2.0);
                return x ;
            }
            int j = (arr.length -1) / 2 ;
            return (double)(arr[j]) ;
    }
}
