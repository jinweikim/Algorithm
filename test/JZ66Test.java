import Exercise.JZ66;
import org.junit.jupiter.api.Test;

class JZ66Test {
    @Test
    void test() {
        JZ66 jz = new JZ66();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = jz.constructArr(a);
        for (int n : b) {
            System.out.println(n);
        }
    }

}