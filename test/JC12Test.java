import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JC12Test {
    @Test
    void testJC() {
        JC12 jc = new JC12();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        boolean res = jc.exist(board, "ABCCED");
        System.out.println(res);
    }

}