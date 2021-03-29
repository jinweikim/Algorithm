public class MaxDepth {

    public static void main(String[] agrs){

        Integer[] nums = {5,3,6,2,4,null,null,1};
        TreeNode root = TreeNode.createTree(nums);
        System.out.println(getDepth(root));

    }

    public static int getDepth(TreeNode root){

        if( root == null){
            return 0;
        }
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        return Math.max(leftDepth,rightDepth)+1;
    }
}
