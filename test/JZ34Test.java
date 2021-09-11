import Exercise.JZ34;
import Exercise.TreeNode;
import org.junit.jupiter.api.Test;

class JZ34Test {
    @Test
    void test() {
        JZ34 jz = new JZ34();
        Integer[] numsA = {5,4,8,11,null,13,4,7,2,null,null,5,1};
        TreeNode treeA = TreeNode.createTree(numsA);
        jz.pathSum(treeA, 22);
    }

}