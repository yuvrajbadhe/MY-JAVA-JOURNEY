import java.util.Arrays;

public class Q1608 {
    static void main() {
        int[] arr = {0, 4, 3, 0, 4};
        int ans = specialArray(arr);
        System.out.println(ans);
    }

    static int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= i) {
                    count = count + 1;
                }
            }
            if (count == i) {
                return i;
            }
        }
        return -1;
    }
}

