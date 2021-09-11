import Exercise.RoamToInt;
import org.junit.jupiter.api.Test;

class RoamToIntTest {
    @Test
    void test() {
        RoamToInt rti = new RoamToInt();
        int res = rti.romanToInt("MCMXCIV");
        System.out.println(res);
    }

}