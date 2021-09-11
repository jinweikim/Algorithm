import Exercise.PhoneNumber;
import org.junit.jupiter.api.Test;


import java.util.List;

class PhoneNumberTest {
    @Test
    void test() {
        PhoneNumber pn = new PhoneNumber();
        List<String> res =  pn.letterCombinations("7");
        for (String str : res) {
            System.out.println(str);
        }
    }

}