package Company.lilith;

class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
      this.val = val;
    }
}
public class Que1 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode newHead = formatList(node1);
        while (newHead != null) {
            System.out.println(newHead.val);
        }
    }
    public static ListNode formatList(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        ListNode newHead = new ListNode(head.val);
        dummyHead.next = newHead;
        ListNode cur = head.next;
        boolean flag = true;
        while (cur != null) {
//            ListNode newCur = cur;
            if (flag) {
                newHead.next = new ListNode(cur.val);
                newHead = newHead.next;
                flag = false;
            } else {
                ListNode newNode = new ListNode(cur.val);
                newNode.next = dummyHead.next;
                dummyHead.next = newNode;
//                newCur.next = dummyHead.next;
//                dummyHead.next = ;
                flag = true;
            }
            cur = cur.next;
        }
        return dummyHead.next;
    }
}
