import Exercise.JZ14;
import org.junit.jupiter.api.Test;

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