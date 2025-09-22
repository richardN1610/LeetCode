public class MedianTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double sum = 0.0;
        double sum2 =0.0;
        for(int i : nums1){
            sum += i;
        }
        for(int j : nums1){
            sum2 += j;
        }

        return sum+sum2/(nums1.length+nums2.length);
    }
}
