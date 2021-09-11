import Exercise.MaxSlidingWindow;
import org.junit.jupiter.api.Test;

class MaxSlidingWindowTest {
    @Test
    void test() {
        MaxSlidingWindow msw = new MaxSlidingWindow();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] res = msw.maxSlidingWindow(nums, 3);
        for (int r : res) {
            System.out.println(r);
        }

    }

}