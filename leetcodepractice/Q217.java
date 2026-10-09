import java.util.Arrays;

public class Q217 {
    static void main() {
        int [] arr = {1,2,3,1};
        boolean ans = containsDuplicate( arr);
        System.out.println(ans);
    }

//         static boolean containsDuplicate(int[] nums) {
//            int x = 0 ;
//            // int count = 0 ;
//            // for(int i = 0 ; i< nums.length ; i++){
//            for(int j = 0 ; j<nums.length ; j++){
//                if(j !=x){
//                    if(nums[x] == nums[j]){
//                        return true ;
//                    }
//                }
//                if(j == nums.length -1 ){
//                    // count= count + 1 ;
//                    x = x+ 1 ;
//                }
//            }
//            // }
//            return false ;
//        }

    static boolean containsDuplicate(int[] nums) {
        //  int[] newarr= bubble(nums);
        bubble(nums);
        for(int j = 0 ; j<nums.length- 1; j++){
            if(nums[j] == nums[j +1]){
                return true ;
            }

        }
        return false ;
    }
//     static  void bubble(int[] arr){
//        boolean swapped ;
//        for(int i = 0 ; i< arr.length  ; i++){
//            swapped = false;
//            for(int j = 1 ; j<arr.length  ; j++){
//                if(arr[j-1] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j-1];
//                    arr[j-1] = temp ;
//                    swapped = true ;
//                }
//            }
//            if(!swapped){
//                break;
//            }
//        }
////         System.out.println(Arrays.toString(arr));
//    }

static void bubble(int[] arr) {
    boolean swapped;
    for (int i = 0; i < arr.length; i++) {
        swapped = false;
        for (int j = 1; j < arr.length - i; j++) {
            if (arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
    }
}
}




