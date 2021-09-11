package Company.bd;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (long i = 0; i < n; i++) {
            long num = sc.nextLong();
            System.out.println(fun(num));
        }
    }

    public static long fun(long num) {
        StringBuilder stringBuilder = new StringBuilder();
        String str = String.valueOf(num);
        int len = str.length();
        char[] chars = str.toCharArray();
        int flag = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            char ch = chars[i];
            char newCh;
            if (ch > '3') {
                newCh = '3';
            } else if (ch == '1') {
                if (i == 0) {
                    newCh = ' ';
                } else {
                    newCh = '3';
                    flag = 1;
                }
            } else {
                if (ch == '1' && (flag == 1)) {
                    newCh = ' ';
                } else if (ch == '0') {
                    newCh = '3';
                } else {
                    newCh = ch;
                }
            }
            stringBuilder.append(newCh);
        }
        stringBuilder.reverse();
        String ans = stringBuilder.toString().trim();
        return Long.valueOf(ans);
    }

    public static boolean check(long num) {
        String str = String.valueOf(num);
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (ch != '1' && ch != '2' && ch != '3') {
                return false;
            }
        }
        return true;
    }
}
