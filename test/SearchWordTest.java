import Exercise.SearchWord;
import org.junit.jupiter.api.Test;

class SearchWordTest {
    @Test
    void test() {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        SearchWord sw = new SearchWord();
        boolean ans = sw.exist(board, "SEE");
        System.out.println(ans);
    }

}