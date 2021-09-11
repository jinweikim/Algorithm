package Company.Ctrip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Que2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = slice(nums, k);
        System.out.println(ans);
    }

    public static int slice(int[] nums, int k) {
        List<List<Integer>> choices = choose(nums.length - 1, k);
        int minAns = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            minAns = Math.max(minAns, max - min);
        }
        for (int i = 0; i < choices.size(); i++) {
            List<Integer> choice = choices.get(i);
            int start = 0;
            int oneMax = 0;
            for (int j = 0; j < choice.size() + 1; j++) {
                if (j == choice.size()) {
                    int end = nums.length - 1;
                    int one = calBalance(nums, start, end);
//                    System.out.println("this slice balance is: " + one);
                    oneMax = Math.max(one, oneMax);
                    break;
                }
                int end = choice.get(j);
                int one = calBalance(nums, start, end);
//                System.out.println("this slice balance is: " + one);
                start = end + 1;
                oneMax = Math.max(one, oneMax);
            }
            minAns = Math.min(oneMax, minAns);
//            System.out.println("this choice maxBalance is " + oneMax);
//            System.out.println();
        }

        return minAns;
    }

    public static int calBalance(int[] nums, int start, int end) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans = 0;
//        System.out.println("start: " + start);
//        System.out.println("end: " + end);
        for (int i = start; i <= end; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
            if ((max - min) > ans) {
                ans = max - min;
            }
        }
        return ans;
    }

    public static List<List<Integer>> choose(int all, int k) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> choices = new ArrayList<>();
        int[] visited = new int[4];
        dfs(all, 0, k - 1, visited, path, choices);
        int count = 0;
        return choices;
    }

    public static void dfs(int all, int index, int k, int[] visited, List<Integer> path, List<List<Integer>> choice) {
        if (index == k) {
            choice.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < all; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                path.add(i);
                dfs(all, index + 1, k, visited, path, choice);
                path.remove(path.size() - 1);
                visited[i] = 0;
            }
        }

    }
}
