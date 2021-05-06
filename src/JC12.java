public class JC12 {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean res = dfs(board, i, j, word, 0);
                if (res) {
                    return res;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int i, int j, String words, int wordPos) {
        if (i < 0 || j <0 || i >= board.length || j >= board[0].length || board[i][j] == ' ' || words.charAt(wordPos) != board[i][j]) {
            return false;
        }
        if (wordPos == words.length() - 1) {
            return true;
        }
        // 访问过的位置设为空
        board[i][j] = ' ';
        boolean res = dfs(board, i + 1, j, words, wordPos + 1) || dfs(board, i - 1, j, words, wordPos + 1) || dfs(board, i, j + 1, words, wordPos + 1) || dfs(board, i, j - 1, words, wordPos + 1);
        board[i][j] = words.charAt(wordPos);
        return res;
    }
}
