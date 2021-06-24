import java.util.Scanner;

public class exam_06_17_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNext()) {
            int id = sc.nextInt();
            if (judgeValid(id)) {
                sum++;
                System.out.println(sum);
            }
        }
        System.out.println(sum);
    }

    public static boolean judgeValid(int id) {
        if ((id % 7) == 0) {
            return true;
        }
        while (id != 0) {
            long x = id % 10;
            if (x == 7) {
                return true;
            }
            id = id / 10;
        }
        return false;
    }
}
