public class jump_game_2 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        int ans = jump(arr);
        System.out.println(ans);

    }

    public static int jump(int[] nums) {

        int numStep = 0;
        int numToEnd =nums.length-1;
        for(int i = 0; i< nums.length;i++){
            if(numToEnd - nums[i] >= 0){
                numStep++;
                if(nums[i]  == numToEnd){
                    return numStep;
                }
                numToEnd--;
            }
        }

        return numStep;
    }
}
