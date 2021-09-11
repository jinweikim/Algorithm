import Exercise.InverseString;
import org.junit.jupiter.api.Test;

class InverseStringTest {
    @Test
    void test() {
        InverseString is = new InverseString();
        String res= is.reverseWords("the sky is blue");
        System.out.println(res);
    }

}