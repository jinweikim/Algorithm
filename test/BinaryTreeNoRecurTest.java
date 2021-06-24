import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeNoRecurTest {
    @Test
    void test() {
        BinaryTreeNoRecur btnr = new BinaryTreeNoRecur();
        Integer[] numsA = {5,4,8,11,null,13,4,7,2,null,null,5,1};
        TreeNode root = TreeNode.createTree(numsA);
        List<Integer> preRes = btnr.preOrder(root);
        List<Integer> inRes = btnr.inOrder(root);
        List<Integer> postRes = btnr.postOrder(root);
        for(Integer value : preRes) {
            System.out.print(value + " ");
        }
        System.out.println();
        for(Integer value : inRes) {
            System.out.print(value + " ");
        }
        System.out.println();
        for(Integer value : postRes) {
            System.out.print(value + " ");
        }
    }

}