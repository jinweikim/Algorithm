import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntToRoamTest {
    @Test
    void test() {
        IntToRoam itr = new IntToRoam();
        String res = itr.intToRoman(9);
        System.out.println(res);
    }

}