package Company.XiaoMi;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        int[] nums = new int[strs.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        sort(nums);
    }

    public static void sort(int[] nums) {
        int first = 0; // 下一个 1 的插入位置，其实指向的就是 2（除了 first == second 的时候）
        int second = 0; // 遍历指针
        int third = nums.length - 1; // 下一个 3 的插入位置

        while (second <= third) {
            if (nums[second] == 2) {
                second++;  // 当前值为 2 则不处理，继续遍历
            } else if (nums[second] == 1) {
                swap(nums, first, second);
                first++;
                second++; // 此处可以直接将 second 指针往后移动，因为被交换过来的元素可以保证是 2 (除了 first == second 的时候)，不需要放到下个循环去判断;
            } else if (nums[second] == 3) {
                swap(nums, second, third);
                third--;  // 只移动 third，不移动 second，因为被交换到 second 位置的元素不知道是什么，留到下一个循环去判断；
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
