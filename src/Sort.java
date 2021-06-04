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

    public void quickSort(int[] nums) {
        quickSortRecur(nums, 0, nums.length - 1);
    }

    public void quickSortRecur(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int rawLeft = left;
        int rawRight = right;
        int base = nums[left]; // 基准数被保存;
        while (left < right) {
            while(left < right && nums[right] >= base) {
                right--;
            }
            nums[left] = nums[right];
            while(left < right && nums[left] <= base) {
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = base;
        quickSortRecur(nums, rawLeft, left - 1);
        quickSortRecur(nums, right + 1, rawRight);
    }

    public void mergeSort(int[] nums) {
        // 归并排序辅助数组
        int[] temp = new int[nums.length];
        mergeSortRecur(nums, 0, nums.length - 1, temp);
    }

    public void mergeSortRecur(int[] nums, int left, int right, int[] temp) {
        if (left == right) {
            return;
        }
        // 避免 left, right 直接相加溢出
        int mid = left + (right - left) / 2;
        mergeSortRecur(nums, left, mid, temp);
        mergeSortRecur(nums, mid + 1, right, temp);
        // 左边区域已经全部小于右边区域，无需再归并
        if (nums[mid] <= nums[mid + 1]) {
            return;
        }
        merge(nums, left, mid, right, temp);
    }

    private void merge(int[] nums, int left, int mid, int right, int[] temp) {
        for (int i = left; i <= right; i++) {
            temp[i] = nums[i];
        }

        int i = left;
        int j = mid + 1;
        for (int k = left; k <= right; k++) {
            // 左边已归并完，只需要把右边元素依次放进新数组中
            if (i == mid + 1) {
                nums[k] = temp[j];
                j++;
            } else if (j == right + 1){
                // 右边已归并完，只需要把左边元素依次放进新数组中
                nums[k] = temp[i];
                i++;
            } else if (temp[i] <= temp[j]) {
                nums[k] = temp[i];
                i++;
            } else {
                nums[k] = temp[j];
                j++;
            }
        }
    }

    public void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
