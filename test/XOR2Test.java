import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XOR2Test {
    @Test
    void test() {
        int[] encoded = {6, 5, 4, 6};
        XOR2 xor = new XOR2();
        int[] perm = xor.decode(encoded);

        for (Integer i : perm) {
            System.out.println(i);
        }
    }

}