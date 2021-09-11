package Exercise;

import java.util.*;

public class Exercise {

    public List<Integer> preOder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();

        stack.push(root);
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                ans.add(root.val);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }

        return ans;
    }

    public List<Integer> inOrder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();

        stack.push(root);
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            ans.add(root.val);
            root = root.right;
        }
        return ans;
    }

    public List<Integer> postOrder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        Map<TreeNode, Integer> map = new HashMap<>();

        stack.push(root);
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                map.put(root, 1);
                root = root.left;
            }

            root = stack.peek();

            if (map.get(root) == 1) {
                map.put(root, 2);
                root = root.right;
            } else if (map.get(root) == 2) {
                root = stack.pop();
                ans.add(root.val);
                root = null;
            }
        }
        return ans;
    }
}
