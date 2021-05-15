import java.util.LinkedList;

public class InverseList {

    // 反转链表

    private static ListNode successor;

    private static ListNode left;

    public static void main(String[] args){
        ListNode node0 = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(0);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node0.printList();
//        ListNode newNode = inverseAllList(node0);
//        newNode.printList();

//        ListNode newNode = inverserNList(node0,3);
//        newNode.printList();

//        ListNode newNode = inverseBetweenList(node0,2,6);
//        newNode.printList();

//        ListNode newNode = inverseListIteration(node0);
//        newNode.printList();

//        ListNode newNode = inversePartListIteration(node0, node3);
//        newNode.printList();

//        ListNode newNode = inverseKGroupList(node0,2);
//        newNode.printList();

        System.out.println(isPalindrome(node0));

        System.out.println(isPalindromeOpt(node0));
        node0.printList();
    }

    // 反转整个链表
    public static ListNode inverseAllList(ListNode head){

        if(head.next == null){
            return head;
        }

        ListNode last = inverseAllList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    // 反转链表前 N 个结点
    public static ListNode inverserNList(ListNode head, int n){

        if(n == 1){
            successor = head.next;
            return head;
        }

        ListNode last = inverserNList(head.next, n-1);
        head.next.next = head;
        head.next = successor;
        return last;
    }

    // 反转链表 m 至 n 处的结点
    public static ListNode inverseBetweenList(ListNode head, int m, int n){
        if(m == 1){
            return inverserNList(head, n);
        }
        head.next = inverseBetweenList(head.next, m-1, n-1);
        return head;

    }

    // 迭代方式反转整个链表
    public static ListNode inverseListIteration(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode nxt;
        while(cur != null){
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }

    public ListNode reverseList2(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;

    }

    // 迭代方式反转开头到b处的链表, 未连接，[head,b), 左闭右开
    public static ListNode inversePartListIteration(ListNode head, ListNode b){
        ListNode pre = null;
        ListNode cur = head;
        ListNode nxt;
        while(cur != b){
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }

    // K个一组反转链表
    public static ListNode inverseKGroupList(ListNode head, int k){
        if(head == null){
            return null;
        }
        ListNode a, b;
        a = b = head;
        for(int i=0; i < k; i++){
            if(b == null){
                return head; // 不足 k 个，直接返回头结点
            }
            b = b.next;
        }
        ListNode newHead = inversePartListIteration(a, b);
        a.next = inverseKGroupList(b, k);
        return newHead;
    }

    // 判断是否为回文链表
    public static boolean isPalindrome(ListNode head){
        left = head;
        return traverse(head);
    }

    public static boolean traverse(ListNode right){
        if( right == null){
            return true;
        }
        boolean res = traverse(right.next);
        res = res && (left.val == right.val);
        left = left.next;
        return res;
    }

    public static boolean isPalindromeOpt(ListNode head){
        ListNode slow, fast, p, q; // p, q用于还原链表结构
        p = slow = fast = head;
        while(fast != null && fast.next != null){
            p = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){ // 若 fast 此时未指向 null，则代表链表长度为奇数，此时 slow 需要再移动到下一位
            p = slow;
            slow = slow.next; // 此时 slow 指向链表后半段的开头
        }

        ListNode left = head;
        ListNode right = inverseListIteration(slow); // 反转从 slow 开始的链表
        q = right;

        // 依次比较两个链表各结点值是否相同
        while( right != null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        p.next = inverseListIteration(q);
        return true;
    }
}
