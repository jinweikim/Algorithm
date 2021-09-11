
import Exercise.inverseNum;
import org.junit.jupiter.api.Test;

class inverseNumTest {
    @Test
    void test() {
        inverseNum in = new inverseNum();
        int res = in.reverseNum(-123);
        System.out.println(res);
    }

}