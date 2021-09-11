import Exercise.JC07;
import Exercise.TreeNode;
import org.junit.jupiter.api.Test;

class JC07Test {

    @Test
    void jcTest() {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        JC07 jc = new JC07();
        TreeNode root = jc.buildTree(preorder, inorder);
    }

}