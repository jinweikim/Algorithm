import Exercise.nQueen;
import org.junit.jupiter.api.Test;
import java.util.List;

class nQueenTest {

    @Test
    void nQueenTest() {
        nQueen nq = new nQueen();
        nq.solveNQueens(4);
        for (List<String> list : nq.outputRes) {
            for (String str : list) {
                System.out.println(str);
            }
        }
    }

}