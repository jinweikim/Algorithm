package Exercise;

import java.util.ArrayList;
import java.util.List;

public class ClassTable {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> edges = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            List<Integer> edge = new ArrayList<>();
            edges.add(edge);
        }

        for (int i = 0; i < prerequisites.length; i++) {
            edges.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        System.out.println(edges.size());

        int[] flag = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(edges, flag, i)) {
                return false;
            }
        }

        // 无环则可以完成所有课程
        return true;

    }

    public boolean dfs(List<List<Integer>> edges, int[] flag, int current) {
        List<Integer> thisEdge = edges.get(current);
        if (flag[current] == -1) {
            // 当前节点第二次被访问，说明存在环
            return false;
        }
        if (flag[current] == 1) {
            // 当前节点是之前访问完毕的点，不用再访问
            return true;
        }
        flag[current] = -1; // 当前节点状态为访问中
        for (int i = 0; i < thisEdge.size(); i++) {
            if (!dfs(edges, flag, thisEdge.get(i))) {
                return false;
            }
        }
        // 当前节点所有相邻节点访问完毕
        flag[current] = 1;
        return true;
    }
}
