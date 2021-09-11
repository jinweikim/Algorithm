package Company.pdd;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCaseNum = sc.nextInt();
        int[] ans = new int[testCaseNum];
        for (int i = 0; i < testCaseNum; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            ans[i] = (int)solution(N, M);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static double solution(int N, int M) {
        double start = Math.pow(10 , N - 1);
        double end = Math.pow(10 , N);
        int ans = 0;
        double i = 0;
        for (i = start; i < end; i++) {
            if (i % M == 0) {
                ans = (int) i;
//                System.out.println(ans);
                break;
            }
        }
        if (i == end) {
            return -1;
        }
        return ans;
    }
}
