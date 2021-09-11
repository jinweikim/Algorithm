package Exercise;

public class CheckBalance {

    public static boolean flag = true;

    public static void main(String[] agrs){
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node6 = new TreeNode(6);
//        TreeNode node7 = new TreeNode(7);
//        TreeNode node8 = new TreeNode(8);
//        TreeNode node9 = new TreeNode(9);
//        TreeNode node10 = new TreeNode(10);
//        TreeNode node11 = new TreeNode(11);
//        TreeNode node12 = new TreeNode(12);
//        TreeNode node15 = new TreeNode(15);
//
//        node10.left = node8;
//        node10.right = node12;
//        node8.left = node6;
//        node8.right = node9;
//        node12.left = node11;
//        node12.right = node15;
//        node6.left = node4;
//        node6.right = node7;
        Integer[] nums = {2,1,3};
        TreeNode root = TreeNode.createTree(nums);

        System.out.println(isBalanced(root));
        System.out.println(flag);
    }

    public static boolean isBalanced(TreeNode root) {
        flag = true;

        if( root == null ){
            flag = true;
            return flag;
        }

        getHeight(root);
        return flag;
    }

    public static int getHeight(TreeNode root){

        if( root == null){
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        int diff = Math.abs(leftHeight - rightHeight);

        if(diff > 1){
            flag = false;
        }
        int height = Math.max(leftHeight,rightHeight) + 1;

        return height;
    }
}
