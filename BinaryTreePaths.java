import java.util.ArrayList;
import java.util.LinkedList;

public class BinaryTreePaths {

    public static void main(String[] args){
        Integer[] nums = {1,2,3,null,5};
        TreeNode root = TreeNode.createTree(nums);
        BinaryTreePaths btp = new BinaryTreePaths();
        LinkedList<String> paths = new LinkedList<>();
        btp.getPaths(root,"",paths);
        for(String path : paths){
            System.out.println(path);
        }
    }

    public void getPaths(TreeNode root, String path, LinkedList<String> paths){
        if( root != null ){
            path += Integer.toString(root.val);
            if(root.left == null && root.right == null){
                paths.add(path);
            }else{
                path += "->";
                getPaths(root.left,path,paths);
                getPaths(root.right,path,paths);
            }
        }
    }

}
