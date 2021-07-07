import java.util.Arrays;

public class NearestThreeSum {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int best = nums[0] + nums[1] + nums[2];
        for (int first = 0; first < nums.length; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int second = first + 1;
            int third = nums.length - 1;
            while (second < third) {
                int sum = nums[first] + nums[second] + nums[third];

                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                if (sum == target) {
                    return sum;
                }
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                // 三数和超过了 target, third 往左移, 直到找到一个不相等的数
                if (sum > target) {
                    int newThird = third - 1;
                    while (newThird > second && nums[newThird] == nums[third]) {
                        newThird--;
                    }
                    third = newThird;
                }

                // 三数和小于 target, second 往右移, 直到找到一个不相等的数
                if (sum < target) {
                    int newSecond = second + 1;
                    while (third > newSecond && nums[newSecond] == nums[second ]) {
                        newSecond++;
                    }
                    second = newSecond;
                }
            }
        }
        return best;
    }
}
