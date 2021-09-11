import Exercise.AppearTwoInNums;
import org.junit.jupiter.api.Test;

class AppearTwoInNumsTest {
    @Test
    void test() {
        AppearTwoInNums ati = new AppearTwoInNums();
        int[] nums = {1,2,10,4,1,4,3,3};
        int[] res = ati.singleNumbers(nums);
        for (int i : res) {
            System.out.println(i);
        }
    }

}