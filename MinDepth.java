public class MinDepth {

    public static void main(String[] args){
        Integer[] nums = {1,2};
        TreeNode root = TreeNode.createTree(nums);
        System.out.println(solution(root));
    }

    public static int solution(TreeNode root){

        if( root == null){
            return 0;
        }

        // 当左右子树均为null，代表该节点为叶子节点，返回深度1
        if( root.left == null && root.right == null){
            return 1;
        }
        int Max_Value = Integer.MAX_VALUE;
        int leftMin = Math.min(solution(root.left), Max_Value);
        int rightMin = Math.min(solution(root.right), Max_Value);

        // 当root左右子树有且仅有一个为null时，返回较大子树的最小深度+1(因为当前节点不是叶子节点)，此时另一个子树深度为0，所以可以统一加上再返回
        if( root.left == null || root.right == null){
            return leftMin + rightMin + 1;
        }

        // 当左右子树均不为null时，返回左右子树深度的较小值
        return Math.min(leftMin,rightMin)+1;
    }
}
