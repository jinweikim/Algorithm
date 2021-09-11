package Exercise;

public class FindMidInTwoArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 保证 nums1 是较短的数组
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int m = nums1.length;
        int n = nums2.length;
        // 分割线左边的元素个数需要满足 (m + n + 1) / 2, 无论总数奇偶都可以用该表达式
        int totalLeft = (m + n + 1) / 2;

        int left = 0;
        int right = m;

        // 在 nums1 的区间 [0, m] 中寻找恰到的分割线
        // 使得 nums1[i - 1] <= nums2[j] && nums2[j - 1] <= nums1[i]
        while (left < right) {
            // nums1 在分割线左边的元素个数
            int i = left + (right - left + 1) / 2;
            // nums2 在分割线左边的元素个数
            int j = totalLeft - i;
            if (nums1[i - 1] > nums2[j]) {
                // 说明 nums1 中的分割线过于靠右了，需要往左移
                right = i - 1;
            } else {
                left = i;
            }
        }
        int i = left; // nums1 处的分割线位置
        int j = totalLeft - i; // nums2 处的分割线位置
        int nums1Left = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
        int nums1Right = i == m ? Integer.MAX_VALUE : nums1[i];
        int nums2Left = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
        int nums2Right = j == n ? Integer.MAX_VALUE : nums2[j];
        if ((m + n) % 2 != 0) {
            // 两数组长度和为奇数时，中位数为分割线左边两个数的最大值
            return Math.max(nums1Left, nums2Left);
        } else {
            // 两数组长度和为偶数时，中位数为分割线左边最大值以及右边最小值的平均数
            return (double)(Math.max(nums1Left, nums2Left) + Math.min(nums1Right, nums2Right)) / 2;
        }
    }
}
