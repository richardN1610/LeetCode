import java.util.HashMap;
import java.util.Map;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        //nums = [1,2,3,4,5,6,7], k = 3
        //[5,6,7,1,2,3,4]
        //using a hashmap to store index and value.
        //then iterate through the map and reassign the array

        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            int newIndex = (k+i)%nums.length;
            numMap.put(newIndex,nums[i]);
        }

        for(Map.Entry<Integer,Integer> entry : numMap.entrySet()){
            nums[entry.getKey()] = entry.getValue();
        }

        //FAster solution
        int n = nums.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }
        System.arraycopy(rotated, 0, nums, 0, n);
    }
}
