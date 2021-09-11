package Exercise;

public class Exam_07_18_01 {
    public int countArea(int[] A, int n) {
        int left = 0;
        int right = n - 1;
        int maxArea = 0;
        int indent = n / A.length;
        while (left < right) {
            maxArea = Math.max((Math.min(A[left], A[right]) * (right - left + 1)) * indent, maxArea);
            if (A[left] > A[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxArea;
    }

}
