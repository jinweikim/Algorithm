import Exercise.CoinChange;
import org.junit.jupiter.api.Test;

class CoinChangeTest {
    @Test
    void test() {
        CoinChange cc = new CoinChange();
        int[] coins = {2};
        int res = cc.coinChangeDp(coins, 3);
        System.out.println(res);
        System.out.println();
    }

}