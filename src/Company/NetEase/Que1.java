package Company.NetEase;

import java.util.Scanner;

public class Que1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groupNum = sc.nextInt();
        for (int i = 0; i < groupNum; i++) {
            int enemyNum = sc.nextInt();
            int attack = sc.nextInt();
            int guard =sc.nextInt();
            int[] enemyAttack = new int[enemyNum];
            int[] enemyGuard = new int[enemyNum];
            int[] enemyLife = new int[enemyNum];
            for (int j = 0; j <  enemyNum; j++) {
                enemyAttack[j] = sc.nextInt();
                enemyGuard[j] = sc.nextInt();
                enemyLife[j] = sc.nextInt();
            }
            int life = play(attack, guard, enemyAttack, enemyGuard, enemyLife);
            System.out.println(life);

        }
    }

    public static int play(int attack, int guard, int[] enemyAttack, int[] enemyGuard, int[] enemyLife) {

        int enemyNum = enemyAttack.length;
        int[] eA = copy(enemyAttack);
        int[] eG = copy(enemyGuard);
        int[] eL = copy(enemyLife);

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            enemyAttack = copy(eA);
            enemyGuard = copy(eG);
            enemyLife = copy(eL);
            int life = i;
            for (int j = 0; j < enemyNum; j++) {
                if (life <= 0) {
                    break;
                }
                while (enemyLife[j] > 0) {
                    int harm = attack - enemyGuard[j];
                    // 伤害为 0， 无论如何都无法通关
                    if (harm <= 0) {
                        return -1;
                    }
                    int left =  enemyLife[j] - harm;
                    if (left > 0) {
                        // 被攻击
                        int harmPlayer = enemyAttack[j] - guard;
                        if (harmPlayer < 0) {
                            harmPlayer = 0;
                        }
                        life -= harmPlayer;
                    } else if (left < 0) {
                        // 回血
                        life += -left;
                    }
                    enemyLife[j] = left;
                    if (life <= 0) {
                        break;
                    }
                }
            }
            if (life > 0) {
                return i;
            }
        }
        return -1;
    }

    public static int[] copy(int[] nums) {
        int[] newOne = new int[nums.length];
        System.arraycopy(nums, 0, newOne, 0, nums.length);
        return newOne;
    }
}
