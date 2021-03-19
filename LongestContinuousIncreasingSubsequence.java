public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] agrs){
        int[] nums = {1,3,5,4,2,3,4,5};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums){
        int start = 0;
        int max_length = 0;
        for(int i=0;i<nums.length;i++) {
            if ( i > 0 && nums[i] <= nums[i - 1]) {
                start = i;
            }
            max_length = Math.max(max_length,i-start+1);
        }
        return max_length;
    }

}
