package Exercise;

import java.util.ArrayList;
import java.util.List;

public class EightQueen {
    public static List<List<String>> ans = new ArrayList<>();
    public static void main(String[] args) {
        solveNQueens(4);
        for (int i = 0; i < ans.size(); i++) {
            List<String> one = ans.get(i);
            for (int j = 0; j < one.size(); j++) {
                System.out.println(one.get(j));
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        int[][] board = new int[n][n];
        dfs(0, board);
        return ans;
    }

    public static void dfs(int index, int[][] board) {
        if (index == board.length) {
            List<String> oneAns = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == 1) {
                        stringBuilder.append("Q");
                    } else {
                        stringBuilder.append(".");
                    }
                }
                oneAns.add(stringBuilder.toString());
            }
            ans.add(oneAns);
        }

        for (int i = 0; i < board.length; i++) {
            if (isValid(board, index, i)) {
                board[index][i] = 1;
                dfs(index + 1, board);
                board[index][i] = 0;
            }
        }

    }

    public static boolean isValid(int[][] board, int row, int column) {

        // 同一列是否有冲突
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 1) {
                return false;
            }
        }

        // 右上角是否右冲突
        for (int i = row, j = column; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // 左上角是否有冲突
        for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;

    }


}
