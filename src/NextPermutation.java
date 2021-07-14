public class NextPermutation {
    public void nextPermutation(int[] nums) {
        // 1. 寻找较小数
        int smallNumIndex = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                smallNumIndex = i;
                break;
            }
        }
        // 2. 寻找比 smallNum 大的数，且尽可能接近 smallNum, 如果 smllNumIndex < 0 代表原数组已经是一个降序的数组，则跳过这一步，直接反转区域
        if (smallNumIndex >= 0) {
            int bigNumIndex = 0;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[smallNumIndex]) {
                    bigNumIndex = i;
                    break;
                }
            }
            // 3.交换较小数与较大数
            swap(nums, smallNumIndex, bigNumIndex);
        }
        // 4. 让较大数的右边保持升序, 由于反转之前较大数右边可以保证是降序的，所以只需要将该区域反转即可变为升序
        reverse(nums, smallNumIndex + 1, nums.length);
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    // 反转数组指定区域
    public void reverse(int[] nums, int start, int end) {
        int left = start;
        int right = end - 1;
        while(left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
