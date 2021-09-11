package Exercise;

public class stayNum {
    public int numWays(int steps, int arrLen) {
        final int BASE = (int)1e9 + 7;
        int maxColumn = Math.min(arrLen - 1, steps);
        int[][] dp = new int[steps + 1][maxColumn + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= steps; i++) {
            for (int j =0; j <= maxColumn; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j - 1 >= 0) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % BASE;
                }
                if (j + 1 <= maxColumn) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % BASE;
                }
            }
        }
        return dp[steps][0];
    }
}
