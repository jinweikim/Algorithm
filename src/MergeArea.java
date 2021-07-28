import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeArea {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });


        int[][] ans = new int[intervals.length][intervals[0].length];
        ans[0] = intervals[0];
        int cur = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > ans[cur][1]) {
                cur = cur + 1;
                ans[cur] = intervals[i];
            } else {
                ans[cur][1] = Math.max(ans[cur][1], intervals[i][1]);
            }
        }
        int[][] finaAns = new int[cur + 1][2];
        for (int i = 0; i <= cur; i++) {
            for (int j = 0; j < 2; j++) {
                finaAns[i][j] = ans[i][j];
            }
        }
        return finaAns;
    }
}
