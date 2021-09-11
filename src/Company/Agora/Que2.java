package Company.Agora;

public class Que2 {

    public static void main(String[] args) {
        String str = "aeghkhge";
        String ans =  longestPanlindrome(str);
        System.out.println(ans);
    }

    public static String longestPanlindrome (String s) {
        int strLen = s.length();
        
        if (strLen == 0) {
            return "";
        }
        boolean[][] dp = new boolean[strLen][strLen];
        int maxLen = 1;
        int begin = 0;

        for (int i = 0; i < strLen; i++) {
            dp[i][i] = true;
        }

        for (int i = 0; i < strLen; i++) {
            int j = i + 2 - 1;
            if (j >= strLen) {
                continue;
            }
            if (s.charAt(i) == s.charAt(j)) {
                dp[i][j] = true;
                maxLen = 2;
                begin = i;
            }
        }

        for (int len = 3; len <= strLen; len++) {
            for (int i = 0; i < strLen; i++) {
                int j = i + len - 1;
                if (j >= strLen) {
                    break;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                    if (dp[i][j]) {
                        maxLen = Math.max(maxLen, len);
                        begin = i;
                    }
                }
            }
        }

        return s.substring(begin, begin + maxLen);
    }
}
