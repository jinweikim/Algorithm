import Exercise.Exam_07_18;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class examTest {
    @Test
    void test() {
        Exam_07_18 e = new Exam_07_18();
        ArrayList<String> ans = e.letterCombinations("23456");
        for (String str : ans) {
            System.out.println(str);
        }
    }

}