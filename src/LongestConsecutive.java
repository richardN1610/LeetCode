import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {0,6,5,4,3,2,1};
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        if(nums.length == 0){
            return 0;
        }


        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }
        int max = 1;
        for(Integer num : numSet){
            if(!numSet.contains(num-1)){ //only if the number doesnt contain previous number is the start of the sequence
                int currentNumber = num;
                int ans = 1;

                while(numSet.contains(currentNumber+1)){
                    ans++;
                    currentNumber++;
                }
                max = Math.max(max,ans);
            }
        }
        return max;
    }
}
