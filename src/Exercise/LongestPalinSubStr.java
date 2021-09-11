package Exercise;

public class LongestPalinSubStr {
    public String longestPalindrome(String s) {
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        int maxLen = 0;
        int begin = 0;
        // 所有长度为 1 的字符串都是回文串
        for (int i = 0; i < length - 1; i++) {
            dp[i][i] = true;
        }
        // 从短的子串转移到长的子串
        for (int len = 1; len <= length; len++) {
            for (int i = 0; i < length; i++) {
                int j = i + len - 1;
                if (j >= length) {
                    break;
                }

                if (s.charAt(i) == s.charAt(j)) {
                    if (len < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                } else {
                    dp[i][j] = false;
                }

                if (dp[i][j]) {
                    int curlen = j - i + 1;
                    if (curlen > maxLen) {
                        maxLen = curlen;
                        begin = i;
                    }
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}
