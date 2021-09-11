import Exercise.Wall;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class WallTest {
    @Test
    void test() {
        // Integer[][] nums = { {1,2,2,1}, {3,1,2}, {1,3,2}, {2,4}, {3,1,2}, {1,3,1,1}};
        Integer[][] nums = {{1,1},{2},{1,1}};
        List<List<Integer>> walls = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < nums[i].length; j++) {
                list.add(nums[i][j]);
            }
            walls.add(list);
        }
        Wall wall = new Wall();
        int res = wall.leastBricks(walls);
        System.out.println(res);

    }

}