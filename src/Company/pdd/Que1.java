package Company.pdd;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCaseNum = sc.nextInt();
        for (int i = 0; i < testCaseNum; i++) {
            int goodsNum = sc.nextInt();
            int[] S = new int[goodsNum];
            int[] T = new int[goodsNum];
            for (int j = 0; j < goodsNum; j++) {
                S[j] = sc.nextInt();
                T[j] = sc.nextInt();
            }
            int longestDay = 0;
            for (int j = 0; j < T.length; j++) {
                longestDay = Math.max(longestDay, T[j]);
            }
            int ans = plan(S, T, longestDay);
            System.out.println(ans);
        }
    }

    public static int plan(int[] S, int[] T, int longestDay) {
        int[] ifBuyed = new int[S.length];
        int ans = 0;
        for (int i = longestDay; i > 0; i--) {
            int mostExpensive = 0;
            int mostExpensiveIndex = 0;
            for (int j = 0; j < S.length; j++) {
                if (T[j] >= i && ifBuyed[j] == 0) {
                    if (S[j] > mostExpensive) {
                        mostExpensive = S[j];
                        mostExpensiveIndex = j;
                    }
                }
            }
//            System.out.println("第 " + i + " 天" + "选第 " + mostExpensiveIndex);
            ans += S[mostExpensiveIndex];
            ifBuyed[mostExpensiveIndex] = 1;
        }
        return ans;
    }

//    public static int closetDay(int[] T, int[] S, int currentDay, int[] ifBuyed) {
//        int mostExpensive = 0;
//        int mostExpensiveIndex = 0;
//        int min = Integer.MAX_VALUE;
//        int maxS = S[closetIndex];
//        int finalIndex = closetIndex;
//        // 先挑最贵的
//        for (int i = 0; i < T.length; i++) {
//            if (T[i] >= currentDay && ifBuyed[i] == 0) {
//                if (S[i] > mostExpensive) {
//                    mostExpensive = S[i];
//                    mostExpensiveIndex = i;
//                }
//            }
//        }
//        System.out.println("this is final Day: " + finalIndex);
//        return finalIndex;
//        for (int i = 0; i < T.length; i++) {
//            if (T[i] <= currentDay && ifBuyed[i] == 0) {
//                int offset = T[i] - currentDay;
//                if (offset < min) {
//                    System.out.println("this is closet Day: " + i);
//                    min = offset;
//                    closetIndex = i;
//                }
//            }
//        }
//    }
}
