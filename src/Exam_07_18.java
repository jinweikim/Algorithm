import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exam_07_18 {
    ArrayList<String> ans = new ArrayList<>();
    public ArrayList<String> letterCombinations (String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrace(map, digits, new StringBuilder(), 0);
        return ans;
    }

    public void backtrace (Map<Character, String> map, String digits, StringBuilder stringBuilder, int index) {
        if (index == digits.length()) {
            ans.add(stringBuilder.toString());
            return;
        }

        char[] chars = map.get(digits.charAt(index)).toCharArray();
        for (char ch : chars) {
                stringBuilder.append(ch);
                backtrace(map, digits, stringBuilder, index + 1);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
