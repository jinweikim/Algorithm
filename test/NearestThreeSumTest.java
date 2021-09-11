import Exercise.NearestThreeSum;
import org.junit.jupiter.api.Test;

class NearestThreeSumTest {
    @Test
    void test() {
        NearestThreeSum nts = new NearestThreeSum();
        int[] nums = {1,-3,3,5,4,1};
        int res = nts.threeSumClosest(nums, 1);
        System.out.println(res);
    }
}