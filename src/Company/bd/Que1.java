package Company.bd;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] raw = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                raw[i][j] = sc.nextInt();
            }
        }
        bigger(raw, K);
    }

    public static void bigger(int[][] raw, int k) {
        int n = raw.length;
        int newN = n * k;
        int[][] newPic = new int[newN][newN];
        for (int i = 0; i < newN; i++) {
            for (int j = 0; j < newN; j++) {
                int rawI = i / k;
                int rawJ = j / k;
                newPic[i][j] = raw[rawI][rawJ];
            }
        }
        for (int i = 0; i < newN; i++) {
            for (int j = 0; j < newN; j++) {
                System.out.print(newPic[i][j] + " ");
            }
            System.out.println();
        }
    }
}
