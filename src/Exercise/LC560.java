package Exercise;

import java.util.HashMap;
import java.util.Map;

public class LC560 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int ans = subarraySum(nums, 3);
        System.out.println(ans);
    }
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int preSum = 0;
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            int need = preSum - k;
            int count = map.getOrDefault(need, 0);
            ans += count;
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }

        return ans;
    }
}
