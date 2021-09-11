package Exercise;

import java.util.HashMap;
import java.util.Map;

public class PathSum3 {

    public static void main(String[] args){

        Integer[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        TreeNode root = TreeNode.createTree(nums);
        int target = 15;
        Map<Integer,Integer> map = new HashMap<>(); //记录到当前节点及其之前节点的前缀和以及对应的数量
        map.put(0,1); // 前缀和为0的一条路路径

        System.out.println(recurPath(root,map,target,0));

    }

    public static int recurPath(TreeNode root,Map<Integer,Integer> map,int target,int curSum){
        if(root == null){
            return 0;
        }

        int res = 0;

        curSum += root.val;

        res += map.getOrDefault(curSum-target,0);
        map.put(curSum,map.getOrDefault(curSum,0) + 1);

        res += recurPath(root.left,map,target,curSum);
        res += recurPath(root.right,map,target,curSum);

        map.put(curSum,map.get(curSum)-1);
        return res;


    }
}
