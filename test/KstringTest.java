
import Exercise.Kstring;
import org.junit.jupiter.api.Test;

import java.util.List;

class KstringTest {
    @Test
    void test() {
        Kstring ks = new Kstring();
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        List<String> res = ks.topKFrequent(words, 2);
        for (String str : res) {
            System.out.println(str);
        }
    }

}