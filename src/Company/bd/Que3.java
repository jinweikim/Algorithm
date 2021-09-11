package Company.bd;

import java.util.*;

public class Que3 {
    public static long count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        count(str, k);
        count = count % (1000000007);
        System.out.println(count);
    }

    public static long count(String str, int k) {
        dfs(str, 0, new StringBuilder(), k);
        return 0;
    }

    public static void dfs(String str, int index, StringBuilder stringBuilder, int k) {
        if (index == str.length()) {
            String candidate = stringBuilder.toString();
            if (check(candidate, k)) {
                count++;
            }
//            System.out.println(stringBuilder.toString());
            return;
        }

        // 选
        dfs(str, index + 1, stringBuilder.append(str.charAt(index)), k);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        dfs(str, index + 1, stringBuilder, k);

    }

    public static boolean check(String str, int k) {
        Set<Character> set = new HashSet<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            set.add(ch);
        }
        if (set.size() == k) {
            return true;
        } else {
            return false;
        }
    }
}
