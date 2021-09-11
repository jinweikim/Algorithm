import Exercise.LongestValidBracket;
import org.junit.jupiter.api.Test;

class LongestValidBracketTest {

    @Test
    void test() {
        LongestValidBracket lvb = new LongestValidBracket();
        String brackets = "(()())";
        int ans = lvb.longestValidParentheses(brackets);
        System.out.println(ans);
    }
}