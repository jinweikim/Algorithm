import Exercise.Exam_07_18_02;
import org.junit.jupiter.api.Test;

class Exam_07_18_02Test {
    @Test
    void test() {
        Exam_07_18_02 exam = new Exam_07_18_02();
        int[] array = {1,-2,3,10,-4,7,2,-5};
        int ans = exam.FindGreatestSumOfSubArray(array);
        System.out.println(ans);
    }

}