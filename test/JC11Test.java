import Exercise.JC11;
import org.junit.jupiter.api.Test;

class JC11Test {
    @Test
    void jcTest() {
        int[] nums = {3, 1, 3};
        JC11 jc = new JC11();
        System.out.println(jc.minArray(nums));
    }

}