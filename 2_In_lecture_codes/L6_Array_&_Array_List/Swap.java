

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18, 56};
//        swap(arr, 0, 4);
        reverse(arr);
        // swap(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }

    // //  Swap 
    //  static void swap(int[] arr, int index1, int index2) {
    //     int temp = arr[index1];
    //     arr[index1] = arr[index2];
    //     arr[index2] = temp;
    //    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
   
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    }