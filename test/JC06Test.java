import Exercise.JC06;
import Exercise.ListNode;
import org.junit.jupiter.api.Test;

class JC06Test {

    @Test
    void jcTest() {
        ListNode node0 = new ListNode(3);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node0.next = node1;
        node1.next = node2;
        JC06 jc = new JC06();
        int res[] = jc.reversePrint(node0);
        for (Integer i : res) {
            System.out.println(i);
        }
    }

}