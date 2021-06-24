import java.util.Scanner;

public class exam_06_17_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxWeight = sc.nextInt();
        String everyWeightStr = sc.next();
        String everyValueStr = sc.next();
        String[] weightStr = everyWeightStr.split(",");
        String[] valueStr = everyValueStr.split(",");
        int[] weight = new int[weightStr.length];
        int[] value = new int[valueStr.length];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = Integer.parseInt(weightStr[i]);
        }
        for (int i = 0; i < value.length; i++) {
            value[i] = Integer.parseInt(valueStr[i]);
        }
        int[][] dp = new int[weight.length + 1][maxWeight + 1];
        for (int i = 0; i < weight.length; i++) {
            for (int w = 0; w <= maxWeight; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                    continue;
                }
                if ((w - weight[i]) < 0) {
                    dp[i][w] = dp[i - 1][w];
                    continue;
                }
                dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weight[i]] + value[i]);
            }
        }
        System.out.println(dp[weight.length - 1][maxWeight]);

    }
}
