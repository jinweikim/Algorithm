package Company.pdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCaseNum = sc.nextInt();
        for (int i = 0; i < testCaseNum; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            List<Integer> ans = new ArrayList<>();
            int max = Math.abs((end - start) / 2) + 1;
            backtrace(ans, start, 0, end, max);
            int min = max;
            for (int j = 0; j < ans.size(); j++) {
//                System.out.println(ans.get(j));
                min = Math.min(min, ans.get(j));
            }
            System.out.println(min);
        }
    }

    public static void solution() {

    }

    public static void backtrace(List<Integer> ans, int current, int days, int target, int max) {
        if (days > max) {
            return;
        }
        if (current == target) {
            ans.add(days);
            return;
        }

        int[] choices = new int[4];
        choices[0] = -2;
        choices[1] = -1;
        choices[2] = 1;
        choices[3] = current;

        for (int i = 0; i < 4; i++) {
            backtrace(ans, current + choices[i], days + 1, target, max);
        }
    }
}
