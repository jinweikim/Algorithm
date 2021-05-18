import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XOR4Test {
    @Test
    void test() {
        int[] nums = {1, 3};
        XOR4 xor = new XOR4();
        int res = xor.subsetXORSum2(nums);
        System.out.println(res);
    }

}