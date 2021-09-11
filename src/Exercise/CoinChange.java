package Exercise;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (amount < 0) {
            return 0;
        }
        int[] memo = new int[amount + 1];
        return coin(coins, amount, memo);
    }

    public int coin(int[] coins, int rem, int[] memo) {
        if (rem < 0 ) {
            return -1;
        }
        if (rem == 0) {
            return 0;
        }
        if (memo[rem] != 0) {
            return memo[rem];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int res = coin(coins, rem - coins[i], memo);
            // 子问题无解，跳过
            if (res < 0) {
                continue;
            }
            min = Math.min(min , res + 1);
        }
        memo[rem] = min == Integer.MAX_VALUE ? -1 : min;
        return memo[rem];
    }
    public int coinChangeDp(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        int max = amount + 1;
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                }
            }
        }
        return dp[amount] == max ? -1 : dp[amount];
    }
}
