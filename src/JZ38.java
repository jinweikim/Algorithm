import java.util.HashSet;
import java.util.Set;

public class JZ38 {
    Set<String> res = new HashSet<>();
    public String[] permutation(String s) {
        char[] chars = s.toCharArray();
        boolean[] visited = new boolean[chars.length];
        dfs(chars, new String(), visited);
        return res.toArray(new String[res.size()]);
    }

    public void dfs(char[] chars,String str, boolean[] visited) {
        if (str.length() == chars.length) {
            res.add(str);
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            dfs(chars, str + chars[i], visited);
            visited[i] = false;
        }
    }
}
