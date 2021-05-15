import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubTreeStructureTest {
    @Test
    void test() {
        SubTreeStructure sts = new SubTreeStructure();
        Integer[] numsA = {1, 2, 3, 4};
        Integer[] numsB = {3};
        TreeNode treeA = TreeNode.createTree(numsA);
        TreeNode treeB = TreeNode.createTree(numsB);
        boolean res = sts.isSubStructure(treeA, treeB);
        System.out.println(res);
    }

}