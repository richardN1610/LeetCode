import java.util.*;

public class TopKElements {
    public static void main(String[] args) {
        //nums = [1,2,2,3,3,3], k = 2
        int[] nums ={1,2,2,3,3,3};
        int[] ans = topKFrequent(nums,2);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int num : nums){
            numMap.put(num, numMap.getOrDefault(num,0)+1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1]; //create a list of buckets to store all the possible frequencies
        //The reason for this is because several numbers might have the same number of frequency.
        for(Map.Entry<Integer,Integer> entry : numMap.entrySet()){
            int numFreq = entry.getValue();

            if(buckets[numFreq] == null){ //check if number of frequence already exist, if not then create a new bucket
                buckets[numFreq] = new ArrayList<>();
            }
            buckets[numFreq].add(entry.getKey()); //adding the actual number to its frequency -> eg 111 would map to freq 3 where the actual number is 1
        }

        int[] ans = new int[k];
        int index = 0;
        for(int i = buckets.length - 1; i >= 0 && index < k; i--){
            if(buckets[i] != null){ //check if any number has the matching frequency
                for(int num : buckets[i]) { //iterate through all the numbers in the frequency bucket, eg. 111, 333 go to the same buckets[3]
                    ans[index]  = num;
                    index++;
                    if (index== k){
                        return ans;
                    }
                }
            }
        }

        return ans;
    }
}
