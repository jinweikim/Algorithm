public class AppearTwoInNums {
    public int[] singleNumbers(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res ^= n;
        }
        int indexIsOne = 1;
        while ((res & indexIsOne) == 0) {
            indexIsOne <<= 1;
        }
        int a = 0;
        int b = 0;
        for (int n : nums) {
            if ((n & indexIsOne) == 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }
        return new int[]{a, b};
    }
}
