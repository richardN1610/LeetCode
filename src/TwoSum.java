import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,7,11,15};
		int target = 17;
		twoSum(nums, target);
	}
	
	//this is a BigO(n) also known as linear solution
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		//hasmap.get uses the key of the pair to return the value (the .get() method takes in the key as parameter)
		//example if the hashmap is (3,5) then .get(3) would return the value 5
//		Integer currentNum = hm.get(nums[0]);
		for(int i = 0; i<nums.length; i++) {
			//check to see if the value already exist in the map
			Integer currentNum = hm.get(nums[i]);
			if(currentNum!= null) {
				return new int[]{i,currentNum};
			}
			hm.put(target-nums[i],i);
		}
		return nums;
	}
}
