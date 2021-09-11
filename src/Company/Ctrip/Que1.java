package Company.Ctrip;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Que1 {
    public static Deque<String> stack = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n + 1; i++) {
            String cmd = sc.nextLine();
            parse(cmd);
        }
    }

    public static void parse(String cmd) {
        if (cmd.equals("")) {
            return;
        }
        String pre = cmd.substring(0, 2);
        if (pre.equals("cd")) {
            String dir = cmd.substring(3);
            if (!dir.equals("..")) {
                stack.push(dir);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        } else {
            print();
        }
    }

    public static void print() {
        StringBuilder stringBuilder = new StringBuilder();
        if (stack.size() == 0) {
            System.out.println("\\");
            return;
        }
        Iterator iterator = stack.descendingIterator();
        while (iterator.hasNext()) {
            String ele = (String)iterator.next();
            stringBuilder.append("\\").append(ele);
        }
        System.out.println(stringBuilder.toString());
    }
}
