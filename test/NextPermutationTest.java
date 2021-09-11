import Exercise.NextPermutation;
import org.junit.jupiter.api.Test;

class NextPermutationTest {
    @Test
    void test() {
        NextPermutation np = new NextPermutation();
        int[] nums = {3, 2, 1};
        np.nextPermutation(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }

}