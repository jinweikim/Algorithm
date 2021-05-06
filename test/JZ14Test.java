import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JZ14Test {
    @Test
    void test() {
        JZ14 jz = new JZ14();
        int res = jz.cuttingRope1(3);
        System.out.println(res);
        res = jz.cuttingRope2(10);
        System.out.println(res);
    }

}