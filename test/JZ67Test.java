import Exercise.JZ67;
import org.junit.jupiter.api.Test;

class JZ67Test {
    @Test
    void test() {
        String str = "9223372036854775808";
        JZ67 jz = new JZ67();
        int res = jz.strToInt(str);
        System.out.println(res);
    }

}