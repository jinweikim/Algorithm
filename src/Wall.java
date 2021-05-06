import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wall {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (List<Integer> list : wall) {
            int sum = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                sum += list.get(i);
                Integer times = 0;
                if (map.containsKey(sum)) {
                    times = map.get(sum);
                }
                map.put(sum, times + 1);
            }
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if ( value > max) {
                max = value;
            }
        }
        return wall.size() - max;

    }
}
