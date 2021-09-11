package Exercise;

import java.util.Deque;
import java.util.LinkedList;

public class ValidBracket {
    public boolean isValid(String s) {
        Deque<Character> stack  = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ')') {
                if (stack.isEmpty() || !stack.pop().equals('(')) {
                    return false;
                }
            } else if (chars[i] == ']') {
                if (stack.isEmpty() || !stack.pop().equals('[')) {
                    return false;
                }
            } else if (chars[i] == '}') {
                if (stack.isEmpty() || !stack.pop().equals('{')) {
                    return false;
                }
            } else {
                stack.push(chars[i]);
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
