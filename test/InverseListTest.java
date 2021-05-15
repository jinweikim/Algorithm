import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InverseListTest {
    @Test
    void test() {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.create(nums);
        InverseList il = new InverseList();
        ListNode res = il.reverseList2(head);
        res.printList();

    }

}