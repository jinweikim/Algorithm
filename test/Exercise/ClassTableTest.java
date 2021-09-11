package Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassTableTest {
    @Test
    void test() {
        ClassTable table = new ClassTable();
        int[][] pre = {{0 ,1}};
        boolean ans = table.canFinish(2 , pre);
        System.out.println(ans);
    }

}