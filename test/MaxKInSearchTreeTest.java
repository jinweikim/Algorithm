import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxKInSearchTreeTest {
    @Test
    void test() {
        MaxKInSearchTree maxKInSearchTree = new MaxKInSearchTree();
        Integer nums[] = {5,3,6,2,4,null,null,1};
        TreeNode root = TreeNode.createTree(nums);
        int res = maxKInSearchTree.kthLargest(root, 3);
        System.out.println(res);
    }

}