import java.util.HashMap;
import java.util.Map;

public class RoamToInt {

    public int romanToInt(String s) {
        Character[] roam = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        Integer[] nums = {1000, 500, 100, 50, 10, 5, 1};
        Map<Character, Integer> roamMap = new HashMap<>();
        for (int i = 0; i < roam.length; i++) {
            roamMap.put(roam[i], nums[i]);
        }
        int length = s.length();
        int resInt = 0;
        for (int i = 0; i < length; i++) {
            int value = roamMap.get(s.charAt(i));
            if ((i + 1) < length && value < roamMap.get(s.charAt(i + 1))) {
                resInt -= value;
            } else {
                resInt += value;
            }
        }
        return resInt;
    }

    public int romanToInt2(String s) {
        String[] roam = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int length = s.length();
        int resInt = 0;
        for (int i = 0; i < length; i++) {
            boolean twoFlag = false;
            String subStr;
            if ((i + 2) <= length) {
                subStr = s.substring(i, i + 2);
                twoFlag = true;
            } else {
                subStr = s.substring(i, i + 1);
            }
            if (twoFlag) {
                twoFlag = false;
                for (int j = 1; j < roam.length; j = j + 2) {
                    if (roam[j].equals(subStr)) {
                        resInt += value[j];
                        twoFlag = true;
                        i = i + 1;
                        break;
                    }
                }
            }
            if (!twoFlag) {
                subStr = s.substring(i, i+1);
                for (int j = 0; j < roam.length; j = j + 2) {
                    if (roam[j].equals(subStr)) {
                        resInt += value[j];
                        break;
                    }
                }
            }
        }
        return resInt;
    }
}
