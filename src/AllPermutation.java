import java.util.LinkedList;
import java.util.List;

public class AllPermutation {
    public static List<List<Integer>> res = new LinkedList<>();
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, 10};
        permute(nums);
        for (List<Integer> road : res) {
            System.out.println(road);
        }
    }

    public static void permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track);
    }

    public static void backtrack(int[] nums, LinkedList<Integer> track) {
        if (track.size() == nums.length) {
            res.add(new LinkedList(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) {
                continue;
            }

            track.add(nums[i]);
            backtrack(nums, track);
            track.removeLast();
        }
    }
}

