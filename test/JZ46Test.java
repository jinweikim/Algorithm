import Exercise.JZ46;
import org.junit.jupiter.api.Test;

class JZ46Test {
    @Test
    void test() {
        JZ46 jz = new JZ46();
        int res = jz.translateNum(25);
        int res2 = jz.translateNum2(25);
        System.out.println(res);
        System.out.println(res2);
    }

}