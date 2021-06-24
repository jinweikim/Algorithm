public class JZ66 {

    public int[] constructArr(int[] a) {
        int tmp = 1;
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                b[i] = tmp;
            } else {
                tmp *= a[i - 1];
                b[i] = tmp;
            }
        }
        tmp = 1;
        for (int i = a.length - 2; i >= 0; i--) {
            tmp *= a[i + 1];
            b[i] *= tmp;
        }
        return b;
    }
}
