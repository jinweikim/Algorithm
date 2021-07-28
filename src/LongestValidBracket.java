public class LongestValidBracket {
    public int longestValidParentheses(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[] dp = new int[s.length()];

        for (int i = 1; i < dp.length; i++) {
            // 只考虑字符为 ) 的位置
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    if (i >= 2) {
                        dp[i] = dp[i - 2] + 2;
                    } else {
                        dp[i] = 2;
                    }
                } else {
                    if ((i - dp[i - 1] - 1) >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                        int d = 0;
                        if ((i - dp[i - 1] - 2) >= 0) {
                            d = dp[i - dp[i - 1] - 2];
                        }
                        dp[i] = dp[i - 1] + 2 + d;
                    }
                }
            }
        }
        int max = dp[0];
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
