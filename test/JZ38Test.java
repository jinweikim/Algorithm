
import Exercise.JZ38;
import org.junit.jupiter.api.Test;

class JZ38Test {
    @Test
    void test() {
        JZ38 jz = new JZ38();
        String[] res = jz.permutation("aab");
        for (String s : res) {
            System.out.println(s);
        }
    }

}