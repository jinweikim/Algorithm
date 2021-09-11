package Exercise;

public class XOR2 {

    // leetcode 1734
    public int[] decode(int[] encoded) {
        // 求出 perm 中全部元素异或结果, perm 中元素是 1 ~ permLength 的一种排列方式
        int total = 0;
        int permLength = encoded.length + 1;
        for (int i = 1; i <= permLength; i++) {
            total ^= i;
        }
        System.out.println("perm 全部元素异或结果" + total);
        // 利用 encode 求出 perm 中除了第一个元素的全部元素异或结果
        int totalExcept = 0;
        for (int i = 1; i < encoded.length; i = i + 2) {
            totalExcept ^= encoded[i];
        }
        System.out.println("perm 除了第一个元素的全部元素异或结果" + totalExcept);

        // 利用 total 与 totalExcept 求出 perm 第一个元素
        int[] perm = new int[permLength];
        perm[0] = total ^ totalExcept;
        // 利用 perm 第一个元素 与 encoded 依次构造 perm 剩余元素
        for (int i = 1; i < perm.length; i++) {
            perm[i] = perm[i - 1] ^ encoded[i - 1];
        }
        return perm;
    }
}
