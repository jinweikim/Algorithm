package Exercise;

public class inverseNum {
    public int reverseNum(int paraNum){
        int res = 0;
        while (paraNum != 0) {
            int n = paraNum % 10;
            res = res * 10 + n;
            paraNum /= 10;
        }
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(2, 31) - 1);
        if (res > Integer.MAX_VALUE) {
            return 0;
        }
        return res;
    }
}
