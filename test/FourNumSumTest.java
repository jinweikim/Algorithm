import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FourNumSumTest {
    @Test
    void test() {
        FourNumSum fns = new FourNumSum();
        int[] nums = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> res = fns.fourSum(nums, 0);
        for (List<Integer> list : res) {
            for (Integer num : list) {
                System.out.println(num);
            }
        }
    }

}