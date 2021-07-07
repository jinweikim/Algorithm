import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalinSubStrTest {
    @Test
    void test() {
        LongestPalinSubStr lpss = new LongestPalinSubStr();
        String res = lpss.longestPalindrome("cbbd");
        System.out.println(res);
    }


}