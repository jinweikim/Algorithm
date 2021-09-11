package Exercise;

public class LC72 {
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        int ans = minDistance(word1, word2);
        System.out.println(ans);
    }
    public static int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];

        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 0;
                } else if (i != 0 && j == 0) {
                    dp[i][j] = i;
                } else if (j != 0 && i == 0) {
                    dp[i][j] = j;
                } else {
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j] + 1), dp[i][j - 1] + 1);
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]) + 1;
                    }
                }
            }
        }
        return dp[len1][len2];
    }
}
