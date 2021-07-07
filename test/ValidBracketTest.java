import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidBracketTest {
    @Test
    void test() {
        ValidBracket vb = new ValidBracket();
        boolean res = vb.isValid("()[]{}");
        System.out.println(res);
    }

}