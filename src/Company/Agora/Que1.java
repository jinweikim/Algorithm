package Company.Agora;

public class Que1 {

    public static void main(String[] args) {
        int[] coupons = {1 ,2, 3, 1};
        int ans = get_best_coupon(coupons);
        System.out.println(ans);

    }

    public static int get_best_coupon (int[] coupons) {
        int[] dp = new int[coupons.length + 1];
        dp[0] = 0;
        dp[1] = coupons[0];

        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] + coupons[i - 1], dp[i - 1]);
        }

        return dp[dp.length - 1];

    }
}
