import java.util.ArrayList;

public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public static TreeNode createTree(Integer[] nums){

        ArrayList<TreeNode> nodeList = new ArrayList<TreeNode>();

        if( nums.length == 0 ){
            return null;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] != null){
                TreeNode node = new TreeNode(nums[i]);
                nodeList.add(node);
            }
            if(nums[i] == null){
                nodeList.add(null);
            }
        }

        for(int i=0;i<nodeList.size();i++){

            if( i*2+1 < nodeList.size()){
                nodeList.get(i).left = nodeList.get(i*2+1);
            }
            if( i*2+2 < nodeList.size() ){
                nodeList.get(i).right = nodeList.get(i*2+2);
            }
        }

        return nodeList.get(0);
    }

    public static void main(String[] args){
        Integer[] nums = {1,2,2,3,3,null,null,4,4};
        TreeNode tn = new TreeNode(1);
        TreeNode node = tn.createTree(nums);
    }

}

