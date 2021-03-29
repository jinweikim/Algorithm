import java.io.*;

public class Kola {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("testKola.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                int num = Integer.parseInt(str);
                if (num == 0) {
                    break;
                }
                solution(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void solution(int num) {
        int totalNum = 0;
        if (num < 3) {
            System.out.println(0);
        }
        while(num >= 2) {
            if (num == 2) {
                totalNum += 1;
                break;
            }
            int buyNum = num / 3;
            int leftNum = num % 3 + buyNum;
            num = leftNum;
            totalNum += buyNum;
        }
        System.out.println(totalNum);
    }
}
