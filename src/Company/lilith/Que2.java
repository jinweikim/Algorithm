package Company.lilith;

import java.util.Arrays;

public class Que2 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        System.out.println(ans(nums, 5));


    }

    public static long ans (int[] array, int k) {
        Arrays.sort(array);
        int ans = 0;
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] + array[right] <= k) {
                ans += right - left;
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
