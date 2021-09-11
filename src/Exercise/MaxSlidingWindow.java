package Exercise;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 1 - k, j = 0; j < nums.length; i++, j++) {
            if (i > 0 && deque.peekFirst() == nums[i - 1]) {
                deque.removeFirst();
            }
            while(!deque.isEmpty() && deque.peekLast() < nums[j]) {
                deque.removeLast();
            }
            deque.addLast(nums[j]);
            if (i >= 0) {
                res[i] = deque.peekFirst();
            }
        }
        return res;
    }
}
