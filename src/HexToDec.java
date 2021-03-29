import java.util.Collections;
import java.util.Scanner;

public class HexToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int result = 0;
            int length = str.length();
            for(int i = length -1; i > 1; i--) {
                char charNum = str.charAt(i);
                int num;
                // 字符为 0-9
                if (charNum < 65) {
                    num = charNum - '0';
                // 字符为 A-E
                } else {
                    num = charNum - 55;
                }
                result += num * Math.pow(16, length - i - 1);
            }
            System.out.println(result);
        }
    }
}