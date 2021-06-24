public class inverseNum {
    public int reverseNum(int paraNum){
        int res = 0;
        while (paraNum != 0) {
            int n = paraNum % 10;
            res = res * 10 + n;
            paraNum /= 10;
        }
        return res;
    }
}
