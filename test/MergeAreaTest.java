import org.junit.jupiter.api.Test;

class MergeAreaTest {
    @Test
    void test() {
        MergeArea mat = new MergeArea();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] ans = mat.merge(intervals);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(ans[i][j]);
            }
        }
    }

}