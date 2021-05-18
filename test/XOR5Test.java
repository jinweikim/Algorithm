import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XOR5Test {
    @Test
    void test() {
        XOR5 xor = new XOR5();
        int[] nums = {3, 10, 5, 25, 2, 8};
        int res = xor.findMaximumXOR(nums);
        System.out.println(res);
    }

}