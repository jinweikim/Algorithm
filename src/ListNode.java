// 单链表
public class ListNode{

    int val;
    ListNode next;

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
}