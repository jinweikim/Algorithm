import Exercise.IntToRoam;
import org.junit.jupiter.api.Test;

class IntToRoamTest {
    @Test
    void test() {
        IntToRoam itr = new IntToRoam();
        String res = itr.intToRoman(9);
        System.out.println(res);
    }

}