import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XOR3Test {
    @Test
    void test() {
        XOR3 xor = new XOR3();
        int[] arr = {1,3,4,8};
        int[][] queries = {{0,1}, {1,2}, {0,3},{3,3}};
        int[] res = xor.xorQueries(arr, queries);
        for (int i : res) {
            System.out.println(i);
        }
    }

}