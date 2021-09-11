package Exercise;

public class LC468 {
    public static void main(String[] args) {
        String ans = validIPAddress(":::::::");
        System.out.println(ans);

    }

    public static String validIPAddress(String IP) {
        int count1 = 0;
        int count2 = 0;
        char[] chars = IP.toCharArray();
        for (char ch : chars) {
            if (ch == '.') {
                count1++;
            }
            if (ch == ':') {
                count2++;
            }
        }
        if (count1 == 3) {
            if (checkIPv4(IP)) {
                return "IPv4";
            }
        }
        if (count2 == 7) {
            if (checkIPv6(IP)) {
                return "IPv6";
            }
        }
        return "Neither";

    }

    public static boolean checkIPv4(String IP) {
        String[] strs = IP.split("\\.", -1);

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() == 0 || strs[i].length() > 3) {
                return false;
            }
            for (char ch : strs[i].toCharArray()) {
                if (!Character.isDigit(ch)) {
                    return false;
                }
            }
            int val = Integer.parseInt(strs[i]);
            if (val < 0 || val > 255) {
                return false;
            }
            if (!noExtraZero(strs[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIPv6(String IP) {
        String[] strs = IP.split(":", -1);
        String hexi = "0123456789abcdefABCDEF";
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() == 0 || strs[i].length() > 4) {
                return false;
            }
            for (char ch : strs[i].toCharArray()) {
                if (hexi.indexOf(ch) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean noExtraZero(String s) {
        if (s.length() == 1 && s.equals("0")) {
            return true;
        }
        char[] chars = s.toCharArray();
        int len = chars.length;
        int index = 0;
        while (index < len && chars[index] == '0') {
            index++;
        }
        if (index > 0) {
            return false;
        } else {
            return true;
        }

    }

}
