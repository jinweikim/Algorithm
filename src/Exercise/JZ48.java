package Exercise;

import java.util.HashMap;
import java.util.Map;

public class JZ48 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        int[] dp = new int[s.length() + 1];
        dp[0] = 0;
        int ans = 0;

        for (int i = 1; i < dp.length; i++) {
            System.out.println("i: " + i);
            if (map.containsKey(chars[i - 1])) {
                int lastAppear = map.get(chars[i - 1]);
                if (i - lastAppear <= dp[i - 1]) {
                    dp[i] = i - lastAppear;
                    System.out.println(1);
                } else {
                    dp[i] = dp[i - 1] + 1;
                    System.out.println(2);
                }
            } else {
                System.out.println(3);
                dp[i] = dp[i - 1] + 1;
            }
            map.put(chars[i - 1], i);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
