package Exercise;

public class LC153 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1 ,2};
        int ans = findMin(nums);
        System.out.println(ans);
    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
        }
        return nums[left];
    }

}
