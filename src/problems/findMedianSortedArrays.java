package problems;
import java.util.Arrays;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
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
