package Exercise;

// 单链表
public class ListNode{

    int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // 打印链表 0->1->2->3
    public void printList(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(val);
        ListNode node = next;

        while(node != null){
            stringBuilder.append("->");
            stringBuilder.append(node.val);
            node = node.next;
        }
        System.out.println(stringBuilder);
    }

    // 通过数组构建链表
    public static ListNode create(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;
        for (int i = 1; i < nums.length; i++) {
            ListNode nextNode = new ListNode(nums[i]);
            cur.next = nextNode;
            cur = cur.next;
        }
        System.out.println("构建好的链表为: " );
        head.printList();
        return head;
    }
}