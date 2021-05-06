public class JZ17 {
    int n = 0;
    char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    int[] res;
    int index = 0;
    int nine = 0;
    int start;
    public void printNumbers(int n) {
        this.n = n;
        start = n - 1;
        char[] num = new char[n];
        res = new int[(int)Math.pow(10, n) - 1];
        dfs(0, num);
        for (int i : res) {
            System.out.println(i);
        }
    }

    public void dfs(int x, char[] num) {
        if (x == n) {
            String str = String.valueOf(num).substring(start);
            if (!str.equals("0")) {
                res[index++] = Integer.parseInt(str);
            }
            if (n - start == nine) {
                start--;
            }
            return;
        }
        for (char c : digits) {
            if (c == '9') {
                nine++;
            }
            num[x] = c;
            dfs(x + 1, num);
        }
        nine--;

    }
}
