package Exercise;

public class Exam_07_18_03 {
    public int minCoins(int V, int[] coins, int M) {
        int[] dp = new int[V + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= V; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[V];
    }
}
