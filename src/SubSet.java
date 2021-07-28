import java.util.ArrayList;
import java.util.List;

public class SubSet {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrace(nums, 0, new ArrayList<>());
        return ans;
    }

    public void backtrace(int[] nums, int index, ArrayList<Integer> set) {
        ans.add(new ArrayList<>(set));
        if (index == nums.length) {
            return;
        }

        for (int i = index; i < nums.length; i++) {
            set.add(nums[i]);
            backtrace(nums, i+1, set);
            set.remove(set.size() - 1);
        }
    }
}
