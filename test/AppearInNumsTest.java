import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppearInNumsTest {
    @Test
    void test() {
        AppearInNums ain = new AppearInNums();
        int[] nums = {9,1,7,9,7,9,7};
        int res = ain.singleNumber(nums);
        System.out.println(res);
    }

}