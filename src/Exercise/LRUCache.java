package Exercise;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    class DLinkedNode {
        int key;
        int value;

        DLinkedNode next;
        DLinkedNode prev;
        public DLinkedNode() {

        }

        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

    }

    Map<Integer, DLinkedNode> map = new HashMap<>();
    int capacity = 0;
    int size = 0;
    DLinkedNode head;
    DLinkedNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new DLinkedNode();
        this.tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLinkedNode node  = map.get(key);
        if (node == null) {
            return -1;
        } else {
            // 返回值的同时，还需要移到头部
            moveToHead(node);
            return node.value;
        }

    }

    public void put(int key, int value) {
        DLinkedNode node = map.get(key);
        if (node == null) {
            // 如果该节点不存在，则新建一个节点插入到链表头部
            node = new DLinkedNode(key, value);
            addToHead(node);
            map.put(key, node);
            size++;
            if (size > capacity) {
                // 如果超出容量，则移出尾结点，同时删除哈希表中对应项
                DLinkedNode removedNode = removeTail();
                map.remove(removedNode.key);
                size--;
            }
        } else {
            // 该节点已经存在的话，则改变节点的值，同时把他移到头部
            node.value = value;
            moveToHead(node);
        }

    }

    public void addToHead(DLinkedNode node) {
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    public void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public DLinkedNode removeTail() {
        DLinkedNode tai = tail.prev;
        removeNode(tai);
        return tai;
    }
}
