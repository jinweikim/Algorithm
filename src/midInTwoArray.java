public class midInTwoArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mid = (nums1.length + nums2.length) / 2;
        boolean oddFlag = (nums1.length + nums2.length) % 2 == 1;
        int flag = 0;
        int cur1 = 0;
        int cur2 = 0;
        while (cur1 < nums1.length || cur2 < nums2.length) {
            if (cur1 >= nums1.length) {
                cur2++;
            }
            if (cur2 >= nums2.length) {
                cur2++;
            }
            if (nums1[cur1] < nums2[cur2]) {
                flag = 1;
                cur1++;
            } else if (nums1[cur1] == nums2[cur2]) {
                flag = 2;
                cur1++;
                cur2++;
            } else {
                flag = 3;
                cur2++;
            }
            if (flag == 2) {
                if ((cur1 + cur2) == mid) {
                    if (oddFlag) {
                        return (double)nums1[cur1 - 1];
                    } else {
                        return (double)(nums1[cur1] + nums2[cur2]) / 2;
                    }
                }
            } else {
                if ((cur1 + cur2) == mid) {
                    if (oddFlag) {
                        if (flag == 1) {
                            return (double)nums1[cur1 - 1];
                        } else {
                            return (double)nums2[cur2 - 1];
                        }
                    } else {
                        if (cur1 == 0) {
                            return (double)(nums1[cur1] + nums2[cur2 - 1]) / 2;
                        } else if (cur2 == 0) {
                            return (double)(nums1[cur1 - 1] + nums2[cur2]) / 2;
                        } else {
                            return (double)(nums1[cur1 - 1] + nums2[cur2 - 1]) / 2;
                        }
                    }
                }

            }
        }
        return 0;
    }
}
