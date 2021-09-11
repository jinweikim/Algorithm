package Company.Zoom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Que2 {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] ans = slideWindow(nums, 3, 1 );
        for (Integer a : ans) {
            System.out.println(a);
        }
    }

    public static int[] slideWindow(int[] nums, int windowSize, int step) {
        ArrayList<Integer> ans = new ArrayList<>();
//        int[] ans = new int[windowSize];
        Deque<Integer> queue = new LinkedList<>();
        if (nums.length < windowSize) {
            Arrays.sort(nums);
            return new int[]{nums[nums.length - 1]};
        }
        for (int i = 0; i < nums.length; i += step) {
            while (!queue.isEmpty() && queue.peek() < i - windowSize + 1) {
                queue.poll();
            }

            while (!queue.isEmpty() && nums[i] > nums[queue.getLast()]) {
                queue.removeLast();
            }
            queue.add(i);
            if (i >= windowSize - 1) {
                ans.add(nums[queue.peek()]);
            }
        }
        while (!queue.isEmpty()) {
            ans.add(queue.poll());
        }
        int[] ansArray = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            ansArray[i] = ans.get(i);
        }
        return ansArray;

    }
}
