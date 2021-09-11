package Exercise;

import java.util.ArrayList;

public class XOR5 {
    public int findMaximumXOR(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        int n = list.size();
        int max = Integer.MAX_VALUE;
        int res = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                res = Math.max(nums[i] ^ nums[j], res);
            }
        }
        return res;
    }
}
