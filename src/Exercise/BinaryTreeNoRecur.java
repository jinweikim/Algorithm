package Exercise;

import java.util.*;

public class BinaryTreeNoRecur {
    /**
     * 二叉树非递归遍历
     */
    public List<Integer> preOrder(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                res.add(root.val);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return res;
    }

    public List<Integer> inOrder(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }

    public List<Integer> postOrder(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        Map<TreeNode, Integer> map = new HashMap<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                map.put(root, 1);
                root = root.left;
            }
            root = stack.peek();
            if (map.get(root) == 2) {
                // 左右子树都遍历完了
                root = stack.pop();
                res.add(root.val);
                root = null; // 往上走
            } else {
                // 代表其右子树还没遍历完
                map.put(root, 2);
                root = root.right;
            }
        }
        return res;
    }
}
