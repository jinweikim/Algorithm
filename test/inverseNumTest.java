
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class inverseNumTest {
    @Test
    void test() {
        inverseNum in = new inverseNum();
        int res = in.reverseNum(-123);
        System.out.println(res);
    }

}