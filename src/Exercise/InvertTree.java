package Exercise;

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree {

    public static void main(String[] args){

    }

    public static TreeNode invert(TreeNode root){

        if( root == null){
            return null;
        }

        TreeNode left = invert(root.left);
        TreeNode right = invert(root.right);
        root.left = right;
        root.right = left;

        return root;

    }

    // 非递归
    public static TreeNode invertNoRec(TreeNode root){

        if(root == null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while( !queue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;

            if(node.left != null){
                queue.offer(node.left);
            }

            if(node.right != null){
                queue.offer(node.right);
            }
        }

        return root;
    }

    // 递归
    public static TreeNode invertTree(TreeNode root){

        if( root == null){
            return null;
        }

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
