package Exercise;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class JZ38 {
    Set<String> set = new HashSet<>();

    public String[] permutation(String s) {
        boolean[] visited = new boolean[s.length()];
        dfs(s, visited, new StringBuilder());
        return set.toArray(new String[0]);
    }


    public void dfs(String s, boolean[] visited, StringBuilder path) {
        if (path.length() == s.length()) {
            set.add(path.toString());
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (visited[i]) {
                continue;
            }
            path.append(s.charAt(i));
            visited[i] = true;
            dfs(s, visited, path);
            visited[i] = false;
            path.deleteCharAt(path.length() - 1);
        }
    }
}
