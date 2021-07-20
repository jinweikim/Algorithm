public class SearchInRotationArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            //  刚好找到 target
            if (nums[mid] == target) {
                return mid;
            }
            // mid 在左边升序区间
            if (nums[0] <= nums[mid]) {
                // target 在左边升序区间
                if (nums[0] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // mid 在右边升序区间
                if (nums[mid] < target && target <= nums[nums.length - 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
