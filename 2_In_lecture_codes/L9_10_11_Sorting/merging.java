import java.util.* ;
public class merging {
    static void main() {
   int[] arr = {1,5,2,7,3,8,34,8,9,54,78,9};
    arr = mergearr(arr);
   System.out.println(Arrays.toString(arr));
    }
    static int[] mergearr(int[] arr){
         if(arr.length == 1){
             return arr ;
         }
         int mid = arr.length / 2 ;
         int[] left = mergearr(Arrays.copyOfRange(arr,0 , mid));
         int[] right = mergearr(Arrays.copyOfRange(arr, mid,arr.length));

         return merge(left , right);
    }
    static int[] merge(int[] first , int[] second){
        int[] mix = new int[first.length + second.length];

        int i =0 ;
        int j =0 ;
        int k = 0 ;

        while(i<first.length && j< second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j] ;
                j++ ;
            }
            k++;
        }
        while(i<first.length ){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length ){
            mix[k] = second[j];
            j++;
            k++ ;
        }
        return mix ;
    }
}
