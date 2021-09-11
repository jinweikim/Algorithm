package Exercise;

public class SearchWord {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(checked(board, visited, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;

    }

    public boolean checked(char[][] board, boolean[][] visited, int i, int j, String str, int k) {
        if (board[i][j] != str.charAt(k)) {
            return false;
        }
        if (k == str.length() - 1) {
            return true;
        }

        int[][] directions = {{0 ,1}, {0, -1}, {1, 0}, {-1, 0}};
        visited[i][j] = true;
        for (int d = 0; d < directions.length; d++) {
            int newI = i + directions[d][0];
            int newJ = j + directions[d][1];
            if (newI >= 0 && newI < board.length && newJ >= 0 && newJ < board[0].length && !visited[newI][newJ]) {
                if (checked(board, visited, newI, newJ, str, k + 1)) {
                    return true;
                }
            }
        }
        visited[i][j] = false;
        return false;
    }
}
