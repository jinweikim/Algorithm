package Company.Huawei;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("k: " + k);
        int[] send = new int[k];
        int[] cache = new int[k];
        for (int i = 0; i < k; i++) {
            String str= sc.next();
            String[] strs = str.split(",");
            send[i] = Integer.valueOf(strs[0]);
            cache[i] = Integer.valueOf(strs[1]);
            System.out.print(send[i]);
            System.out.println(cache[i]);
        }
        int packNum = sc.nextInt();
        System.out.println("num: " + packNum);

    }

    public static int solution(int[] send, int[] cache, int packNum) {
        int length = send.length;
        int[] dp0 = new int[length + 1];
        int[] dp1 = new int[length + 1];
        int[] realCache = new int[length];
        dp0[0] = packNum;

        for (int i = 1; i < length; i++) {
            // 当前节点正常
            dp0[i] = Math.min(dp0[i - 1], send[i - 1]);
            realCache[i] = Math.min(dp0[i - 1] - dp0[i], cache[i - 1]);
//            dp1[i] = Math.min(dp1[i - 1], )

        }
        return 0;
    }

//    public static int solution(int[] send, int[] cache, int index, int packNum) {
//        int length = send.length;
//
        // 当前节点正常
//        int haveSent = Math.min(send[index], packNum);
//        int realCache = Math.min(packNum - haveSent, cache[index]);
//        if (realCache)
//        solution(send, cache, index + 1, packNum - )

//    }
}
