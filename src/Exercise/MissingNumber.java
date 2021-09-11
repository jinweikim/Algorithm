package Exercise;

public class MissingNumber {

    public static void main(String[] args){
        int[] nums = {0,1,2,3,4,5,7};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums){
        int i = 0;
        int j = nums.length - 1;

        while( i <= j){
            int mid = (i + j) / 2;
            if( nums[mid] == mid){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return i;

    }
}
