public class Q2598 {
    public static void main(String[] args) {
        int[] arr = {1,-10,7,13,6,8};
        int ans = findSmallestInteger(arr , 5);
        System.out.println(ans);
    }
    static int findSmallestInteger(int[] nums, int value) {
        int[] count = new int[value];
        
        // Count frequencies using standard index-based for loop
        for (int i = 0; i < nums.length; i++) {
            int rem = ((nums[i] % value) + value) % value;
            count[rem]++;
        }
        
        // Greedily consume remainders starting from 0
        int mex = 0;
        while (count[mex % value] > 0) {
            count[mex % value]--;
            mex++;
        }
        
        return mex;
    }
}

