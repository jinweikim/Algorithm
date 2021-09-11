import Exercise.ValidBracket;
import org.junit.jupiter.api.Test;

class ValidBracketTest {
    @Test
    void test() {
        ValidBracket vb = new ValidBracket();
        boolean res = vb.isValid("()[]{}");
        System.out.println(res);
    }

}