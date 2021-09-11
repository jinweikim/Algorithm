package Company.Huawei;

import java.util.*;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String[] str0 = new String[k];
        String[] str1 = new String[k];
        String[] str2 = new String[k];
        for (int i = 0; i < k; i++) {
            str0[i] = sc.next();
            str1[i] = sc.next();
            str2[i] = sc.next();
        }
        String obj = sc.next();
        String[] ans = find(str0, str1, str2, obj);
        for (String str : ans) {
            System.out.print(str + " ");
        }
    }

    public static String[] find(String[] str0, String[] str1, String[] str2, String obj) {
        Map<String, String> map = new HashMap<>();
        Map<String, List<String>> parent = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < str0.length; i++) {
            if (str1[i].equals("instanceOf")) {
                map.put(str0[i], str2[i]);
            } else if (str1[i].equals("subClassOf")) {
                if (parent.containsKey(str0[i])) {
                    List<String> pa = parent.get(str0[i]);
                    pa.add(str2[i]);
                    pa.add(str0[i]);
                    parent.put(str0[i], pa);
                } else {
                    List<String> pa = new ArrayList<>();
                    pa.add(str2[i]);
                    pa.add(str0[i]);
                    parent.put(str0[i], pa);
                }
            }

        }
        List<String> ans = new ArrayList<>();

        for (Map.Entry<String, String> entry: map.entrySet()) {
            String thisPa = entry.getValue();
            for (Map.Entry<String, List<String>> pa: parent.entrySet()) {
                if (pa.getKey().equals(thisPa)) {
                    List<String> pas = pa.getValue();
                    for (String str : pas) {
                        for (Map.Entry<String, String> en1 : map.entrySet()) {
                            if (en1.getValue().equals(str)) {
                                if (!set.contains(en1.getKey())) {
                                    ans.add(en1.getKey());
                                    set.add(en1.getKey());
                                }
                            }

                        }
                    }
                }
            }
            for (Map.Entry<String, String> en1 : map.entrySet()) {
                if (en1.getValue().equals(thisPa)) {
                    if (!set.contains(en1.getKey())) {
                        ans.add(en1.getKey());
                        set.add(en1.getKey());
                    }
                }
            }
        }
        Collections.sort(ans);
        String[] ansArray = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ansArray[i] = ans.get(i);
        }

        return ansArray;
    }
}
