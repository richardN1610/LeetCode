public class BinarySearch {
    public int search(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length-1;

        while(leftPointer <= rightPointer){
            int middle = leftPointer + (rightPointer-leftPointer)/2;

            if(nums[middle] == target){
                return middle;
            }
            if(nums[middle] > target){
                rightPointer = middle-1;
            }else{
                leftPointer = middle+1;
            }

        }
        return -1;
    }
}
