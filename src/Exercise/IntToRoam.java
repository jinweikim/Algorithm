package Exercise;

import java.util.HashMap;
import java.util.Map;

public class IntToRoam {
    public String intToRoman(int num) {
        Map<String, Integer> map = new HashMap<>();
        String[] roam = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        Integer[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        Integer[] intPartList = new Integer[value.length];
        for (int i = 0; i < roam.length; i++) {
            map.put(roam[i], value[i]);
        }
        for (int i = 0; i < value.length; i++) {
            intPartList[i] = num / value[i];
            num = num % value[i];
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < intPartList.length; i++) {
            if (intPartList[i] > 0) {
                for (int j = 0; j < intPartList[i]; j++) {
                    res.append(roam[i]);
                }
            }
        }
        return res.toString();

    }
}
