public class JZ46 {
    public int translateNum(int num) {
        String strNum = String.valueOf(num);
        int[] dp = new int[strNum.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            String combination = strNum.substring(i - 2, i);
            if ((combination.compareTo("10") >= 0) && (combination.compareTo("25") <= 0)){
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[dp.length - 1];
    }
    public int translateNum2(int num) {
        String strNum = String.valueOf(num);
        int first = 1;
        int second = 1;
        for (int i = 2; i < strNum.length() + 1; i++) {
            String combination = strNum.substring(i - 2, i);
            int tmp = second;
            if ((combination.compareTo("10") >= 0) && (combination.compareTo("25") <= 0)){
                second = first + second;
            } else {
                second = second;
            }
            first = tmp;
        }
        return second;
    }
}
