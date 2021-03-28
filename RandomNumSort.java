import java.util.Scanner;

public class RandomNumSort {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int count = sc.nextInt();
            boolean[] table = new boolean[1024]; // all false
            for (int i = 0; i < count; i++) {
                int num = sc.nextInt();
                table[num] = true;
            }
            for (int i = 0; i < table.length; i++) {
                if (table[i]) {
                    System.out.println(i);
                }
            }
        }
    }
}
