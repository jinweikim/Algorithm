package Exercise;

import java.util.HashMap;
import java.util.Map;

public class MinCoverSubStr {
    public String minWindow(String s, String t) {

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int left = 0;
        int right = 0;

        Map<Character, Integer> tableT = new HashMap<>();

        Map<Character, Integer> tableWindow = new HashMap<>();

        // 统计 t 中每个字符出现的个数
        for (int i = 0; i < charT.length; i++) {
            char ch = charT[i];
            tableT.put(ch, tableT.getOrDefault(ch, 0) + 1);
        }

        int valid = 0;

        int minLen = Integer.MAX_VALUE;
        int begin = 0;

        // [left, right)
        while (right < charS.length) {

            // 将移入窗口的字符
            char c = charS[right];
            right++;

            if (tableT.getOrDefault(c, 0) > 0) {
                tableWindow.put(c, tableWindow.getOrDefault(c, 0) + 1);
                // 一种字符的个数已满足要求
                if (tableWindow.get(c) == tableT.get(c)) {
                    valid++;
                }
            }


            // 尽量收缩左边界
            while (valid == tableT.size()) {

                if ((right - left) < minLen) {
                    minLen = right - left;
                    begin = left;
                }

                char d = charS[left];
                left++;

                if (tableT.getOrDefault(d, 0) > 0) {
                    if (tableWindow.get(d) == tableT.get(d)) {
                        valid--;
                    }
                    tableWindow.put(d, tableWindow.get(d) - 1);
                }
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(begin, begin + minLen);

    }
}
