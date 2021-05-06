public class JZ14 {
    // 动态规划
    public int cuttingRope1(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i-j]));
            }
        }
        return dp[n];
    }

    // 贪心
    public int cuttingRope2(int n) {
        if (n < 4) {
            return n - 1;
        }
        int res = 1;
        while (n > 4) {
            n = n - 3;
            res = (res * 3) % (1000000007);
        }
        res *= n;
        return res;
    }
}
