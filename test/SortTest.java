import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {
    @Test
    void insertSortTest() {
        Sort sort = new Sort();
        int[] nums = {1, 3, 8, 2, 5, 10, 3};
        sort.insertSort(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }

    }

}