import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestValidBracketTest {

    @Test
    void test() {
        LongestValidBracket lvb = new LongestValidBracket();
        String brackets = "(()())";
        int ans = lvb.longestValidParentheses(brackets);
        System.out.println(ans);
    }
}