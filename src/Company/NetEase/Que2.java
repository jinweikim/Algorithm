package Company.NetEase;

import java.util.*;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groupNum = sc.nextInt();
        for (int i = 0; i < groupNum; i++) {
            int taskNum = sc.nextInt();
            int[] time = new int[taskNum];
            List<List<Integer>> pre = new ArrayList<>();
            for (int j = 0; j < taskNum; j++) {
                pre.add(new ArrayList<>());
            }
            for (int j = 0; j < taskNum; j++) {
                time[j] = sc.nextInt();
                int preNum = sc.nextInt();
                List<Integer> thisPre = new ArrayList<>();
                for (int k = 0; k < preNum; k++) {
                    int preIndex = sc.nextInt();
                    pre.get(preIndex - 1).add(j);
//                    thisPre.add(preIndex - 1);
                }
//                pre.add(thisPre);
            }
            int ans = getMinTime(time, pre);
            System.out.println(ans);
        }
    }

    public static int getMinTime(int[] val, List<List<Integer>> pre) {
        int taskNum = val.length;
        int[] indegree = new int[taskNum];
        int[] time = new int[taskNum];
//        for (int i = 0; i < pre.size(); i++) {
//            indegree[i] = pre.get(i).size();
//        }

        for (int i = 0; i < pre.size(); i++) {
            List<Integer> list = pre.get(i);
            for (int j = 0; j < list.size(); j++) {
                indegree[list.get(j)]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        // 入度为 0 的点入队
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        int ans = 0;
        while (!queue.isEmpty()) {
            int queueLen = queue.size();
            int thisTime = 0;
            for (int i = 0; i < queueLen; i++) {
                int current = queue.poll();
                time[current] += val[current];
                ans = Math.max(ans, time[current]);
//                thisTime = Math.max(thisTime, time[current]);
                List<Integer> list = pre.get(current);
                for (int j = 0; j < list.size(); j++) {
                    indegree[list.get(j)]--;
                    time[list.get(j)] = time[list.get(j)] > time[current] ? time[list.get(j)] : time[current];
                    if (indegree[list.get(j)] == 0) {
                        queue.offer(list.get(j));
                    }
                }
            }
        }
        return ans;
    }
}
