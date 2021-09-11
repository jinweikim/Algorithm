import Exercise.midInTwoArray;
import org.junit.jupiter.api.Test;

class midInTwoArrayTest {
    @Test
    void test () {
        midInTwoArray mita = new midInTwoArray();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double res = mita.findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
    }

}