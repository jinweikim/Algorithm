package Company.NetEase;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Que {
    public static void main(String[] args) {
        check("abc");
    }

    public static void check(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < 26; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char ch : chars) {
                int distance = ch - 'a';
                char newCh = (char)((distance + 1 + i) % 26 + 'a') ;
                stringBuilder.append(newCh);
            }
            System.out.println(stringBuilder.toString());

        }
    }

}
