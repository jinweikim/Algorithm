import Exercise.JZ22;
import Exercise.ListNode;
import org.junit.jupiter.api.Test;

class JZ22Test {
    @Test
    void test() {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.create(nums);
        JZ22 jz = new JZ22();
        ListNode resNode = jz.getKthFromEnd(head,2);
        resNode.printList();
    }

}