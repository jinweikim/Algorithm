import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombineListTest {
    @Test
    void test() {
        CombineList cl = new CombineList();
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {1, 2, 4};
        ListNode l1 = ListNode.create(nums1);
        ListNode l2 = ListNode.create(nums2);
        ListNode res = cl.mergeTwoLists(l1, l2);
        res.printList();
    }

}