package Exercise;

public class MaxKInSearchTree {
    public int res;
    public int k;
    public int kthLargest(TreeNode root, int k) {
        res = 0;
        this.k = k;
        inOrder(root);
        return res;

    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.right);
        if (k == 0) {
            return;
        }
        k--;
        if (k == 0) {
            res = root.val;
            return;
        }
        inOrder(root.left);
    }
}
