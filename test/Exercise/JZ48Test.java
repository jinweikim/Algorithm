package Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JZ48Test {
    @Test
    void test() {
        JZ48 jz = new JZ48();
        String str = "abcabcbb";
        int ans = jz.lengthOfLongestSubstring(str);
        System.out.println(ans);
    }

}