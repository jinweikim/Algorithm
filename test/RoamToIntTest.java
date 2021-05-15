import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoamToIntTest {
    @Test
    void test() {
        RoamToInt rti = new RoamToInt();
        int res = rti.romanToInt("MCMXCIV");
        System.out.println(res);
    }

}