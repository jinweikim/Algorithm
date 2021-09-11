import Exercise.Exam_07_18_04;
import org.junit.jupiter.api.Test;

class Exam_07_18_04Test {
    @Test
    void test () {
        Exam_07_18_04 exam = new Exam_07_18_04();
        boolean ans = exam.isValid("[");
        System.out.println(ans);
    }

}