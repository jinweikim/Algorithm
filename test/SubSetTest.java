import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubSetTest {
    @Test
    void test() {
        SubSet ss = new SubSet();
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = ss.subsets(nums);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j));
            }
            System.out.println();
        }
    }

}