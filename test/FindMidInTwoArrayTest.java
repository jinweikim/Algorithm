import Exercise.FindMidInTwoArray;
import org.junit.jupiter.api.Test;

class FindMidInTwoArrayTest {
    @Test
    void test() {
        FindMidInTwoArray fita = new FindMidInTwoArray();
        int[] nums1 = {1, 3, 5, 9};
        int[] nums2 = {2, 4, 6};
        double ans = fita.findMedianSortedArrays(nums1, nums2);
        System.out.println(ans);
    }

}