package Exercise;

import java.util.Stack;


public class convertBiNode {

    public static TreeNode newNode = new TreeNode(0);
    public static TreeNode currentNode = newNode;

    public static void main(String[] args) {

        TreeNode node4 = new TreeNode(4);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        TreeNode node10 = new TreeNode(10);
        TreeNode node11 = new TreeNode(11);
        TreeNode node12 = new TreeNode(12);
        TreeNode node15 = new TreeNode(15);

        node10.left = node8;
        node10.right = node12;
        node8.left = node6;
        node8.right = node9;
        node12.left = node11;
        node12.right = node15;
        node6.left = node4;
        node6.right = node7;

//        inorder(node10);
//        System.out.println("===========");

//        inorderPrin(newNode);
//        System.out.println("===========");

        inorderNoRec(node10);


    }

    public static void inorder(TreeNode root) {

        if (root == null) {
            return;
        }
        inorder(root.left);
        visit(root);
        inorder(root.right);
    }

    public static void visit(TreeNode root) {
        System.out.println(root.val);
        currentNode.left = null;
        currentNode.right = root;
        currentNode = root;

    }

    //中序遍历，仅仅打印节点值
    public static void inorderPrin(TreeNode root) {

        if (root == null) {
            return;
        }
        inorderPrin(root.left);
        System.out.println(root.val);
        inorderPrin(root.right);
    }

    public static void inorderNoRec(TreeNode root) {

        TreeNode tn = root;
        Stack<TreeNode> stack = new Stack<>();

        while (tn != null || !stack.isEmpty()) {
            if (tn != null) {
                stack.push(tn);
                tn = tn.left;
            } else {
                tn = stack.pop();
                currentNode.left = null;
                currentNode.right = tn;
                currentNode = tn;
                System.out.println(tn.val);
                tn = tn.right;
            }
        }

    }

}
