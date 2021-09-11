package Exercise;

public class Exam_07_18_02 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int[] dp = new int[array.length];
        dp[0] = array[0];
        int ans = dp[0];
        for (int i = 1; i < array.length; i++) {
            if (dp[i - 1] < 0) {
                dp[i] = array[i];
            } else{
                dp[i] = dp[i - 1] + array[i];
            }
            ans = Math.max(dp[i], ans);
        }
        return ans;
    }
}
