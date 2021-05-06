import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JC13Test {
    @Test
    void jcTest() {
        JC13 jc = new JC13();
        int res = jc.movingCount(1, 2, 1);
        System.out.println(res);
    }

}