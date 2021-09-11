package Exercise;

import java.util.*;

public class Kstring {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            int times = map.getOrDefault(words[i], 0);
            map.put(words[i], times + 1);
        }
        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(map.keySet());
        ArrayList<String> resList = new ArrayList<>();
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (map.get(s1) < map.get(s2)) {
                    return 1;
                } else if (map.get(s1) > map.get(s2)) {
                    return -1;
                } else {
                    return s1.compareTo(s2);
                }
            }
        });
        for (int i = 0; i < k; i++) {
            resList.add(strList.get(i));
        }
        return resList;
    }
}
