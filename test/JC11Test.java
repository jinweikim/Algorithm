import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JC11Test {
    @Test
    void jcTest() {
        int[] nums = {3, 1, 3};
        JC11 jc = new JC11();
        System.out.println(jc.minArray(nums));
    }

}