package Exercise;

public class XOR3 {
    // leetcode 1310 子数组异或查询
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] resList = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int res = 0;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                res ^= arr[j];
            }
            resList[i] = res;
        }
        return resList;
    }
}
