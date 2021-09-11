package Company.ali;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Que1 {

    public static void main(String[] args) {
        int[] peopleNum = new int[5];
        Scanner sc = new Scanner(System.in);
        int recordNum = sc.nextInt();
        int MAX = sc.nextInt();
        System.out.println(recordNum);
        System.out.println(MAX);
        Map<Integer, Integer> map = new HashMap<>();
        int[][] records = new int[recordNum][3];
        for (int i = 0; i < recordNum; i++){
            String record = sc.nextLine();
            System.out.println(record);
            records[i] = parse(record);
        }

        for (int i = 0; i < recordNum; i++) {
            count(records[i], map, peopleNum, MAX);
            for (Integer num : peopleNum) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void count(int[] record, Map<Integer, Integer> map, int[] peopleNum, int MAX) {
        int a = record[0];
        int b = record[1];
        int c = record[2];
        if (b == 1) {
            if (map.getOrDefault(a, 0) == 0) {
                if (peopleNum[c - 1] < MAX) {
                    map.put(a, c);
                    peopleNum[c -1]++;
                }
            }
        } else if (b == 0) {
            int currentC = map.get(a);
            peopleNum[currentC - 1]--;
        }
    }

    public static int[] parse(String record) {
        String[] records = record.split(" ");
        System.out.println(records);
        int[] ans = new int[records.length];
        for (int i = 0; i < records.length; i++) {
            ans[i] = Integer.parseInt(records[i]);
        }
        return ans;

    }
}
