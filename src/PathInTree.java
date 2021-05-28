import java.util.LinkedList;
import java.util.List;

class PathInTree {
    List<List<Integer>> pathList = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        LinkedList<Integer> path = new LinkedList<>();
        backtrace(root, path, target);
        return pathList;
    }

    public void backtrace(TreeNode root, LinkedList<Integer> path, int target) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        target -= root.val;
        if (root.left == null && root.right == null && target == 0) {
            List<Integer> newPath = new LinkedList<>();
            for (int i = 0; i < path.size(); i++) {
                newPath.add(path.get(i));
            }
            pathList.add(newPath);
        }
        backtrace(root.left, path, target);
        backtrace(root.right, path, target);
        path.removeLast();
    }
}