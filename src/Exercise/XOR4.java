package Exercise;

import java.util.LinkedList;

public class XOR4 {
    int resSum = 0;
    public int subsetXORSum(int[] nums) {
        dfs(nums, 0, 0);
        return resSum;
    }

    public void dfs(int[] nums, int index, int xorRes) {
        if (index == nums.length) {
            resSum += xorRes;
            return;
        }

        // 选择 index
        dfs(nums, index + 1, nums[index] ^ xorRes);
        // 不选择 index
        dfs(nums, index + 1, xorRes);

    }
    public int subsetXORSum2(int[] nums) {
        int resSum = 0;
        int n = nums.length;
        for (int i = 0; i < (1 << n); i++) {
            int resXOR = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (j << n)) > 0) {
                    resXOR ^= nums[j];
                }
            }
            resSum += resXOR;
        }
        return resSum;
    }
}
