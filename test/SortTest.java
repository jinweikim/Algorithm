import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {
    Sort sort = new Sort();
    int[] nums = {1, 3, 8, 2, 5, 10, 3};
    @Test
    void insertSortTest() {
        sort.insertSort(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }

    }

    @Test
    void quickSortTest() {
        sort.quickSort(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    @Test
    void mergeSortTest() {
        sort.mergeSort(nums);
    }

    @Test
    void heapSortTest() {
        sort.heapSort(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}