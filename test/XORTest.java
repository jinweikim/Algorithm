import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XORTest {
    @Test
    void test() {
        XOR xor = new XOR();
        int[] decode = {1, 2, 3};
        int first = 1;
        int[] res = xor.decode(decode, first);
        for (int i : res) {
            System.out.println(i);
        }
    }

}