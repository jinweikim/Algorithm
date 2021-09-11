package Exercise;

import java.util.LinkedList;
import java.util.List;

public class JZ34 {

    List<List<Integer>> pathList = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        backtrace(root, target, new LinkedList<Integer>());
        return pathList;
    }

    public void backtrace(TreeNode root, int target, List<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            pathList.add(new LinkedList<Integer>(path));
        }

        backtrace(root.left, target, path);
        backtrace(root.right, target, path);
        path.remove(path.size() - 1);
    }
}
