import Exercise.LongestPalinSubStr;
import org.junit.jupiter.api.Test;

class LongestPalinSubStrTest {
    @Test
    void test() {
        LongestPalinSubStr lpss = new LongestPalinSubStr();
        String res = lpss.longestPalindrome("cbbd");
        System.out.println(res);
    }


}