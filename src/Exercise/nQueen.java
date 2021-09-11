package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class nQueen {
    public List<ArrayList<char[]>> res = new ArrayList<>();
    public List<List<String>> outputRes = new ArrayList<>();

    public  List<List<String>> solveNQueens(int n) {
        // 初始化棋盘
        ArrayList<char[]> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            for (int j = 0; j < row.length; j++) {
                row[j] = '.';
            }
            board.add(row);
        }

        // 递归计算
        nQueen(board, 0);

        // 转化为 String
        for (int i = 0; i < res.size(); i++) {
            ArrayList<String> strList = new ArrayList<>();
            for (int j = 0; j < res.get(i).size(); j++) {
                strList.add(String.valueOf(res.get(i).get(j)));
            }
            outputRes.add(strList);
        }
        return outputRes;
    }

    public void nQueen(ArrayList<char[]> board, int row) {
        // 结束条件
        if (board.size() == row) {
            // 创建一个新的对象，避免后续更改影响之前保存的内容
            ArrayList<char[]> newBoard = new ArrayList<>();
            for (int i = 0; i < board.size(); i++) {
                char[] newChar = Arrays.copyOf(board.get(i), board.get(i).length);
                newBoard.add(newChar);
            }
            res.add(newBoard);
            return;
        }

        int n = board.get(row).length;
        for (int col = 0; col < n; col++) {
            // 排除不可以放置的位置
            if (!isValid(board, row, col)) {
                continue;
            }

            board.get(row)[col] = 'Q';
            // 决策下一层
            nQueen(board, row + 1);
            board.get(row)[col] = '.';
        }
    }

    public boolean isValid(ArrayList<char[]> board, int row, int col) {
        int n = board.size();
        // 同一列有其他皇后
        for (int i = 0; i < n; i++) {
            if (board.get(i)[col] == 'Q') {
                return false;
            }
        }
        // 左上方有皇后
        for (int i = row - 1, j = col - 1; i >= 0 && j>=0; i--, j--) {
            if (board.get(i)[j] == 'Q') {
                return false;
            }
        }
        // 右上方有皇后
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board.get(i)[j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
