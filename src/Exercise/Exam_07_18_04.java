package Exercise;

public class Exam_07_18_04 {
    public boolean isValid (String s) {
        int bracket0 = 0;
        int bracket1 = 0;
        int bracket2 = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                bracket0++;
            }
            if (chars[i] == '[') {
                bracket1++;
            }
            if (chars[i] == '{') {
                bracket2++;
            }
            if (chars[i] == ')') {
                bracket0--;
            }
            if (chars[i] == ']') {
                bracket1--;
            }
            if (chars[i] == '}') {
                bracket2--;
            }
        }
        if (bracket0 == 0 && bracket1 == 0 && bracket2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
