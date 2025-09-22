public class FirstAndLastElementOfTarget {
    public int[] searchRange(int[] nums, int target) {
        int low= 0;
        int high = nums.length-1;

        while(low <= high){
            //5,7,7,8,8,10 0 + 5 / 2 -> 3
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                System.out.println("Hi");
            }
            if(nums[mid] < target){
                low = mid + 1;
            }
        }

        return null;
    }
}
