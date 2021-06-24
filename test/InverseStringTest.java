import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InverseStringTest {
    @Test
    void test() {
        InverseString is = new InverseString();
        String res= is.reverseWords("the sky is blue");
        System.out.println(res);
    }

}