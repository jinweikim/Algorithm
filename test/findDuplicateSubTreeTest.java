import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findDuplicateSubTreeTest {

    @Test
    void traverseTest() {
        Integer[] nums = {1,2,2,3,3,null,null,4,4};
        TreeNode tn = new TreeNode(1);
        TreeNode node = tn.createTree(nums);
        findDuplicateSubTree fds = new findDuplicateSubTree();
        fds.traverse(node);
        System.out.println(fds.memo);
    }
}