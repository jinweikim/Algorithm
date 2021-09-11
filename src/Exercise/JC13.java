package Exercise;

public class JC13 {
    public int movingCount(int m, int n, int k) {
        boolean visited[][] = new boolean[m][n];
        return dfs(m, n, 0, 0, k, visited);
    }

    public int dfs(int m, int n, int i, int j, int k, boolean[][] visited) {
        if (i < 0 || i >= m || j <0 || j >= n || (getSum(i) + getSum(j)) > k || visited[i][j]) {
            return 0;
        }
        int res = 0;
        visited[i][j] = true;
        res += 1 + dfs(m, n, i + 1, j, k, visited) + dfs(m, n, i - 1, j, k, visited) + dfs(m, n, i, j + 1, k, visited) + dfs(m, n, i, j - 1, k, visited);
        return res;
    }

    public int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            int k = n % 10;
            sum += k;
            n = n / 10;
        }
        return sum;
    }
}
