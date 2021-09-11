package Exercise;

import java.util.HashMap;
import java.util.Map;

public class LC3 {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int left = 0;
        int ans = longest(str);
        System.out.println(ans);
    }

    public static int longest(String s) {
        int left = 0;
        int right = 0;
        int ans = 0;
        Map<Character, Integer> lastAppear = new HashMap<>();

        // [left, right)
        while (right < s.length()) {
            right++;
            char inCh = s.charAt(right - 1);
            int last = lastAppear.getOrDefault(inCh, -1);
            if (last == -1) {
                // no appear before
                lastAppear.put(inCh, right - 1);
            } else {
                // appear before
                while (left < right && lastAppear.get(inCh) != -1) {
                    char outCh = s.charAt(left);
                    left++;
                    lastAppear.put(outCh, -1);
                }
                lastAppear.put(inCh, right - 1);
            }
            ans = Math.max(ans, right - left);
        }
        return ans;
    }
}
