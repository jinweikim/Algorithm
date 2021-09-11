package Exercise;

public class MinHeightBST {

    public static void main(String[] args){
        int[] nums = {-10,-3,0,5,9};
        TreeNode rootAll = createTree(nums,0,nums.length-1);
        System.out.println(rootAll.val);
    }

    public static TreeNode createTree(int[] nums,int start,int end){
        int length = end - start + 1;
        if(length <= 0){
            return null;
        }

        int mid = (end + start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        TreeNode left = createTree(nums,start,mid-1);
        TreeNode right = createTree(nums,mid+1,end);
        root.left = left;
        root.right = right;
        return root;

    }
}
