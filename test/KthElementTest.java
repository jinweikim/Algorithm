import Exercise.KthElement;
import org.junit.jupiter.api.Test;

class KthElementTest {
    @Test
    void test() {
        KthElement kthElement = new KthElement();
        int[] array = {2, 1};
        int res = kthElement.findKthLargest(array, 2);
        System.out.println(res);

    }

}