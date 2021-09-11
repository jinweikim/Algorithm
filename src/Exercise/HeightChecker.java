package Exercise;

public class HeightChecker {

    public static void main(String[] args){
        int[] heights = {5,1,2,3,4};
        int result = solution(heights);
        System.out.println(result);
    }

    public static int solution(int[] nums){

        int[] map =  new int[101]; //哈希表保存每个数字出现的次数
        for( int i=0;i<nums.length;i++){
            map[nums[i]]++;
        }

        int count = 0;

        for( int i=1,j=0;i<map.length;i++){ //根据哈希表遍历原数组，如果出现数字不符合哈希表中的情况，需要计数+1，代表这个地方需要移动换位。
            while( map[i]-- > 0){
                if(nums[j++] !=  i){
                    count++;
                }
            }
        }
        return count;
    }
}
