import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String a = sc.next();
//            System.out.println(a);
//        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        int[] nums = {1, 5, 2, 10, 8};
        Arrays.sort(nums);
        for (int n : nums) {
            System.out.println(n);
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(10);
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(2);
        Collections.sort(list, Collections.reverseOrder());
        for (Integer n: list) {
            System.out.println(n);
        }
    }

}
