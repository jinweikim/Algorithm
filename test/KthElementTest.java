import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthElementTest {
    @Test
    void test() {
        KthElement kthElement = new KthElement();
        int[] array = {2, 1};
        int res = kthElement.findKthLargest(array, 2);
        System.out.println(res);

    }

}