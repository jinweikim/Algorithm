package Exercise;

public class JZ67 {
    public int strToInt(String str) {
        if (str.equals("")) {
            return 0;
        }
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int firstNotBlank = 0;
        // 找到第一个非空数字字符
        while ((firstNotBlank < str.length() - 1) && chars[firstNotBlank] == ' ') {
            firstNotBlank++;
        }
        if (firstNotBlank >= str.length()) {
            return 0;
        }
        boolean negative = false;
        if (chars[firstNotBlank] == '-') {
            negative = true;
        }
        if (chars[firstNotBlank] == '-' || chars[firstNotBlank] == '+') {
            firstNotBlank++;
        }
        if (firstNotBlank >= str.length()) {
            return 0;
        }
        if (!((chars[firstNotBlank] - '0') < 10 && ((chars[firstNotBlank] - '0') >= 0))) {
            return 0;
        }
        for (int i = firstNotBlank; i < chars.length; i++) {
            if (!((chars[i] - '0') < 10 && ((chars[i] - '0') >= 0))) {
                break;
            }
            stringBuilder.append(chars[i]);
        }
        System.out.println(stringBuilder.toString());
        char[] numChars = stringBuilder.toString().toCharArray();
        double res = 0;
        double tmp = 1;
        for (int i = numChars.length - 1; i >= 0; i--) {
            if (numChars[i] == '-') {
                break;
            }
            if (numChars[i] == '+') {
                break;
            }
            int num = numChars[i] - '0';
            res += num * tmp;
            tmp *= 10;
        }
        if (negative) {
            res = -res;
        }
        if (res >  Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)res;
    }
}
