import Exercise.Exam_07_18_03;
import org.junit.jupiter.api.Test;

class Exam_07_18_03Test {
    @Test
    void test() {
        Exam_07_18_03 exam = new Exam_07_18_03();
        int[] coins = {1, 2, 5};
        int ans = exam.minCoins(5, coins, 3);
        System.out.println(ans);
    }

}