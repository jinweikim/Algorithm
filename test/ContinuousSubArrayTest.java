import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContinuousSubArrayTest {
    @Test
    void test() {
        ContinuousSubArray csa = new ContinuousSubArray();
        int[] array = {-2 ,1 ,-3 ,4 ,-1 ,2 ,1 ,-5 ,4};
        int res = csa.maxSubArray(array);
        System.out.println(res);
    }

}