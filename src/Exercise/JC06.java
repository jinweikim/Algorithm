package Exercise;

import java.util.Stack;

public class JC06 {
    public int[] reversePrint(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        if (head == null) {
            return null;
        }
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int length = stack.size();
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}