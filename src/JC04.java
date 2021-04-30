class JC04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }
        int curX = 0;
        int curY = matrix[0].length - 1;

        while (curX < matrix.length && curY >= 0) {
            if (matrix[curX][curY] == target) {
                return true;
            }
            if (matrix[curX][curY] < target) {
                curX++;
                continue;
            }
            if (matrix[curX][curY] > target) {
                curY--;
                continue;
            }
        }
        return false;
    }
}