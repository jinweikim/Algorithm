import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

    public static void main(String[] args){

        Integer[] num0 = {1,2,2,3,3,3,3};
        TreeNode root = TreeNode.createTree(num0);

        System.out.println(checkSymmetric(root,root));


    }

    public static boolean checkSymmetric(TreeNode p,TreeNode q){
        if( p == null && q == null){
            return true;
        }
        if( p == null || q == null){ // 有且仅有一个子树时为null
            return false;
        }

        return p.val == q.val && checkSymmetric(p.left, q.right) && checkSymmetric(p.right, q.left);

    }

    public static boolean checkSymmetricNoRec(TreeNode u,TreeNode v){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(u);
        queue.offer(v);

        while( !queue.isEmpty()){

            u = queue.poll();
            v = queue.poll();

            if( u == null && v == null){
                continue;
            }
            if( (u == null || v == null) || (u.val != v.val)){
                return false;
            }

            queue.offer(u.left);
            queue.offer(v.right);

            queue.offer(u.right);
            queue.offer(v.left);

        }

        return true;
    }
}
