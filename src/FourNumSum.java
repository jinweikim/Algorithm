import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourNumSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int first = 0; first < len - 3; first++) {
            if (first > 0 && nums[first] == nums[first- 1]) {
                continue;
            }
            // 剪枝
            if (nums[first] + nums[len - 3] + nums[len - 2] + nums[len - 1] < target) {
                continue;
            }
            // 剪枝
            if (nums[first] + nums[first + 1] + nums[first + 2] + nums[first + 3] > target) {
                break;
            }
            for (int second = first + 1; second < len - 2; second++) {
                // 剪枝
                if (nums[first] + nums[second] + nums[len - 2] + nums[len - 1] < target) {
                    continue;
                }
                // 剪枝
                if (nums[first] + nums[second] + nums[second + 1] + nums[second + 2] > target) {
                    break;
                }
                if (second > first + 1 && nums[second] == nums[second- 1]) {
                    continue;
                }
                int forth = len - 1;
                for (int third = second + 1; third < len; third++) {
                    if (third > second + 1 && nums[third] == nums[third- 1]) {
                        continue;
                    }
                    while (third < forth && nums[first] + nums[second] + nums[third] + nums[forth] > target) {
                        forth--;
                    }
                    if (third == forth) {
                        continue;
                    }
                    if (nums[first] + nums[second] + nums[third] + nums[forth] == target) {
                        List<Integer> ansOne = new ArrayList<>();
                        ansOne.add(nums[first]);
                        ansOne.add(nums[second]);
                        ansOne.add(nums[third]);
                        ansOne.add(nums[forth]);
                        ans.add(ansOne);
                    }
                }
            }
        }
        return ans;
    }
}
