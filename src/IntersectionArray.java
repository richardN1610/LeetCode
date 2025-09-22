import java.util.*;

public class IntersectionArray {

    public static void main(String[] args) {
        int[][] arr = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        //int[][] arr = {{1,2,3,4,},{5,6,7,8}};
        intersection(arr);
    }
    public static List<Integer> intersection(int[][] nums) {
        Map<Integer,Integer> numMap = new HashMap<>();

        List<Integer> ans = new ArrayList<>();
        for (int[] num : nums) {
            for (int i : num) {
                numMap.put(i, numMap.getOrDefault(i, 0) + 1);
                if (numMap.get(i) == nums.length) {
                    ans.add(i);
                }
            }
        }
        Collections.sort(ans);


        //alternate faster solution
        int[] arr = new int[1001];


        return ans;
    }
}
