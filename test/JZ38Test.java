
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JZ38Test {
    @Test
    void test() {
        JZ38 jz = new JZ38();
        String[] res = jz.permutation("abc");
        for (String s : res) {
            System.out.println(s);
        }
    }

}