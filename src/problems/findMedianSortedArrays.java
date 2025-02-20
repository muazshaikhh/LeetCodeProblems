package problems;
import java.util.Arrays;

public class findMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] combined = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, combined, 0, nums1.length);
        System.arraycopy(nums2, 0, combined, nums1.length, nums2.length);
        Arrays.sort(combined);

        if (combined.length % 2 == 1) {

            int n = combined.length / 2;
            return combined[n];
        }

        int n = combined.length / 2;
        return (double) (combined[n - 1] + combined[n]) / 2;
    }
}
