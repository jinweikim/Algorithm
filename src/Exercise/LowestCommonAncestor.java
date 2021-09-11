package Exercise;

import java.util.Stack;

public class LowestCommonAncestor {

    public static void main(String[] args){

        Integer[] nums = {5,3,6,2,4,null,null,1};
        TreeNode root = TreeNode.createTree(nums);
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(4);
        System.out.println(solution(root,p,q).val);
    }

    public static TreeNode solution(TreeNode root, TreeNode p, TreeNode q){

        Stack<TreeNode> stack1 = search(root,p);
        Stack<TreeNode> stack2 = search(root,q);
        while( !stack1.isEmpty() ){
            TreeNode x = stack1.pop();
            int i = stack2.size()-1;
            while( i >= 0){
                TreeNode y = stack2.get(i);
                if( x.val == y.val){
                    return x;
                }
                i--;
            }
        }
        return root;

    }

    public static Stack<TreeNode> search(TreeNode root, TreeNode target){
        Stack<TreeNode> stack = new Stack<>();

        while(root != null){
            stack.push(root);
            if( root.val == target.val){
                return stack;
            }else if( root.val > target.val){
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return stack;

    }
}
