public class SumOfLeftLeaves {

    public static void main(String[] args){

        Integer[] nums = {5,3,6,2,4,null,null,1};
        TreeNode root = TreeNode.createTree(nums);
        System.out.println(solution(root,true));
    }

    public static int solution(TreeNode root,boolean flag){

        if( root == null){
            return 0;
        }

        if( flag && root.left == null && root.right == null){
            return root.val;
        }

        int leftSum = solution(root.left, true);
        int rightSum = solution(root.right, false);

        return leftSum + rightSum;
    }
}
