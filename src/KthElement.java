public class KthElement {
    public int findKthLargest(int[] nums, int k) {
        // 利用 nums 前 k 个元素建立一个大小为 k 的小根堆
        buildHeap(nums, k);
        // 此时堆顶即第一个元素是最小值，从 nums 第 k 个元素之后进行遍历，如果有大于堆顶的元素，则将其替换成堆顶，并重新调整堆（相当于向堆中插入一个元素）
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > nums[0]) {
                nums[0] = nums[i];
                headAdjust(nums, 0, k);
            }
        }
        // 遍历完全部元素后，堆顶就是第 k 个最大的元素了
        return nums[0];
    }
    public void buildHeap(int[] nums, int k) {
        // 从第一个非叶子节点开始调整
        for (int i = k / 2 - 1; i >= 0; i--) {
            headAdjust(nums, i, k);
        }

    }

    public void headAdjust(int[] nums, int parent, int len) {
        int lChild = parent * 2 + 1;
        int rChild = parent * 2 + 2;
        int min = parent;
        if (lChild < len && nums[lChild] < nums[min]) {
            min = lChild;
        }
        if (rChild < len && nums[rChild] < nums[min]) {
            min = rChild;
        }
        if (min != parent) {
            swap(nums, min, parent);
            // 继续调整该节点下面的子树
            headAdjust(nums, min, len);
        }
    }

    public void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

}
