public class Sort {

    public void insertSort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j > 0) {
                if (nums[j] < nums[j - 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = tmp;
                    j--;
                } else {
                    // 当 nums[j] >= nums[j - 1], 那么也不需要和前面的数再比较了，因为它们已经是有序的了
                    break;
                }
            }
        }
    }
}
