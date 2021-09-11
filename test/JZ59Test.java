import Exercise.JZ59;
import org.junit.jupiter.api.Test;

class JZ59Test {
    @Test
    void test() {
        JZ59 jz = new JZ59();
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int[] ans = jz.maxSlidingWindow(nums, 3);
        for (int n : ans)  {
            System.out.println(n);
        }
    }

}