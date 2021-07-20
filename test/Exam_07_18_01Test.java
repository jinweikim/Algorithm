import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exam_07_18_01Test {
    @Test
    void test () {
        Exam_07_18_01 exam = new Exam_07_18_01();
        int[] A = {3, 5, 4};
        int ans = exam.countArea(A, 3);
        System.out.println(ans);
    }



}