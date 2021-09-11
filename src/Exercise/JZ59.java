package Exercise;

import java.util.Deque;
import java.util.LinkedList;

public class JZ59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new LinkedList<>();
        int[] ans = new int[nums.length - k + 1];

        for (int i = 1 - k, j = 0; j < nums.length; i++, j++) {
            if (i > 0 && queue.peekFirst() == nums[i - 1]) {
                queue.pollFirst();
            }
            while (!queue.isEmpty() && nums[j] > queue.peekLast()) {
                queue.pollLast();
            }
            queue.offerLast(nums[j]);
            if (i >= 0) {
                ans[i] = queue.peekFirst();
            }
        }
        return ans;
    }
}
