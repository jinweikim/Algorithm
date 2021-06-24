public class AppearInNums {
    public int singleNumber(int[] nums) {
        int[] count = new int[32];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 32; j++) {
                count[j] += nums[i] & 1;
                nums[i] >>>= 1;
            }
        }
        for (int i = 0; i < count.length; i++) {
            count[i] = count[i] % 3;
        }

        int res = 0;
        for (int i = 0; i < count.length; i++) {
            res <<= 1;
            res |= count[31 - i] % 3;
        }
        return res;
    }
}
