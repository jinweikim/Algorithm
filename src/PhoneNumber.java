import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PhoneNumber {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        List<String> combinations = new LinkedList<>();
        if (digits == null) {
            return combinations;
        }
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrace(combinations, map, digits, 0, new StringBuilder());
        return combinations;
    }

    public void backtrace(List<String> combinations, Map<Character, String> map, String digits, int index, StringBuilder combination) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
            return;
        }
        Character ch = digits.charAt(index);
        String letters = map.get(ch);
        int length = letters.length();
        for (int i = 0; i < length; i++) {
            combination.append(letters.charAt(i));
            backtrace(combinations, map, digits, index + 1, combination);
            combination.deleteCharAt(index);
        }
    }
}
