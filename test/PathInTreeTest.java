import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathInTreeTest {
    @Test
    void test(){
        PathInTree pit = new PathInTree();
        Integer[] numsA = {5,4,8,11,null,13,4,7,2,null,null,5,1};
        TreeNode treeA = TreeNode.createTree(numsA);
        pit.pathSum(treeA, 22);
    }

}