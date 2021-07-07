public class ContinuousSubArray {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int max = ans;
        for (int i = 1; i < nums.length; i++) {
            ans = Math.max(ans + nums[i], nums[i]);
            max = Math.max(max, ans);
        }
        return max;
    }
}
