package facebook;

import java.util.Arrays;

public class IntersectSortedArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[nums1.length];
        int idx = 0;

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (i != 0 && nums1[i] == nums1[i-1]) {
                i++;
                continue;
            }
            int left  = nums1[i];
            int right = nums2[j];

            if(left  == right) {
                result[idx++] = nums1[i];
                i++;
                j++;
            } else if (left < right) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOf(result, idx);
    }
}
