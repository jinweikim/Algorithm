import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotationArrayTest {
    @Test
    void test() {
        SearchInRotationArray sira = new SearchInRotationArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int ans = sira.search(nums, 0);
        System.out.println(ans);
    }

}