import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        //two pointers approach
        if (nums.length<3){
            return ans;
        }
        //sorting array
        Arrays.sort(nums);
        int leftPointer = 0;
        int rightPointer = nums.length -1;


        //if target > 0 move right pointer
        //if target < 0 move left pointer
        //[-1,0,1,2,-1,-4] before sort
        //after sort
        //[-4,-1,-1,-0,1,2]
         //i+j+k == 0
        for(int i = 0;i<nums.length-1;i++){
            //starting from the first index, -4
            int firstNum = nums[i];
            for(int j = 1; j<nums.length;j++){
                //2nd index which is the second element/pointer (-1)
                int secondNum = nums[i+1];
                int remainder = firstNum+secondNum;

            }
        }

        return ans;
    }
}
