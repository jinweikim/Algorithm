package Company.ali;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleNum = sc.nextInt();
        int orderNum = sc.nextInt();
        int[] road = new int[peopleNum + 1];
        Map<Integer, Integer> map = new HashMap<>();
        int[] roadNums = new int[peopleNum + 1];
        for (int i = 1; i <= peopleNum; i++) {
            map.put(i, i);
        }
        int max = 0;
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            max = change(a ,b, map, roadNums, max);
        }
    }

    public static int change(int a, int b, Map<Integer, Integer> map, int[] roadsNum, int max) {
        int toRoad = Math.max(map.get(a), map.get(b));
        if (map.get(a) == map.get(b)) {
            System.out.println(max - roadsNum[toRoad]);
        }
        map.put(a, toRoad);
        map.put(b, toRoad);
        roadsNum[toRoad]++;
        if (roadsNum[toRoad] > max) {
            max = roadsNum[toRoad];
        }
        return max;
    }

}
