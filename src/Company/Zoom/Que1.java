package Company.Zoom;

import java.util.Deque;
import java.util.LinkedList;

public class Que1 {
    public static int find(int[] nums) {
        int second = Integer.MIN_VALUE;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(nums[nums.length - 1]);
        int ans = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < second) {
                ans++;
            } else {
                while(!stack.isEmpty() && nums[i] > stack.peek()) {
                    second = Math.max(stack.pop(), second);
                }
                stack.push(nums[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1,3,2,0};
        int ans = find(nums);
        System.out.println(ans);
    }
}
