package Company.Ctrip;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int num = sc.nextInt();
        String str = sc.next();
        int[] ruleNum = new int[num];
        int[] ruleScore = new int[num];
        for (int i = 0; i < num; i++) {
            ruleNum[i] = sc.nextInt();
            ruleScore[i] = sc.nextInt();
        }
        int ans = play(str, ruleNum, ruleScore);
        System.out.println(ans);
    }

    public static int play(String str, int[] ruleNum, int[] ruleScore) {
        String[] strs = str.split("0");
        int ans = 0;
        for (String s : strs) {
            ans += cal(s, ruleNum, ruleScore);
        }
        return ans;
    }

    public static int cal(String str, int[] ruleNum, int[] ruleScore) {
        int len = str.length();
        int score = 0;
        // socre, pos
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ruleScore.length; i++) {
            map.put(ruleScore[i], i);
        }

        Arrays.sort(ruleScore);
//        for (int i = ruleScore.length - 1; i >=0; i--) {
//            System.out.println(ruleScore[i]);
//        }
        int leftLen = len;
        for (int i = 0; i < ruleScore.length; i++) {
            int needLen = ruleNum[map.get(ruleScore[i])];
            while (leftLen >= needLen) {
                score += ruleScore[i];
                leftLen -= needLen;
            }
            leftLen += needLen;
        }
        return score;

    }
}
