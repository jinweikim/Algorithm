public class JC07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, preorder.length, 0, inorder.length);
    }

    public TreeNode build(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        // base case
        if (preStart >= preEnd) {
            return null;
        }
        // 前序遍历第一个值为根节点，找到这个值在中序遍历中的 index
        int rootIndex = 0;
        int rootVal = preorder[preStart];
        for (int i = inStart; i < inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);
        int leftSize = rootIndex - inStart;
        int rightSize = inEnd - rootIndex - 1;
        root.left = build(preorder, inorder, preStart + 1, preStart + leftSize + 1, inStart, inStart + leftSize);
        root.right = build(preorder, inorder, preStart + leftSize + 1, preEnd, rootIndex + 1, inEnd);
        return root;
    }
}
