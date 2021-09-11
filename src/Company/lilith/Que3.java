package Company.lilith;

public class Que3 {
    public static void main(String[] args) {
        int[] nums = {7, 5, 3, 6, 4, 2, 1};
        System.out.println(minimum(nums));
    }

    public static long minimum(int[] a) {
        long sum = count(a, 0, a.length - 1);
        long half = sum / 2;
        long partSum = 0;
        long firstPart = 0;
        long secondPart = 0;
        long finalPart = 0;
        for (int i = 0; i < a.length; i++) {
            partSum += a[i];
            if (partSum >= half) {
                firstPart = partSum -a[i];
                secondPart = partSum;
                if (Math.abs(firstPart - half) < Math.abs(secondPart - half)) {
                    finalPart = firstPart;
                } else {
                    finalPart = secondPart;
                }
                break;
            }
        }
        return Math.abs(half - finalPart);

    }

    public static long minimum1 (int[] a) {
        long sum = count(a, 0, a.length - 1);
        long min = Long.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            long firstPart = a[i];
            long secondPart = sum - firstPart;
            for (int j = i + 1; j < a.length; j++) {
                firstPart += a[j];
                secondPart -= a[j];
                long one = Math.abs(firstPart - secondPart);
                if (one < min) {
                    min = one;
//                    System.out.print("first: " + i + " ");
//                    System.out.print("second: " + j + " ");
//                    System.out.println("min: " + one);
                }
            }
        }
        return min;
    }

    public static long count(int[] nums, int first, int second) {
        long ans = 0;
        for (int i = first; i <= second; i++) {
            ans += nums[i];
        }
        return ans;
    }
}
